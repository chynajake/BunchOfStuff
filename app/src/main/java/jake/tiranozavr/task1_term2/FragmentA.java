package jake.tiranozavr.task1_term2;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class FragmentA extends Fragment {

    final String LOG_TAG = "myLogs";

    EditText name;
    Button btn;

    public interface onAddEventListener {
        public void addEvent(String s);
    }

    onAddEventListener addEventListener;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            addEventListener = (onAddEventListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString() + " must implement onAddEventListener");
        }
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d(LOG_TAG, "Fragment1 onCreateView");


        View v = inflater.inflate(R.layout.fragment1, null);

        name = (EditText) v.findViewById(R.id.nameET);
        btn = (Button) v.findViewById(R.id.addPerson);
        Log.d("BUTTON_EXIST", btn.getText().toString());
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                FragmentB fb = new FragmentB();
                Log.d("MYARRAY", fb.getData()+"");
                addEventListener.addEvent(name.getText().toString());
                name.setText("");
            }
        });

        return v;
    }




    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(LOG_TAG, "Fragment1 onCreate");
    }

}
