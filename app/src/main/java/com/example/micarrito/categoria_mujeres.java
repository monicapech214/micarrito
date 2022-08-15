package com.example.micarrito;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class categoria_mujeres extends AppCompatActivity {
ImageView catemujeres;
ImageView tenisrosas;
Button voler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categoria_mujeres);
        catemujeres=(ImageView) findViewById(R.id.taconegro);
        tenisrosas = (ImageView) findViewById(R.id.tenisrosas);
        voler = (Button) findViewById(R.id.volver);
        catemujeres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(categoria_mujeres.this, descripcion_mujerestacon.class);
                startActivity(i);
            }
        });
        tenisrosas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(categoria_mujeres.this, descripcion_tenis.class);
                startActivity(i);
            }
        });
        voler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(categoria_mujeres.this, Categorias.class);
                startActivity(i);
            }
        });
    }
}