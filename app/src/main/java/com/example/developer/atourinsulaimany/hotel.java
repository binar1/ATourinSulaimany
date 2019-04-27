package com.example.developer.atourinsulaimany;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by binar on 20/10/2017.
 */

public class hotel extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView= inflater.inflate(R.layout.hotel,container,false);
        ListView listitem=(ListView)rootView.findViewById(R.id.hotel);
        ArrayList <Item> item=new ArrayList<>();
        item.add(new Item(R.string.namehotel1,R.string.locationhotel1,R.mipmap.grandmil));
        item.add(new Item(R.string.namehotel2,R.string.locationhotel2,R.mipmap.palas));
        item.add(new Item(R.string.namehotel3,R.string.locationhotel3,R.mipmap.abusana));
        item.add(new Item(R.string.namehotel4,R.string.locationhotel4,R.mipmap.titanic));
        ArrayItemAdapter adapter=new ArrayItemAdapter(getContext(),R.layout.item_view,item);
        listitem.setAdapter(adapter);

        return rootView;
    }


}
