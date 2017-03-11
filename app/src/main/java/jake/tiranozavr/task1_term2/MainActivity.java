package jake.tiranozavr.task1_term2;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements FragmentA.onAddEventListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void addEvent(String s) {
        FragmentB fragB = (FragmentB) getFragmentManager().findFragmentById(R.id.fragmentB);
        ((TextView)fragB.getView().findViewById(R.id.temporary)).setText(s);
        fragB.refresh(null);

    }

}
