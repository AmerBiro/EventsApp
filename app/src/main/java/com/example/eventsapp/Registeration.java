package com.example.eventsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import com.example.eventsapp.databinding.ActivityRegisterationBinding;

public class Registeration extends AppCompatActivity {
    private ActivityRegisterationBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registeration);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);



        binding = ActivityRegisterationBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.idButtonRegisterationFloaterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Registeration.this, Sign_Up.class);
                startActivity(intent);
            }
        });

        binding.idButtonRegisterationSignGuest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Registeration.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}