package com.example.programacion_movil

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView

class UsersTable : AppCompatActivity() {

    lateinit var handler: DatabaseHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_users_table)
        init()
    }

    fun init(){
        handler = DatabaseHelper(this)
        val table: TableLayout = findViewById(R.id.tableUsers)
        val tbrow0 = TableRow(this);
        val tv0 = TextView(this);
        tv0.setText("Id ");
        tv0.setTextColor(Color.WHITE);
        tbrow0.addView(tv0);
        val tv1 = TextView(this);
        tv1.setText("Nombre ");
        tv1.setTextColor(Color.WHITE);
        tbrow0.addView(tv1);
        val tv2 = TextView(this);
        tv2.setText("APaterno ");
        tv2.setTextColor(Color.WHITE);
        tbrow0.addView(tv2);
        val tv3 = TextView(this);
        tv3.setText("AMaterno ");
        tv3.setTextColor(Color.WHITE);
        tbrow0.addView(tv3);
        val tv4 = TextView(this);
        tv4.setText("Celular ");
        tv4.setTextColor(Color.WHITE);
        tbrow0.addView(tv4);
        val tv5 = TextView(this);
        tv5.setText("Edad ");
        tv5.setTextColor(Color.WHITE);
        tbrow0.addView(tv5);
        val tv6 = TextView(this);
        tv6.setText("Tipo/Rol");
        tv6.setTextColor(Color.WHITE);
        tbrow0.addView(tv6);
        table.addView(tbrow0);
        val users: ArrayList<Usuario> = handler.getAllUsers();
        for (user in users){
            val tbrow0 = TableRow(this);
            val tv0 = TextView(this);
            tv0.setText(user.id.toString() + " ");
            tv0.setTextColor(Color.WHITE);
            tbrow0.addView(tv0);
            val tv1 = TextView(this);
            tv1.setText(user.nombre + " ");
            tv1.setTextColor(Color.WHITE);
            tbrow0.addView(tv1);
            val tv2 = TextView(this);
            tv2.setText(user.aPaterno + " ");
            tv2.setTextColor(Color.WHITE);
            tbrow0.addView(tv2);
            val tv3 = TextView(this);
            tv3.setText(user.aMaterno + " ");
            tv3.setTextColor(Color.WHITE);
            tbrow0.addView(tv3);
            val tv4 = TextView(this);
            tv4.setText(user.celular + " ");
            tv4.setTextColor(Color.WHITE);
            tbrow0.addView(tv4);
            val tv5 = TextView(this);
            tv5.setText(user.edad.toString() + " ");
            tv5.setTextColor(Color.WHITE);
            tbrow0.addView(tv5);
            val tv6 = TextView(this);
            tv6.setText(user.tipo);
            tv6.setTextColor(Color.WHITE);
            tbrow0.addView(tv6);
            table.addView(tbrow0);
        }
    }
}