package com.example.eventsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ViewPager2 viewpager2_events_view;
    List<MyEvents> myEventsList;
    MyEventsAdapter myEventsAdapter;

    MaterialButton materialButton;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewpager2_events_view = findViewById(R.id.id_viewpager2_events_view);
        materialButton = findViewById(R.id.id_button_materialbutton);
        textView = findViewById(R.id.id_text_view);

        myEventsList = new  ArrayList<>();
        myEventsList.add(new MyEvents(R.drawable.event1, "Event 1", "10"));
        myEventsList.add(new MyEvents(R.drawable.event2, "Event 2", "20"));
        myEventsList.add(new MyEvents(R.drawable.event3, "Event 3", "30"));

        myEventsAdapter = new MyEventsAdapter(this, myEventsList);
        viewpager2_events_view.setAdapter(myEventsAdapter);


    }
}