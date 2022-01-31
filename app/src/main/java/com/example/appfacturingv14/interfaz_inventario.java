
package com.example.appfacturingv14;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class interfaz_inventario extends AppCompatActivity {
    private Button btnguardar2, btnagregar2, btnactualizar2, btneliminar2, btnlimpiar2, btnbuscar2;
    private EditText ID, Producto, Proveedor, Fechacompra, Fechaelaboracion, Fechaexpiracion, Stock, Precio;
    //RequestQueue requestQueue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interfaz_inventario);
        ID = (EditText) findViewById(R.id.txtidinventario);
        Producto = (EditText) findViewById(R.id.txtproducto);
        Proveedor = (EditText) findViewById(R.id.txtproveedor);
        Fechacompra = (EditText) findViewById(R.id.txtfechacompra);
        Fechaelaboracion = (EditText) findViewById(R.id.txtfechaelaboracion);
        Fechaexpiracion = (EditText) findViewById(R.id.txtfechaexpiracion);
        Stock = (EditText) findViewById(R.id.txtstock);
        Precio = (EditText) findViewById(R.id.txtprecio);
    }
}
