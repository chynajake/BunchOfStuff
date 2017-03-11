package jake.tiranozavr.task2_term2;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

/**
 * Created by Admin on 10.02.2017.
 */
public class FragmentStuff extends Fragment {

    Button btnA, btnB, btnC;
    Button btnAdd;
    EditText et;
    Spinner date;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragmentstuff, null);
        btnA = (Button) v.findViewById(R.id.btnA);
        btnB = (Button) v.findViewById(R.id.btnB);
        btnC = (Button) v.findViewById(R.id.btnC);
        btnAdd = (Button) v.findViewById(R.id.btnAdd);
        et = (EditText) v.findViewById(R.id.et);
        date = (Spinner) v.findViewById(R.id.date);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).refresh(null);
            }
        });


        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).fragmentChange(btnA.getText().toString());
            }
        });
        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).fragmentChange(btnB.getText().toString());
            }
        });
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).fragmentChange(btnC.getText().toString());
            }
        });
        return v;
    }
}
