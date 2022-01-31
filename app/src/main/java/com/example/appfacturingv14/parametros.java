package com.example.appfacturingv14;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class parametros extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parametros);
    }

    public void parametros(View view) {
        Intent i = new Intent(this, parametros.class);
        startActivity(i);
    }

    public void home(View view) {
        Intent i = new Intent(this, interfaz_home.class);
        startActivity(i);
    }

    public void clientes(View view) {
        Intent i = new Intent(this, interfaz_clientes.class);
        startActivity(i);
    }

    public void empleados(View view) {
        Intent i = new Intent(this, interfaz_empleados.class);
        startActivity(i);
    }

    public void proveedores(View view) {
        Intent i = new Intent(this, interfaz_home.class);
        startActivity(i);
    }

    public void productos(View view) {
        Intent i = new Intent(this,interfaz_productos.class);
        startActivity(i);
    }

    public void inventario(View view) {
        Intent i = new Intent(this, interfaz_inventario.class);
        startActivity(i);
    }

}