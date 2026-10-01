package com.example.crud_ejemplo_01.Views;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.crud_ejemplo_01.Controllers.PersonasController;
import com.example.crud_ejemplo_01.Models.Personas;
import com.example.crud_ejemplo_01.R;

public class ActivityPersonas extends AppCompatActivity {

    EditText nombres, apellidos, fechanac, direccion, telefono, correo;
    Button btnagregar;
    PersonasController controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_personas);

        InitControls();

        controller = new PersonasController(this);

        btnagregar.setOnClickListener(v -> {
            Personas persona = new Personas();
            persona.setNombres(nombres.getText().toString());
            persona.setApellidos(apellidos.getText().toString());
            persona.setFechaNac(fechanac.getText().toString());
            persona.setDireccion(direccion.getText().toString());
            persona.setTelefono(telefono.getText().toString());
            persona.setCorreo(correo.getText().toString());

            controller.InsertarPersona(persona);

            Toast.makeText(this, "¡Persona guardada con éxito!", Toast.LENGTH_SHORT).show();

            nombres.setText("");
            apellidos.setText("");
            fechanac.setText("");
            direccion.setText("");
            telefono.setText("");
            correo.setText("");
        });
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