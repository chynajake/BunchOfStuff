package jake.tiranozavr.quiz1_term2;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Admin on 11.02.2017.
 */
public class FragmentA extends Fragment {

    EditText text;
    Button goTwo;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment1, null);
        text = (EditText) v.findViewById(R.id.textET);
        goTwo = (Button) v.findViewById(R.id.goTwo);

        goTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).changeFragment(0);
            }
        });
        return v;
    }
//    protected Dialog onCreateDialog(int id) {
//        if(id == 1) {
//            AlertDialog.Builder adb = new AlertDialog.Builder(getActivity());
//            adb.setTitle("Go to Two");
//            adb.setMessage("Really?");
//            adb.setIcon(android.R.drawable.ic_dialog_info);
//            adb.setPositiveButton("Yes", myClickListener);
//            adb.setNegativeButton("No", myClickListener);
//            adb.setNeutralButton("Cancel", myClickListener);
//            adb.create();
//        }
//        return super.onCreateDialog(id);
//    }
//    View.OnClickListener myClickListener = new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            switch(which)
//        }
//    }
}

