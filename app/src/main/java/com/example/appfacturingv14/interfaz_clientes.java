package com.example.appfacturingv14;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.RequestQueue;



public class interfaz_clientes extends AppCompatActivity {
    private Button btnguardar, btnagregar, btnactualizar, btneliminar, btnlimpiar, btnbuscar;
    private EditText ID, Cedula, Telefono, Nombre, Apellido, Direccion, Email, Creacion;
    RequestQueue requestQueue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interfaz_clientes);
        ID = (EditText) findViewById(R.id.txtID);
        Cedula = (EditText) findViewById(R.id.txtCedula);
        Telefono = (EditText) findViewById(R.id.txtTelefono);
        Nombre = (EditText) findViewById(R.id.txtNombre);
        Apellido = (EditText) findViewById(R.id.txtApellido);
        Direccion = (EditText) findViewById(R.id.txtDireccion);
        Email = (EditText) findViewById(R.id.txtEmail);
        Creacion = (EditText) findViewById(R.id.txtCreacion);

        //comentario22
    }
  public void guardar (View view){
      AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this,
              "administracion", null, 1);
      SQLiteDatabase bd = admin.getWritableDatabase();
      String id = ID.getText().toString();
      String Ced = Cedula.getText().toString();
      String Tel = Telefono.getText().toString();
      String Nomb = Nombre.getText().toString();
      String Ape = Apellido.getText().toString();
      String Dir = Direccion.getText().toString();
      String email = Email.getText().toString();
      String creacion = Creacion.getText().toString();
      ContentValues registro = new ContentValues();
      registro.put("id", id);
      registro.put("cedula", Ced);
      registro.put("telefono", Tel);
      registro.put("nombre ", Nomb);
      registro.put("apellido", Ape);
      registro.put("direccion", Dir);
      registro.put("email", email);
      registro.put("creacion", creacion);
      bd.insert("clientes", null, registro);
      bd.close();
      ID.setText("");
      Cedula.setText("");
      Telefono.setText("");
     Nombre.setText("");
      Apellido.setText("");
      Direccion.setText("");
      Email.setText("");
      Creacion.setText("");
      Toast.makeText(this, "Se cargaron los datos del artículo",
              Toast.LENGTH_SHORT).show();

  }
  public  void consultarporcodigo(View view){
      AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this,
              "administracion", null, 1);
      SQLiteDatabase bd = admin.getWritableDatabase();
      String id = ID.getText().toString();
      Cursor fila = bd.rawQuery(
              "select cedula,telefono,nombre ,apellido from articulos where codigo=" + id, null);
      if (fila.moveToFirst()) {
          et2.setText(fila.getString(0));
          et3.setText(fila.getString(1));
      } else
          Toast.makeText(this, "No existe un artículo con dicho código",
                  Toast.LENGTH_SHORT).show();
      bd.close();

  }

}
