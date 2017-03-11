package jake.tiranozavr.task2_term2;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    FragmentTransaction transaction;
    Fragment fragA;
    Fragment fragB;
    Fragment fragC;
    int phase = 0;

    public static ArrayList<Map<String,Object>> data;
    public static Map<String, Object> m;
    public static SimpleAdapter sAdapter;

    final String ATTRIBUTE_TEXT = "text";
    final String ATTRIBUTE_DATE = "date";

    String [] from = { ATTRIBUTE_TEXT, ATTRIBUTE_DATE };
    int [] to = { R.id.item_data, R.id.item_date };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        fragA = new FragmentA();
        fragB = new FragmentB();
        fragC = new FragmentC();
        data = new ArrayList<>();
        transaction = getFragmentManager().beginTransaction();
        transaction.add(R.id.fragmentCont, fragA);
        transaction.commit();
    }
    public void fragmentChange(String butt){
        transaction = getFragmentManager().beginTransaction();
        switch(butt){
            case "A":
                transaction.replace(R.id.fragmentCont, fragA);
                phase = 0;
                break;
            case "B":
                transaction.replace(R.id.fragmentCont, fragB);
                phase = 1;
                break;
            case "C":
                transaction.replace(R.id.fragmentCont, fragC);
                phase = 2;
                break;
        }
        transaction.commit();
        refresh(null);
    }

    public void refresh(View view) {
        String etext = ((FragmentStuff)getFragmentManager().findFragmentById(R.id.fragmentStuff)).et.getText().toString();
        Log.d("MYLOGS", etext);
        if(etext != "" || view != null){
            Log.d("MYLOGS_INSIDE", etext);
            m = new HashMap<>();
            m.put(ATTRIBUTE_TEXT, etext);
            m.put(ATTRIBUTE_DATE, "12 June 3017");
            data.add(m);
        }
        sAdapter = new SimpleAdapter(this, data, R.layout.item, from, to);
        if(phase == 0){
            ((FragmentA) getFragmentManager().findFragmentById(R.id.fragmentCont)).lvA.setAdapter(sAdapter);
        } else if(phase ==1) {
            ((FragmentB)getFragmentManager().findFragmentById(R.id.fragmentCont)).lvB.setAdapter(sAdapter);
        } else if(phase == 2) {
            ((FragmentC)getFragmentManager().findFragmentById(R.id.fragmentCont)).lvC.setAdapter(sAdapter);
        }
        ((FragmentStuff)getFragmentManager().findFragmentById(R.id.fragmentStuff)).et.setText("");
    }
}

