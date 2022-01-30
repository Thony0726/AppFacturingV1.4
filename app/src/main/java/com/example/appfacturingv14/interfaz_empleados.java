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

public class interfaz_empleados extends AppCompatActivity {
    private Button btnguardar1,btnagregar1,btnactualizar1,btneliminar1, btnlimpiar1, btnbuscar1;
    private EditText ID,Cedula,Telefono,Cargo,Nombre,Apellido,Direccion,Email;
    RequestQueue requestQueue;
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


        //comentario22




      //  btnagregar1.setOnClickListener(new View.OnClickListener() {
         //   @Override
        //    public void onClick(View v) {
          //      ejecutarServico("http://192.168.10.5/dbfacturing1/insertardatos.php");
        //    }
       // });
      //  btnbuscar1.setOnClickListener(new View.OnClickListener() {
          //  @Override
         //   public void onClick(View v) {
        //        buscar("http://192.168.10.5/dbfacturing1/buscardatos.php?cedula="+Cedula.getText()+"");
        //    }
       // });
      //  btnactualizar1.setOnClickListener(new View.OnClickListener() {
         //   @Override
         //   public void onClick(View v) {
         //       actualizar("http://192.168.10.5/dbfacturing1/actualizardatos.php?cedula="+Cedula.getText()+"");
        //    }
       // });
      //  btneliminar1.setOnClickListener(new View.OnClickListener() {
          //  @Override
         //   public void onClick(View v) {
         //       borrar("http://192.168.10.5/dbfacturing1/borrardatos.php?cedula="+Cedula.getText()+"");
        //    }
     //   });
  //  }
   // private void ejecutarServico(String URL){
    //    StringRequest stringRequest=new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
        //    @Override
        //    public void onResponse(String response) {
           //     Toast.makeText(getApplicationContext(), "Informacion guardada exitosamente", Toast.LENGTH_SHORT).show();
       //     }
     //   }, new Response.ErrorListener() {
       //     @Override
        //    public void onErrorResponse(VolleyError error) {
        //        Toast.makeText(getApplicationContext(),error.toString(), Toast.LENGTH_SHORT).show();
            }
       // }){
        //    @Override
        //    protected Map<String, String> getParams() throws AuthFailureError {
                Map<String,String> parametros=new HashMap<String,String>();
             //   parametros.put("ID",ID.getText().toString());
         //       parametros.put("Cedula",Cedula.getText().toString());
          //      parametros.put("Telefono",Telefono.getText().toString());
         //       parametros.put("Cargo",Cargo.getText().toString());
           //     parametros.put("Nombre",Nombre.getText().toString());
          //      parametros.put("Apellido",Apellido.getText().toString());
          //      parametros.put("Direccion",Direccion.getText().toString());
          //      parametros.put("Email",Email.getText().toString());
          //      return parametros;
          //  }
      //  };
      //  requestQueue= Volley.newRequestQueue(this);
    //    requestQueue.add(stringRequest);
  //  }
}