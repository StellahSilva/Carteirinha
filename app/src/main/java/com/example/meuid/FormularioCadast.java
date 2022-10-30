package com.example.meuid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class FormularioCadast extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_cadast);

        getSupportActionBar().hide();
    }
}