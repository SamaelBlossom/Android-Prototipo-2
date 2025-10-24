package com.devst.app; // Asegúrate de que este sea tu paquete

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class PerfilActivity extends AppCompatActivity {

    // 1. Declarar las variables para los componentes del layout.
    private TextView tvNombrePerfil;
    private EditText edtEditarNombre;
    private Button btnGuardarPerfil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_perfil);

        tvNombrePerfil = findViewById(R.id.tvNombrePerfil);
        edtEditarNombre = findViewById(R.id.edtEditarNombre);
        btnGuardarPerfil = findViewById(R.id.btnGuardarPerfil);


        btnGuardarPerfil.setOnClickListener(v -> {
            actualizarNombre();
        });
    }

    private void actualizarNombre() {
        //Obtener el texto que el usuario escribió en el EditText.
        //.trim() elimina los espacios en blanco al inicio y al final.
        String nuevoNombre = edtEditarNombre.getText().toString().trim();

        //Validacion que el texto no esté vacío.
        if (!TextUtils.isEmpty(nuevoNombre)) {
            //Si no está vacío, actualizar el TextView con el nuevo nombre.
            tvNombrePerfil.setText(nuevoNombre);

            //Mostrar un mensaje de confirmación.
            Toast.makeText(this, "Nombre actualizado", Toast.LENGTH_SHORT).show();

            //Limpiar el campo de texto después de guardar.
            edtEditarNombre.setText("");
        } else {
            //Si está vacío, mostrar un mensaje de error.
            Toast.makeText(this, "Por favor, ingresa un nombre", Toast.LENGTH_SHORT).show();
        }
    }
}