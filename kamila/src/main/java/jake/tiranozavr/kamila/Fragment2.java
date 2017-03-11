package jake.tiranozavr.kamila;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Fragment2 extends Fragment {
    ListView lv;
    ArrayList list;
    ArrayAdapter adapter;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View  v= inflater.inflate(R.layout.fragment_2, container, false);
        lv=(ListView)v.findViewById(R.id.lv);
        list=new ArrayList();
        return v;
    }

    public void update(String string){
        list.add(string);
        adapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1,list);
        lv.setAdapter(adapter);
    }

}
