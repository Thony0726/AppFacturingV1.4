package com.example.appfacturingv14;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.HashMap;
import java.util.Map;

public class interfaz_productos extends AppCompatActivity {

    private Button btnguardar3,btnagregar3,btnactualizar3,btneliminar3, btnlimpiar3, btnbuscar3;
    private EditText ID,Nombre,Codigo,Unidad,Informacion,Observacion,Fecha;
    RequestQueue requestQueue;
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



        //comentario22


       // btnagregar3.setOnClickListener(new View.OnClickListener() {
        //    @Override
        //    public void onClick(View v) {
         //       ejecutarServico("http://192.168.10.5/dbfacturing1/insertardatos.php");
         //   }
    //    });
       // btnbuscar3.setOnClickListener(new View.OnClickListener() {
         //   @Override
         //   public void onClick(View v) {
         //       buscar("http://192.168.10.5/dbfacturing1/buscardatos.php?cedula=" + ID.getText() + "");
        //    }
        //});
      //  btnactualizar3.setOnClickListener(new View.OnClickListener() {
         //   @Override
          //  public void onClick(View v) {
          //      actualizar("http://192.168.10.5/dbfacturing1/actualizardatos.php?cedula=" + ID.getText() + "");
         //   }
     //   });
    //    btneliminar3.setOnClickListener(new View.OnClickListener() {
        //    @Override
        //    public void onClick(View v) {
          //      borrar("http://192.168.10.5/dbfacturing1/borrardatos.php?cedula=" + ID.getText() + "");
        //    }
      //  });

   // }
   // private void ejecutarServico(String URL){
     //   StringRequest stringRequest=new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
       //     @Override
       //     public void onResponse(String response) {
       //         Toast.makeText(getApplicationContext(), "Informacion guardada exitosamente", Toast.LENGTH_SHORT).show();
       //     }
      //  }, new Response.ErrorListener() {
        //    @Override
          //  public void onErrorResponse(VolleyError error) {
         //       Toast.makeText(getApplicationContext(),error.toString(), Toast.LENGTH_SHORT).show();
         //   }
      //  }){
          //  @Override
          //  protected Map<String, String> getParams() throws AuthFailureError {
           //     Map<String,String> parametros=new HashMap<String,String>();
            //    parametros.put("ID",ID.getText().toString());
              //  parametros.put("Nombre",Nombre.getText().toString());
           //     parametros.put("Codigo",Codigo.getText().toString());
           //     parametros.put("Unidad",Unidad.getText().toString());
           //     parametros.put("Informacion",Informacion.getText().toString());
           //     parametros.put("Observacion",Observacion.getText().toString());
            //    parametros.put("Fecha",Fecha.getText().toString());
            //    return parametros;
          //  }
       // };
      //  requestQueue= Volley.newRequestQueue(this);
       // requestQueue.add(stringRequest);
    }

}