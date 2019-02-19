package com.example.android.myfirstapplication.app;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.android.myfirstapplication.app.models.SampleModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MainListAdapter mainLstadapter = new MainListAdapter(this,getDataInList());

        final ListView listview = (ListView) findViewById(R.id.listview_n);
        listview.setAdapter(mainLstadapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, final View view, int position, long id) {
                final SampleModel item = (SampleModel) parent.getItemAtPosition(position);
                view.animate().setDuration(500).alpha(0).withEndAction(new Runnable() {
                    @Override
                    public void run() {
                        mainLstadapter.removeItem(item);
                        mainLstadapter.notifyDataSetChanged();
                        view.setAlpha(1);
                    }
                });
            }
        });
    }

    private ArrayList getDataInList() {
        String[] arr_title = new String[]{"one one one one one one one one",
                "two two two two two two two two two two ",
                "three three three three three three three three three ",
                "four four four four four four four four four four four ",
                "five five five five five five five five five five five ",
                "six six six six six six six six six six six six six ",
                "seven seven seven seven seven seven seven seven seven ",
                "eight eight eight eight eight eight eight eight eight ",
                "nine nine nine nine nine nine nine nine nine nine nine ",
                "ten ten ten ten ten ten ten ten ten ten ten ten ten "};

        String[] arr_subTitle = new String[]{"sub one sub one sub one sub one sub one sub one sub one sub one",
                "sub two sub two sub two sub two sub two sub two sub two sub two sub two sub two ",
                "sub three sub three sub three sub three sub three sub three sub three sub three sub three ",
                "sub 4 sub 4 sub 4 sub 4 sub 4 sub 4 sub 4 sub 4 sub 4 sub 4 sub 4 ",
                "sub 5 sub 5 sub 5 sub 5 sub 5 sub 5 sub 5 sub 5 sub 5 sub 5 sub 5 ",
                "sub 6 sub 6 sub 6 sub 6 sub 6 sub 6 sub 6 sub 6 sub 6 sub 6 sub 6 sub 6 sub 6 ",
                "sub 7 sub 7 sub 7 sub 7 sub 7 sub 7 sub 7 sub 7 sub 7 ",
                "sub 8 sub 8 sub 8 sub 8 sub 8 sub 8 sub 8 sub 8 sub 8 ",
                "sub 9 sub 9 sub 9 sub 9 sub 9 sub 9 sub 9 sub 9 sub 9 sub 9 sub 9 ",
                "sub 10 sub 10 sub 10 sub 10 sub 10 sub 10 sub 10 sub 10 sub 10 sub 10 sub 10 sub 10 sub 10 "};

        ArrayList myList = new ArrayList();

        for (int i = 0; i < arr_title.length; i++) {
            // Create a new object for each list item
            SampleModel smplMdl = new SampleModel();
            smplMdl.setTitle(arr_title[i]);
            smplMdl.setSubTitle(arr_subTitle[i]);
            smplMdl.setImgSrc(R.drawable.adidas);
            // Add this object into the ArrayList myList
            myList.add(smplMdl);
        }

        return myList;
    }

    private addingdev1(){

    }

    private addingdev2(){

    }

}
