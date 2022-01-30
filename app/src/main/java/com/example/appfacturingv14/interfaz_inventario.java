package com.example.appfacturingv14;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class interfaz_inventario extends AppCompatActivity {
    private Button btnguardar2, btnagregar2, btnactualizar2, btneliminar2, btnlimpiar2, btnbuscar2;
    private EditText ID, Producto, Proveedor, Fechacompra, Fechaelaboracion, Fechaexpiracion, Stock, Precio;
    RequestQueue requestQueue;

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


        //comentario22


        //  btnagregar2.setOnClickListener(new View.OnClickListener() {
        //    @Override
        //    public void onClick(View v) {
        //        ejecutarServico("http://192.168.10.5/dbfacturing1/insertardatos.php");
        //    }
        //   });
        // btnbuscar2.setOnClickListener(new View.OnClickListener() {
        //  @Override
        // public void onClick(View v) {
        //  buscar("http://192.168.10.5/dbfacturing1/buscardatos.php?cedula=" + ID.getText() + "");
        // }
        // });
        // btnactualizar2.setOnClickListener(new View.OnClickListener() {
        ////  @Override
        //  public void onClick(View v) {
        //   actualizar("http://192.168.10.5/dbfacturing1/actualizardatos.php?cedula=" + ID.getText() + "");
        // }
        // });
        // btneliminar2.setOnClickListener(new View.OnClickListener() {
        //  @Override
        //  public void onClick(View v) {
        //      borrar("http://192.168.10.5/dbfacturing1/borrardatos.php?cedula=" + ID.getText() + "");
        //   }
        //});
        // }
        //private void ejecutarServico(String URL){
        // StringRequest stringRequest=new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
        //  @Override
        //   public void onResponse(String response) {
        //       Toast.makeText(getApplicationContext(), "Informacion guardada exitosamente", Toast.LENGTH_SHORT).show();
        //   }
        // }, new Response.ErrorListener() {
        //     @Override
        //     public void onErrorResponse(VolleyError error) {
        //       Toast.makeText(getApplicationContext(),error.toString(), Toast.LENGTH_SHORT).show();
        //   }
        //   }){
        //   @Override
        //     protected Map<String, String> getParams() throws AuthFailureError {
        //      Map<String,String> parametros=new HashMap<String,String>();
        //      parametros.put("ID",ID.getText().toString());
        //      parametros.put("Producto",Producto.getText().toString());
        //      parametros.put("Proveedor",Proveedor.getText().toString());
        //      parametros.put("Fechacompra",Fechacompra.getText().toString());
        //      parametros.put("Fechaelaboracion",Fechaelaboracion.getText().toString());
        //       parametros.put("Fechaexpiracion",Fechaexpiracion.getText().toString());
        //       parametros.put("Stock",Stock.getText().toString());
        //       parametros.put("Precio",Precio.getText().toString());
        //      return parametros;
        // }
        //   };
        //    requestQueue= Volley.newRequestQueue(this);
        //   requestQueue.add(stringRequest);
        //
        //   }
    }
}
