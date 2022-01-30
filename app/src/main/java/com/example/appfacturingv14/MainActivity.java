package com.example.appfacturingv14;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText etClave, etUsuario;
    private CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkBox = (CheckBox) findViewById(R.id.checkBox);
        etClave = (EditText) findViewById(R.id.etClave);

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // depende del estado que se encuentre el checlox para que funcione el metodo checked.
                if (!isChecked) {  //mostrar contrasenia
                    etClave.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else { // ocultar contrasenia
                    etClave.setTransformationMethod(HideReturnsTransformationMethod.getInstance()); } } });


            }
//Comentario

    public void validarUsuario(View view){
        Intent i = new Intent(this, interfaz_clientes.class);
        startActivity(i);
    }
}