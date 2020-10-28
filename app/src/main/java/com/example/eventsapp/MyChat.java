package com.example.eventsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.eventsapp.databinding.ActivityMyChatBinding;

public class MyChat extends AppCompatActivity {
    private ActivityMyChatBinding binding;
    private MyChatFragment myChatFragment;
    private  MyFavoriteFragment myFavoriteFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_chat);

        binding = ActivityMyChatBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.backArrowChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyChat.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        setSupportActionBar(binding.idToolBar);
        myChatFragment = new MyChatFragment();
        myFavoriteFragment = new MyFavoriteFragment();


        binding.idTabLayout.setupWithViewPager(binding.idViewPager);
        MyChatViewPagerAdapter myChatViewPagerAdapter = new MyChatViewPagerAdapter(getSupportFragmentManager(), 0);


        myChatViewPagerAdapter.addFragment(myChatFragment, "");
        myChatViewPagerAdapter.addFragment(myFavoriteFragment, "");

        binding.idViewPager.setAdapter(myChatViewPagerAdapter);

        binding.idTabLayout.getTabAt(0).setIcon(R.drawable.ic_baseline_chat_24);
        binding.idTabLayout.getTabAt(1).setIcon(R.drawable.ic_baseline_favorite_24);


    }
}