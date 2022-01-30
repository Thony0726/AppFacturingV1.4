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
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;



public class interfaz_clientes extends AppCompatActivity {
    private Button btnguardar, btnagregar, btnactualizar, btneliminar, btnlimpiar, btnbuscar;
    private EditText ID, Cedula, Telefono, Nombre, Apellido, Direccion, Email, Creacion;
    RequestQueue requestQueue;

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
        //comentario


    }
    public void btnAgregar(View view){
        ejecutarServico("http://192.168.1.4/dbfacturing1/insertarclientes.php");
    }

    private void ejecutarServico(String URL){
        StringRequest stringRequest=new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Toast.makeText(getApplicationContext(), "Operacion exitosa", Toast.LENGTH_SHORT).show();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(),error.toString(), Toast.LENGTH_SHORT).show();
            }

        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String,String> parametros=new HashMap<String,String>();
                parametros.put("CLIAPELLIDOS",Apellido.getText().toString()+"");
                parametros.put("CLINOMBRES",Nombre.getText().toString()+"");
                parametros.put("CLICEDULA",Cedula.getText().toString()+"");
                parametros.put("CLICORREO",Email.getText().toString()+"");
                parametros.put("CLITELEFONO",Telefono.getText().toString()+"");
                parametros.put("CLIDIRECCION",Direccion.getText().toString()+"");
                parametros.put("Fecha",Creacion.getText().toString());
                return parametros;
            }
        };
        requestQueue= Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }
    private void buscar(String URL){
        JsonArrayRequest jsonArrayRequest=new JsonArrayRequest(URL, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                JSONObject jsonObject = null;
                for (int i = 0; i < response.length(); i++) {
                    try {
                        jsonObject = response.getJSONObject(i);
                        Apellido.setText(jsonObject.getString("CLIAPELLIDOS"));
                        Nombre.setText(jsonObject.getString("CLINOMBRES"));
                        Cedula.setText(jsonObject.getString("CLICEDULA"));
                        Email.setText(jsonObject.getString("CLICORREO"));
                        Telefono.setText(jsonObject.getString("CLITELEFONO"));
                        Direccion.setText(jsonObject.getString("CLIDIRECCION"));
                        Creacion.setText(jsonObject.getString("Fecha"));
                    } catch (JSONException e) {
                        Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(),"Error de conexion",Toast.LENGTH_SHORT).show();
            }
        }
        );
        requestQueue=Volley.newRequestQueue(this);
        requestQueue.add(jsonArrayRequest);
    }

    public void buscar(View view){
        buscar("http://192.168.1.4/dbfacturing1/buscarclientes.php?CLICEDULA="+Cedula.getText());
    }

    public void limpiar(View view) {
        ID.setText("");
        Cedula.setText("");
        Telefono.setText("");
        Nombre.setText("");
        Apellido.setText("");
        Direccion.setText("");
        Email.setText("");
        Creacion.setText("");
    }
}
