package layout;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

import com.jungledev.anketa.MainActivity;
import com.jungledev.anketa.R;

import java.util.ArrayList;
import java.util.List;

import clases.Respuesta;


public class FragmentOne extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_one,container,false);
        //Button btn = (Button)view.findViewById(R.id.button_next);
        TextView txt = (TextView)view.findViewById(R.id.txtPreguntaUno);
        txt.setText(MainActivity.preguntas.get(1).getPregunta());
       // btn.setOnClickListener();
        RatingBar mBar = (RatingBar) view.findViewById(R.id.ratingBar1);

        mBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {

            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                Respuesta respuesta = new Respuesta(0,"");

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
                MainActivity.respuestas.put(0, respuesta);
                //((MainActivity)getActivity()).setCurrentItem(1, true);
                FragmentTransaction trans = getFragmentManager().beginTransaction();
                /*
                 * IMPORTANT: We use the "root frame" defined in
                 * "root_fragment.xml" as the reference to replace fragment
                 */
                trans.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE);
                trans.replace(R.id.root_frame, new FragmentTwo());

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

//    private class ButtonEvent implements View.OnClickListener
//    {
//
//        @Override
//        public void onClick(View v) {
//            // TODO Auto-generated method stub
//            RatingBar bar = (RatingBar) v;
//            System.out.println("value is " + bar.getRating());
//            ((MainActivity)getActivity()).setCurrentItem(1, true);
//        }
//    }
}
