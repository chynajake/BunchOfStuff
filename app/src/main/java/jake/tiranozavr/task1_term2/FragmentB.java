package jake.tiranozavr.task1_term2;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.zip.Inflater;

public class FragmentB extends Fragment {

    ListView peopleLV;
    TextView temp;
    public static ArrayList<String> data;
    public static ArrayAdapter aAdapter;
    final String LOG_TAG = "myLogs";


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d(LOG_TAG, "Fragment2 onCreateView");
        View v = inflater.inflate(R.layout.fragment2, null);

        temp = (TextView) v.findViewById(R.id.temporary);
        peopleLV = (ListView) v.findViewById(R.id.peopleList);
        data = new ArrayList<>();

        return v;
    }

    public void refresh(View view) {
        Log.d("STRING_OF_TEXT", temp.getText().toString());
        if(temp.getText().toString() != "") {
            data.add(temp.getText().toString());
        }
        temp.setText("");
        aAdapter = new ArrayAdapter<String>(getActivity(),
                R.layout.my_list_item, Arrays.copyOf(data.toArray(), data.toArray().length, String[].class));
        peopleLV.setAdapter(aAdapter);
        aAdapter.notifyDataSetChanged();

    }
    public ArrayList<String> getData() {
        return data;
    }





    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(LOG_TAG, "Fragment2 onCreate");
    }

}
