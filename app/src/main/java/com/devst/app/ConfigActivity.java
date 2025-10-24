package com.devst.app;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class ConfigActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config);

        TextView tvEnviarSms = findViewById(R.id.tvEnviarSms);
        Toolbar toolbar = findViewById(R.id.toolbarConfig);
        setSupportActionBar(toolbar);

        // Esta parte sigue siendo necesaria para MOSTRAR la flecha
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        tvEnviarSms.setOnClickListener(v -> {
            String numeroTelefonico = "+56942137877";
            String mensaje = "Hola, necesito ayuda con la aplicación.";

            Intent intentSms = new Intent(Intent.ACTION_SENDTO);
            intentSms.setData(Uri.parse("smsto:" + numeroTelefonico));
            intentSms.putExtra("sms_body", mensaje);

            try {
                startActivity(intentSms);
            } catch (Exception e) {
                Toast.makeText(this, "No se pudo abrir la app de mensajes", Toast.LENGTH_SHORT).show();
            }
        });


    }
}