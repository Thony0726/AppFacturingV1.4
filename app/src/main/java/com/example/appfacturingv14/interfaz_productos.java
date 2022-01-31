
package com.example.appfacturingv14;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class interfaz_productos extends AppCompatActivity {

    private Button btnguardar3,btnagregar3,btnactualizar3,btneliminar3, btnlimpiar3, btnbuscar3;
    private EditText ID,Nombre,Codigo,Unidad,Informacion,Observacion,Fecha;
    //RequestQueue requestQueue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interfaz_productos);
        ID = (EditText) findViewById(R.id.txtidproductos);
        Nombre = (EditText) findViewById(R.id.txtnombreproducto);
        Codigo = (EditText) findViewById(R.id.txtcodigoproducto);
        Unidad = (EditText) findViewById(R.id.txtunidadmedida);
        Informacion = (EditText) findViewById(R.id.txtinformacion);
        Observacion = (EditText) findViewById(R.id.txtobservacion);
        Fecha = (EditText) findViewById(R.id.txtfecha);
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

