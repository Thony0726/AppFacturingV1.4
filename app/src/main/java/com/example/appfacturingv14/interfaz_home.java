package com.example.appfacturingv14;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class interfaz_home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interfaz_home);
    }
    public void parametros(View view) {
        Intent i = new Intent(this, parametros.class);
        startActivity(i);
    }

    public void home(View view) {
        Intent i = new Intent(this, interfaz_home.class);
        startActivity(i);
    }
}