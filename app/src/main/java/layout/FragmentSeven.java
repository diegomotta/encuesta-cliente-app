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

import clases.Sugerencia;

/**
 * Created by diego on 07/10/16.
 */
public class FragmentSeven extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_seven,container,false);
        Button btn = (Button)view.findViewById(R.id.button_next);
        btn.setOnClickListener(new ButtonEvent());
        TextView txt = (TextView)view.findViewById(R.id.txtPreguntaOcho);
        txt.setText(MainActivity.preguntas.get(8).getPregunta());


        return view;

    }

    private class ButtonEvent implements View.OnClickListener
    {

        @Override
        public void onClick(View v) {
            // TODO Auto-generated method stub
            EditText editText3 = (EditText) getActivity().findViewById(R.id.editText3);

            MainActivity.respuestas.put(7, new Sugerencia(1, editText3.getText().toString()));

            FragmentTransaction trans = getFragmentManager().beginTransaction();
                /*
                 * IMPORTANT: We use the "root frame" defined in
                 * "root_fragment.xml" as the reference to replace fragment
                 */
            trans.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE);
            trans.replace(R.id.root_frame, new FragmentEight());

                /*
                 * IMPORTANT: The following lines allow us to add the fragment
                 * to the stack and return to it later, by pressing back
                 */

            //trans.addToBackStack(null);

            trans.commit();

        }

    }
}