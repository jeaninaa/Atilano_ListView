package com.example.jeanina.atilano_listview.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.jeanina.atilano_listview.R;
import com.example.jeanina.atilano_listview.model.college;

import java.util.List;


/**
 * Created by Jeanina on 07/09/2017.
 */

public class CustomAdapter extends BaseAdapter {

    Context c;
    List<college> colleges;
    ImageView iv_Logo;
    TextView tv_Name, tv_Year;

    @Override
    public int getCount() {
        return colleges.size();
    }

    @Override
    public Object getItem(int i) {
        return colleges.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = View.inflate(c, R.layout.row_layout, null);
        iv_Logo = (ImageView) v.findViewById(R.id.ivLogo);
        tv_Name = (TextView) v.findViewById(R.id.tvName);
        tv_Year = (TextView) v.findViewById(R.id.tvYear);

        iv_Logo.setImageResource(colleges.get(i).getLogo());
        tv_Name.setText(colleges.get(i).getName());
        tv_Year.setText(colleges.get(i).getYear());

        return null;
    }
}
