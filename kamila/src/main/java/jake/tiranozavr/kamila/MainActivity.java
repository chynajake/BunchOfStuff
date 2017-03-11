package jake.tiranozavr.kamila;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {
    Fragment1 frag1;
    Fragment frag2;
    FragmentTransaction fragmentTransaction;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        frag1=new Fragment1();
        frag2=new Fragment2();

        fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.fl,frag2);
        fragmentTransaction.commit();

    }
    public void sendStringFR2(String string){
        Fragment2 fg = (Fragment2)getFragmentManager().findFragmentById(R.id.fl);
        fg.update(string);




    }
}
