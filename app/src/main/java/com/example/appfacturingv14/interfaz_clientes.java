package com.example.appfacturingv14;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class interfaz_clientes extends AppCompatActivity {
    private Button btnguardar,btnagregar,btnactualizar,btneliminar, btnlimpiar, btnbuscar;
    private EditText ID,Cedula,Telefono,Nombre,Apellido,Direccion,Email,Creacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interfaz_clientes);
        ID = (EditText) findViewById(R.id.txtNombre);
        Cedula = (EditText) findViewById(R.id.txtCedula);
        Telefono = (EditText) findViewById(R.id.txtTelefono);
        Nombre = (EditText) findViewById(R.id.txtNombre);
        Apellido = (EditText) findViewById(R.id.txtApellido);
        Direccion = (EditText) findViewById(R.id.txtDireccion);
        Email = (EditText) findViewById(R.id.txtEmail);
        Creacion = (EditText) findViewById(R.id.txtCreacion);

        //comentario22




        btnagregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ejecutarServico("http://192.168.10.5/formulario4A2021ii/insertardatos.php");
            }
        });
        btnbuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buscar("http://192.168.10.5/formulario4A2021ii/buscardatos.php?cedula="+cedula.getText()+"");
            }
        });
        btnactualizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                actualizar("http://192.168.10.5/formulario4A2021ii/actualizardatos.php?cedula="+cedula.getText()+"");
            }
        });
        btneliminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                borrar("http://192.168.10.5/formulario4A2021ii/borrardatos.php?cedula="+cedula.getText()+"");
            }
        });

    }
    }
