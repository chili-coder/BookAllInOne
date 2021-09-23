package com.sohaghlab.bookallinone.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ExpandableListView;

import com.sohaghlab.bookallinone.R;
import com.sohaghlab.bookallinone.adapter.CastomAdapter;
import com.sohaghlab.bookallinone.model.Chapter;
import com.sohaghlab.bookallinone.model.Topic;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ExpandableListView expandableListView;
    CastomAdapter customadapter;

    List<Chapter>chapterList;
    List<Topic>topicList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        expandableListView=(ExpandableListView)findViewById(R.id.expandableListView);

        addData();

    }



   private void addData() {
//single time
        chapterList=new ArrayList<>();
        //multipale time

       //chapter 1
        topicList=new ArrayList<>();
        topicList.add(new Topic("Bangla 1st",""));
        topicList.add(new Topic("English 1st",""));
        topicList.add(new Topic("Math 1st",""));
        topicList.add(new Topic("ICt",""));
        topicList.add(new Topic("Islam",""));
        chapterList.add(new Chapter("class Ten",topicList));


      //chapter 2
       topicList=new ArrayList<>();
       topicList.add(new Topic("Aramic 1st",""));
       topicList.add(new Topic("English 2nd",""));
       topicList.add(new Topic("Math 2nd",""));
       topicList.add(new Topic("ICt",""));
       topicList.add(new Topic("Islam",""));
       chapterList.add(new Chapter(" class nine",topicList));

       sendData();
   }

    private void sendData() {
        customadapter= new CastomAdapter(chapterList,MainActivity.this);
        expandableListView.setAdapter(customadapter);
    }
}