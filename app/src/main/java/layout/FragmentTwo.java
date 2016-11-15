package layout;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

import com.jungledev.anketa.MainActivity;
import com.jungledev.anketa.R;

import clases.Respuesta;


public class FragmentTwo extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {


        View view = inflater.inflate(R.layout.fragment_two,container,false);



        TextView txt = (TextView)view.findViewById(R.id.txtPreguntaDos);
        txt.setText(MainActivity.preguntas.get(2).getPregunta());
        RatingBar mBar = (RatingBar) view.findViewById(R.id.ratingBar);

        mBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {

            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                Respuesta respuesta = new Respuesta(1,"");

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
                MainActivity.respuestas.put(1, respuesta);
                FragmentTransaction trans = getFragmentManager().beginTransaction();
                /*
                 * IMPORTANT: We use the "root frame" defined in
                 * "root_fragment.xml" as the reference to replace fragment
                 */
                trans.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE);
                trans.replace(R.id.root_frame, new FragmentThree());

                /*
                 * IMPORTANT: The following lines allow us to add the fragment
                 * to the stack and return to it later, by pressing back
                 */

                //trans.addToBackStack(null);

                trans.commit();
            }
        });
        return view;

    }

    private class ButtonEvent implements View.OnClickListener
    {

        @Override
        public void onClick(View v) {
            // TODO Auto-generated method stub
            ((MainActivity)getActivity()).setCurrentItem(2, true);

        }

    }

}
