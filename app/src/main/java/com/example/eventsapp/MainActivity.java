package com.example.eventsapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.eventsapp.databinding.ActivityMainBinding;
import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    private List<MyEvents> myEventsList;
    private MyEventsAdapter myEventsAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);


        binding.idButtonShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_TEXT, "A new event");
                intent.setType("text/plain");
                startActivity(intent);
            }
        });


        binding.idButtonAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MyAccount.class);
                startActivity(intent);
            }
        });

        binding.idButtonChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MyChat.class);
                startActivity(intent);
            }
        });

        binding.idButtonFilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MyFilter.class);
                startActivity(intent);
            }
        });


        myEventsList = new  ArrayList<>();
        myEventsList.add(new MyEvents(R.drawable.event_background_01, R.drawable.event_avatar_01, "Drink with friends", "Anonce, indenfor 3 km"));
        myEventsList.add(new MyEvents(R.drawable.event_background_02, R.drawable.event_avatar_02, "Concert evening", "Anonce, indenfor 7 km"));
        myEventsList.add(new MyEvents(R.drawable.event_background_03, R.drawable.event_avatar_03, "Ice cream tour", "Anonce, indenfor 1 km"));
        myEventsList.add(new MyEvents(R.drawable.event_background_04, R.drawable.event_avatar_04, "christmas night", "Anonce, indenfor 14 km"));
        myEventsList.add(new MyEvents(R.drawable.event_background_05, R.drawable.event_avatar_05, "valentine day", "Anonce, indenfor 6 km"));

        myEventsAdapter = new MyEventsAdapter(this, myEventsList);
        binding.idViewpager2EventsView.setAdapter(myEventsAdapter);


    }

    public void ArrowBack(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}