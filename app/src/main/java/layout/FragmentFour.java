package layout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;

import com.jungledev.anketa.MainActivity;
import com.jungledev.anketa.R;

import clases.Respuesta;
import clases.Sugerencia;

/**
 * Created by diego on 07/10/16.
 */
public class FragmentFour extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {

        View view = inflater.inflate(R.layout.fragment_four,container,false);
        Button btn = (Button)view.findViewById(R.id.button_next);
        btn.setOnClickListener(new ButtonEvent());
        TextView txt = (TextView)view.findViewById(R.id.txtPreguntaCuatro);
        txt.setText(MainActivity.preguntas.get(4).getPregunta());
        TextView txt1 = (TextView)view.findViewById(R.id.txtPreguntaCinco);
        txt1.setText(MainActivity.preguntas.get(5).getPregunta());
        RatingBar mBar = (RatingBar) view.findViewById(R.id.ratingBar4);
        mBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {

                Respuesta respuesta = new Respuesta(3, "");
                switch (((Float)ratingBar.getRating()).intValue()){
                    case 1:
                        respuesta.setCalificacion(MainActivity.Demarcacion.MALO.toString());
                        break;
                    case 2:
                        respuesta.setCalificacion(MainActivity.Demarcacion.REGULAR.toString());
                        break;
                    case 3:
                        respuesta.setCalificacion(MainActivity.Demarcacion.BUENO.toString());
                        break;
                    case 4:
                        respuesta.setCalificacion(MainActivity.Demarcacion.MUY_BUENO.toString());
                        break;
                    case 5:
                        respuesta.setCalificacion(MainActivity.Demarcacion.EXCELENTE.toString());
                        break;
                }

                MainActivity.respuestas.put(3, respuesta);
            }
        });

        return view;

    }

    private class ButtonEvent implements View.OnClickListener
    {

        @Override
        public void onClick(View v) {
            // TODO Auto-generated method stub

            EditText editText2 =(EditText) getActivity().findViewById(R.id.editText2);
            Sugerencia respuesta = new Sugerencia(0,editText2.getText().toString());
            MainActivity.respuestas.put(4, respuesta);
            FragmentTransaction trans = getFragmentManager().beginTransaction();
                /*
                 * IMPORTANT: We use the "root frame" defined in
                 * "root_fragment.xml" as the reference to replace fragment
                 */
            trans.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE);
            trans.replace(R.id.root_frame, new FragmentFive());

                /*
                 * IMPORTANT: The following lines allow us to add the fragment
                 * to the stack and return to it later, by pressing back
                 */

            //trans.addToBackStack(null);

            trans.commit();

        }

    }

}