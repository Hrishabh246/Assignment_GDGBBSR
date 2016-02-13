package com.example.inova.assignment;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<fam> myfamily = new ArrayList<fam>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        populatefam();
        populatelistview();
            }


    private void populatefam() {

        myfamily.add(new fam("Nita Nandi", "Mother", R.drawable.mom));
        myfamily.add(new fam("Jagdish Chandra Jha", "Father", R.drawable.dad));
        myfamily.add(new fam("Arun Kumar Nandi", "Maternal Grand Father", R.drawable.dadu));
    }



    private void populatelistview() {
        ArrayAdapter<fam> adapter = new MylistAdapter();
        ListView list = (ListView) findViewById(R.id.familylist);
        list.setAdapter(adapter);

    }

    private  class MylistAdapter extends ArrayAdapter<fam>{

        public MylistAdapter(){
            super(MainActivity.this,R.layout.item_view,myfamily);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View itemview = convertView;
            if  (itemview == null){
                itemview = getLayoutInflater().inflate(R.layout.item_view,parent,false);
            }
            fam currentfam = myfamily.get(position);
            ImageView imageView = (ImageView)itemview.findViewById(R.id.item_imageView);
            imageView.setImageResource(currentfam.getImg_ID());

            TextView maketext =(TextView) itemview.findViewById(R.id.item_textView);
            maketext.setText(currentfam.getNanme());

            TextView reltext =(TextView) itemview.findViewById(R.id.item_rel);
            reltext.setText(currentfam.getRel());

            return itemview;
            //return super.getView(position, convertView, parent);
        }
    }
}



