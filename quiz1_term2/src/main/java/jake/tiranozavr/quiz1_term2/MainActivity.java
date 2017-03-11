package jake.tiranozavr.quiz1_term2;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    FragmentTransaction ft;
    Fragment fragA;
    Fragment fragB;
    Fragment fragC;
    String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        fragA = new FragmentA();
        fragB = new FragmentB();
        fragC = new FragmentC();
        ft = getFragmentManager().beginTransaction();
        ft.add(R.id.frameContainer, fragA);
        ft.commit();
    }
    public void changeFragment(int a) {
        ft = getFragmentManager().beginTransaction();
        switch (a){
            case 0:
                text = ((FragmentA)getFragmentManager().findFragmentById(R.id.frameContainer)).text.getText().toString();
                ft.replace(R.id.frameContainer, fragB);
                break;
            case 1:
                ft.replace(R.id.frameContainer, fragC);
                break;
        }
        ft.addToBackStack(null);
        ft.commit();
    }
    public String getString() {
        return text;
    }
}
