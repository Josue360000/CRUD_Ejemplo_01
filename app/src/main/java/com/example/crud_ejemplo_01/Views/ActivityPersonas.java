package com.example.crud_ejemplo_01.Views;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.crud_ejemplo_01.R;

public class ActivityPersonas extends AppCompatActivity {

    EditText nombres, apellidos, fechanac, direccion, telefono, correo;
    Button btnagregar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_personas);

        /* Inicializacion de controles */
        InitControls();

    }

    private void InitControls() {

        nombres = (EditText) findViewById(R.id.nombres);
        apellidos = (EditText) findViewById(R.id.apellidos);
        fechanac = (EditText) findViewById(R.id.fechanac);
        direccion = (EditText) findViewById(R.id.direccion);
        telefono = (EditText) findViewById(R.id.telefono);
        correo = (EditText) findViewById(R.id.correo);
        btnagregar = (Button) findViewById(R.id.btnagregar);

    }
}