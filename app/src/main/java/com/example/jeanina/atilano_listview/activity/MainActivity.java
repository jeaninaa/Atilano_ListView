package com.example.jeanina.atilano_listview.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.jeanina.atilano_listview.R;
import com.example.jeanina.atilano_listview.model.college;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    String[] colleges;
    String[] year;
    int[] logos;

    ListView lv_Colleges;
    ArrayAdapter<String> adapter;
    List<college> l_college;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        l_college = new ArrayList<college>();
        year = getResources().getStringArray(R.array.Year);
        colleges = getResources().getStringArray(R.array.Colleges);
        lv_Colleges = (ListView) findViewById(R.id.lvColleges);
        adapter = new ArrayAdapter<String>(this, R.layout.row_layout, colleges);
        logos = new int[]{
                R.drawable.iics, R.drawable.archi,
                R.drawable.engg, R.drawable.educ,
                R.drawable.med
        };

        lv_Colleges.setAdapter(adapter);
        lv_Colleges.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String msg = "You selected " + colleges[i];
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
