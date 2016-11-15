package layout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.jungledev.anketa.MainActivity;
import com.jungledev.anketa.R;

import java.util.ArrayList;

import clases.Dicotomica;
import clases.Opcion;
import clases.Respuesta;
import clases.Sugerencia;

/**
 * Created by diego on 07/10/16.
 */
public class FragmentEleven extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_eleven, container, false);

        Button btn = (Button) view.findViewById(R.id.button);

        btn.setOnClickListener(new ButtonEvent());
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("/");

        Respuesta respuesta1 = (Respuesta) MainActivity.respuestas.get(0);
        myRef.child("pregunta_1").push().setValue(respuesta1);
        Respuesta respuesta2 = (Respuesta) MainActivity.respuestas.get(1);
        myRef.child("pregunta_2").push().setValue(respuesta2);
        Respuesta respuesta3= (Respuesta) MainActivity.respuestas.get(2);
        myRef.child("pregunta_3").push().setValue(respuesta3);
        Respuesta respuesta4 = (Respuesta)  MainActivity.respuestas.get(3);
        myRef.child("pregunta_4").push().setValue(respuesta4);
        Sugerencia sugerencia1 = (Sugerencia) MainActivity.respuestas.get(4);
        myRef.child("pregunta_5").push().setValue(sugerencia1);
        Dicotomica dicotomica1 = (Dicotomica) MainActivity.respuestas.get(5);
        myRef.child("pregunta_6").push().setValue(dicotomica1);
        ArrayList<Opcion> opciones1 = (ArrayList<Opcion>) MainActivity.respuestas.get(6);
        myRef.child("pregunta_7").push().setValue(opciones1);
        Sugerencia sugerencia2 = (Sugerencia) MainActivity.respuestas.get(7);
        myRef.child("pregunta_8").push().setValue(sugerencia2);
        ArrayList<Opcion> opciones2 = (ArrayList<Opcion>) MainActivity.respuestas.get(8);
        myRef.child("pregunta_9").push().setValue(opciones2);
        Sugerencia sugerencia3 = (Sugerencia) MainActivity.respuestas.get(9);
        myRef.child("pregunta_10").push().setValue(sugerencia3);
        Dicotomica dicotomica2 = (Dicotomica) MainActivity.respuestas.get(10);
        myRef.child("pregunta_11").push().setValue(dicotomica2);

        return view;

    }

    private class ButtonEvent implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            // TODO Auto-generated method stu
            ((MainActivity)getActivity()).setCurrentItem(0, true);
            FragmentTransaction trans = getFragmentManager().beginTransaction();
            /*
             * IMPORTANT: We use the "root frame" defined in
             * "root_fragment.xml" as the reference to replace fragment
             */
            trans.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE);
            trans.replace(R.id.root_frame, new FragmentOne());
            /*
             * IMPORTANT: The following lines allow us to add the fragment
             * to the stack and return to it later, by pressing back
             */

            //trans.addToBackStack(null);
            trans.commit();
        }

    }

}

