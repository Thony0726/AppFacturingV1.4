package com.example.appfacturingv14;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class interfaz_empleados extends AppCompatActivity {
    private Button btnguardar1,btnagregar1,btnactualizar1,btneliminar1, btnlimpiar1, btnbuscar1;
    private EditText ID,Cedula,Telefono,Cargo,Nombre,Apellido,Direccion,Email;
    //RequestQueue requestQueue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interfaz_empleados);
        ID = (EditText) findViewById(R.id.txtnombre);
        Cedula = (EditText) findViewById(R.id.txtCedula);
        Telefono = (EditText) findViewById(R.id.txttelefono);
        Cargo = (EditText) findViewById(R.id.txtcargo);
        Nombre = (EditText) findViewById(R.id.txtnombre);
        Apellido = (EditText) findViewById(R.id.txtapellido);
        Direccion = (EditText) findViewById(R.id.txtdireccion);
        Email = (EditText) findViewById(R.id.txtemail);

    }



}