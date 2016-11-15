package layout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jungledev.anketa.R;

/**
 * Created by diego on 11/11/16.
 */
public class RootFragment  extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.root_fragment, container, false);

        FragmentTransaction transaction = getFragmentManager().beginTransaction();

    /*
     * When this container fragment is created, we fill it with our first
     * "real" fragment
     */
        transaction.replace(R.id.root_frame, new FragmentOne());

        transaction.commit();

        return view;
    }
}