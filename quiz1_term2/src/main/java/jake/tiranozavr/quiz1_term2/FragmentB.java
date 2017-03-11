package jake.tiranozavr.quiz1_term2;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Admin on 11.02.2017.
 */
public class FragmentB extends Fragment {

    TextView tv;
    Button goThree;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment2, null);
        tv = (TextView) v.findViewById(R.id.tv);
        goThree = (Button) v.findViewById(R.id.goThree);
        tv.setText(((MainActivity)getActivity()).getString());
        goThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).changeFragment(1);
            }
        });

        return v;
    }
}
