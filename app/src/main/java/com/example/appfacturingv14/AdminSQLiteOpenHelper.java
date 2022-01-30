package com.example.appfacturingv14;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class AdminSQLiteOpenHelper extends SQLiteOpenHelper {
    public AdminSQLiteOpenHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table clientes(id int primary key,cedula text,telefono real,nombre text,apellido text,direccion text,email text,creacion text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("create table empleados(id int primary key,cedula text,telefono real,cargo text,nombres text,apellidos text,direccion text,email text)");
        sqLiteDatabase.execSQL("create table inventario(id int primary key,producto text,proveedor text,fechacompra text,fechaelaboracion text,fechaexpiracion text,stock real,precio real)");
        sqLiteDatabase.execSQL("create table productos(id int primary key,nombre text,codigo real,unidad real, informacion text, observacion text, fecha text)");
    }
}
