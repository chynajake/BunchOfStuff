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
public class FragmentC extends Fragment {
    ListView lvC;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment3, null);
        lvC = (ListView) v.findViewById(R.id.lvC);

        return v;
    }
}
