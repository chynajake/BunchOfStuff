package jake.tiranozavr.task2_term2;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

/**
 * Created by Admin on 10.02.2017.
 */
public class FragmentB extends Fragment {
    ListView lvB;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment2, null);
        lvB = (ListView) v.findViewById(R.id.lvB);

        return v;
    }
}
