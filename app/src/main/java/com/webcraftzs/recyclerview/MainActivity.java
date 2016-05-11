package com.webcraftzs.recyclerview;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        ItemData itemsData[] = { new ItemData("Help",R.drawable.ic_launcher),
                new ItemData("Delete",R.drawable.ic_launcher),
                new ItemData("Cloud",R.drawable.ic_launcher),
                new ItemData("Favorite",R.drawable.ic_launcher),
                new ItemData("Like",R.drawable.ic_launcher),
                new ItemData("Rating",R.drawable.ic_launcher)};

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        MyAdapter mAdapter = new MyAdapter(itemsData);
        recyclerView.setAdapter(mAdapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

    }
}