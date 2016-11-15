package layout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.jungledev.anketa.MainActivity;
import com.jungledev.anketa.R;

/**
 * Created by diego on 07/10/16.
 */
public class FragmentTwelve extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_twelve, container, false);


        Button btn = (Button) view.findViewById(R.id.button_next);

        btn.setOnClickListener(new ButtonEvent());
        return view;

    }

    private class ButtonEvent implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            // TODO Auto-generated method stub
            ((MainActivity)getActivity()).setCurrentItem(0, true);

        }

    }
}