package com.example.programacion_movil

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DatabaseHelper(context: Context):SQLiteOpenHelper(context, dbName, factory, version) {
    override fun onCreate(p0: SQLiteDatabase?) {
        p0?.execSQL("CREATE TABLE user(id integer primary key autoincrement, nombre varchar(50), aPaterno varchar(50), aMaterno varchar(50), celular varchar(15), password varchar(50), edad int, tipo varchar(10))")
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("Not yet implemented")
    }

    fun registerUser (nombre: String, aPaterno: String, aMaterno: String, celular: String, password: String, edad: Int, tipo: String) {
        val db: SQLiteDatabase = writableDatabase
        val values: ContentValues = ContentValues()
        values.put("nombre", nombre)
        values.put("aPaterno", aPaterno)
        values.put("aMaterno", aMaterno)
        values.put("celular", celular)
        values.put("password", password)
        values.put("edad", edad)
        values.put("tipo", tipo)

        db.insert("user", null, values)
        db.close()
    }

    fun login (celular: String, password: String): Boolean {
        val db: SQLiteDatabase = writableDatabase
        val query = "SELECT * FROM user WHERE celular = $celular AND password = $password"
        val cursor = db.rawQuery(query, null)
        if (cursor.count <= 0) {
            cursor.close()
            return false
        }
        cursor.close()
        return true
    }

    fun obtainPassword (celular: String): String {
        val db: SQLiteDatabase = writableDatabase
        val query = "SELECT * FROM user WHERE celular = $celular"
        val cursor = db.rawQuery(query, null)
        if (cursor.count <= 0) {
            cursor.close()
            return "Celular no encontrado"
        }
        if (cursor.moveToFirst()) {
            var password = cursor.getString(5)
            cursor.close()
            return password
        }
        return ""
    }

    fun getAllUsers (): ArrayList<Usuario> {
        val db: SQLiteDatabase = writableDatabase
        val query = "SELECT * FROM user"
        val cursor: Cursor = db.rawQuery(query, null)
        val listUsers: ArrayList<Usuario> = arrayListOf();
        if (cursor.moveToFirst()) {
            while (!cursor.isAfterLast()) {
                val id = cursor.getInt(0);
                val nombre = cursor.getString(1);
                val aPaterno = cursor.getString(2);
                val aMaterno = cursor.getString(3);
                val celular = cursor.getString(4);
                val edad = cursor.getInt(6);
                val tipo = cursor.getString(7);
                listUsers.add(Usuario(id, nombre, aPaterno, aMaterno, celular, edad, tipo));
                cursor.moveToNext();
            }
        }

        return listUsers;
    }

    companion object {
        internal val dbName = "programacionMovilDB"
        internal val factory = null
        internal val version = 1
    }

}