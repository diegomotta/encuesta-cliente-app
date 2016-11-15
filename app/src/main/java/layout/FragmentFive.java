package layout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.TextView;

import com.jungledev.anketa.MainActivity;
import com.jungledev.anketa.R;

import clases.Dicotomica;

/**
 * Created by diego on 07/10/16.
 */
public class FragmentFive extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {


        View view = inflater.inflate(R.layout.fragment_five,container,false);


        Button btn = (Button)view.findViewById(R.id.button_next);

        btn.setOnClickListener(new ButtonEvent());

        TextView txt = (TextView)view.findViewById(R.id.txtPreguntaSeis);
        txt.setText(MainActivity.preguntas.get(6).getPregunta());


        return view;

    }

    private class ButtonEvent implements View.OnClickListener
    {

        @Override
        public void onClick(View v) {
            // TODO Auto-generated method stub
            Dicotomica dicotomica = new Dicotomica(0,"");
            RadioButton radioButton  = (RadioButton) getActivity().findViewById(R.id.radioButton);
            RadioButton radioButton1  = (RadioButton) getActivity().findViewById(R.id.radioButton2);
            if(radioButton.isChecked()){
               dicotomica.setRespuesta("Si");
            }
            else if(radioButton1.isChecked()){
                dicotomica.setRespuesta("No");
            }
            MainActivity.respuestas.put(5, dicotomica);
            FragmentTransaction trans = getFragmentManager().beginTransaction();
                /*
                 * IMPORTANT: We use the "root frame" defined in
                 * "root_fragment.xml" as the reference to replace fragment
                 */
            trans.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE);
            trans.replace(R.id.root_frame, new FragmentSix());

                /*
                 * IMPORTANT: The following lines allow us to add the fragment
                 * to the stack and return to it later, by pressing back
                 */

            //trans.addToBackStack(null);

            trans.commit();

        }

    }

}