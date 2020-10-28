package com.example.eventsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.eventsapp.databinding.ActivityMyAccountBinding;

public class MyAccount extends AppCompatActivity {
    private ActivityMyAccountBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_account);



        binding = ActivityMyAccountBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.backArrowAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyAccount.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }


}

