package layout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import com.jungledev.anketa.MainActivity;
import com.jungledev.anketa.R;

import java.util.ArrayList;

import clases.Opcion;

/**
 * Created by diego on 07/10/16.
 */
public class FragmentEight  extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_eight,container,false);
        Button btn = (Button)view.findViewById(R.id.button_next);
        btn.setOnClickListener(new ButtonEvent());
        TextView txt = (TextView)view.findViewById(R.id.txtPreguntaNueve);
        txt.setText(MainActivity.preguntas.get(9).getPregunta());
        return view;
    }

    private class ButtonEvent implements View.OnClickListener
    {

        @Override
        public void onClick(View v) {
            // TODO Auto-generated method stub
            ArrayList<Opcion> opciones = new ArrayList<>();
            CheckBox checkBox_1 = (CheckBox) getActivity().findViewById(R.id.checkBox);
            if (checkBox_1.isChecked()){
                opciones.add(new Opcion(0,checkBox_1.getText().toString()));
            }
            CheckBox checkBox_2 = (CheckBox) getActivity().findViewById(R.id.checkBox2);
            if (checkBox_2.isChecked()){
                opciones.add(new Opcion(1,checkBox_2.getText().toString()));
            }
            CheckBox checkBox_3 = (CheckBox) getActivity().findViewById(R.id.checkBox3);
            if (checkBox_3.isChecked()){
                opciones.add(new Opcion(2,checkBox_3.getText().toString()));
            }
            CheckBox checkBox_4 = (CheckBox) getActivity().findViewById(R.id.checkBox4);
            if (checkBox_4.isChecked()){
                opciones.add(new Opcion(3,checkBox_4.getText().toString()));
            }
            CheckBox checkBox_5 = (CheckBox) getActivity().findViewById(R.id.checkBox5);
            if (checkBox_5.isChecked()){
                opciones.add(new Opcion(4,checkBox_5.getText().toString()));
            }
            CheckBox checkBox_6 = (CheckBox) getActivity().findViewById(R.id.checkBox6);
            if (checkBox_6.isChecked()){
                opciones.add(new Opcion(5,checkBox_6.getText().toString()));
            }
            CheckBox checkBox_7 = (CheckBox) getActivity().findViewById(R.id.checkBox7);
            if (checkBox_7.isChecked()){
                opciones.add(new Opcion(6,checkBox_7.getText().toString()));
            }
            CheckBox checkBox_8 = (CheckBox) getActivity().findViewById(R.id.checkBox8);
            if (checkBox_8.isChecked()){
                opciones.add(new Opcion(7,checkBox_8.getText().toString()));
            }
            CheckBox checkBox_9 = (CheckBox) getActivity().findViewById(R.id.checkBox9);
            if (checkBox_9.isChecked()){
                opciones.add(new Opcion(8,checkBox_9.getText().toString()));
            }
            MainActivity.respuestas.put(8, opciones);
            FragmentTransaction trans = getFragmentManager().beginTransaction();
                /*
                 * IMPORTANT: We use the "root frame" defined in
                 * "root_fragment.xml" as the reference to replace fragment
                 */
            trans.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE);
            trans.replace(R.id.root_frame, new FragmentNine());

                /*
                 * IMPORTANT: The following lines allow us to add the fragment
                 * to the stack and return to it later, by pressing back
                 */

            //trans.addToBackStack(null);

            trans.commit();

        }

    }
}