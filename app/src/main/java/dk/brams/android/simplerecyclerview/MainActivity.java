package dk.brams.android.simplerecyclerview;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    private RecyclerView mRecyclerView;
    private MyViewAdapter myViewAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mRecyclerView = (RecyclerView) findViewById(R.id.drawer_list);
        myViewAdapter = new MyViewAdapter(this, getData());
        mRecyclerView.setAdapter(myViewAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

    }


    private static List<Information>  getData() {
        int[] idList= {R.drawable.ic_stat_1, R.drawable.ic_stat_2, R.drawable.ic_stat_3, R.drawable.ic_stat_4};

        List<Information> data = new ArrayList<>();

        for (int i = 0; i < idList.length; i++) {
            for (int j = 0; j < 10; j++) {
                String myString = "Item " + (i*10+j);
                Information info = new Information(idList[i], myString);
                data.add(info);
            }
        }

        return data;
    }
}
