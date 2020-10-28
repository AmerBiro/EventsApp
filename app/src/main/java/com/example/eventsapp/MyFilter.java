package com.example.eventsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.eventsapp.databinding.ActivityMyFilterBinding;

public class MyFilter extends AppCompatActivity {
    private ActivityMyFilterBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_filter);



        binding = ActivityMyFilterBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.backArrowFilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyFilter.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}