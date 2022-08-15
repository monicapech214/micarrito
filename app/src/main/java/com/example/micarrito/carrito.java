package com.example.micarrito;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class carrito extends AppCompatActivity {
Button pagar,vuelvecategoria;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrito);
        pagar =(Button) findViewById(R.id.pagar);
        vuelvecategoria =(Button) findViewById(R.id.vuelve_categoria);
        pagar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Su compra se ha realizado de manera exitosa", Toast.LENGTH_LONG).show();
            }
        });
        vuelvecategoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(carrito.this, Categorias.class);
                startActivity(i);
            }
        });
    }
}