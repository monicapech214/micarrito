package com.example.micarrito;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Categorias extends AppCompatActivity {
    ImageView catemujeres;
    Button cerrarsesion,vercarrito;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorias);
        catemujeres=(ImageView) findViewById(R.id.categotacon);
        cerrarsesion= (Button) findViewById(R.id.cerrarsesion);
        vercarrito= (Button) findViewById(R.id.vercarrito);
        catemujeres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Categorias.this, categoria_mujeres.class);
                startActivity(i);
            }
        });
        cerrarsesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Categorias.this, MainActivity.class);
                startActivity(i);
            }
        });
        vercarrito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Categorias.this, carrito.class);
                startActivity(i);
            }
        });
    }
}