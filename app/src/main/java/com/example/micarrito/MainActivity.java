package com.example.micarrito;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.text.TextUtils;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText txt_usuario;
    EditText txt_password;
    Button btn_iniciasesion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt_usuario=(EditText) findViewById(R.id.txt_usuario);
        txt_password=(EditText)findViewById(R.id.txt_password);
        btn_iniciasesion=(Button)findViewById(R.id.btn_iniciasesion);

        btn_iniciasesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (TextUtils.isEmpty(txt_usuario.getText().toString())||TextUtils.isEmpty(txt_password.getText().toString())) {

                    Toast.makeText(getApplicationContext(), "Error, no ha agregado datos", Toast.LENGTH_LONG).show();
                }
                else {

                    Intent i = new Intent(MainActivity.this, Categorias.class);
                    startActivity(i);
                }
            }
        });
    }
}