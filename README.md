# 📱 Android-Prototipo-2

**📝 Resumen del Proyecto**  
Este prototipo educativo, programado en Java para Android, ilustra el uso de múltiples Intents para mostrar la interacción entre apps y componentes.  
**📲 Versión mínima de Android:** 12

---

## ⚡ Intents Implementados

### 🔗 Implícitos

1. 🌍 **Abrir ubicación en Google Maps**  
   _Código:_
   ```java
   // Instancia del btn
   Button btnMaps = findViewById(R.id.btnMaps);

   // Intent
   btnMaps.setOnClickListener(v -> {
        Uri gmmIntentUri = Uri.parse("geo:-33.4578, -70.6635?q=Instituto Profesional Santo Tomas"); // Coordenadas y búsqueda de ejemplo
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps"); // Asegura que se abra en Google Maps
        startActivity(mapIntent);
    });
   ```  
   **Pasos de prueba**:  
   1️⃣ Haz clic en “Mapa”  
   2️⃣ Verifica que la app de Maps muestra la dirección indicada

2. 🌐 **Ver una página web**  
   _Código:_
   ```java
   // Instancia del btn
   Button btnAbrirWeb = findViewById(R.id.btnAbrirWeb);

   // Intent
    btnAbrirWeb.setOnClickListener(v -> {
        Uri uri = Uri.parse("https://github.com/SamaelBlossom/Android-Prototipo-2");
        Intent viewWeb = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(viewWeb);
    });
   ```  
   **Pasos de prueba**:  
   1️⃣ Selecciona “Sitio Web”  
   2️⃣ Confirma que el navegador abre la página

3. ✉️ **Enviar correo electrónico**  
   _Código:_
   ```java
   // Instancia del btn
   Button btnEnviarCorreo = findViewById(R.id.btnEnviarCorreo);

   // Intent
   btnEnviarCorreo.setOnClickListener(v -> {
        Intent email = new Intent(Intent.ACTION_SENDTO);
        email.setData(Uri.parse("mailto:"));
        email.putExtra(Intent.EXTRA_EMAIL, new String[]{emailUsuario});
        email.putExtra(Intent.EXTRA_SUBJECT, "Esto es una prueba");
        email.putExtra(Intent.EXTRA_TEXT, "HOLAAA, esto una prueba para mandar correo");
        startActivity(Intent.createChooser(email, "Enviar correo con:"));
    });
   ```
   **Pasos de prueba**:  
   1️⃣ Presiona “Correo”  
   2️⃣ Revisa que la app de email prellena asunto y cuerpo

4. 📷 **Tomar fotografía**  
   _Código:_
   ```java
   // Instancia btn
   Button btnCamara = findViewById(R.id.btnCamara);

   // Intent
   btnCamara.setOnClickListener(v ->
        startActivity(new Intent(this, CamaraActivity.class))
    );
   ```
   **Pasos de prueba**:  
   1️⃣ Haz clic en “Camara”  
   2️⃣ Comprueba que se abre la cámara y toma la fotografia

5. 🤳 **Abrir galeria**  
   _Código:_
    ```java
    // Instancia btn
    Button btnFoto = findViewById(R.id.btnFoto);

    // Intent
    btnFoto.setOnClickListener(v -> {
        seleccionarImagenLauncher.launch("image/*");
        });
    ```
   **Pasos de prueba**:  
   1️⃣ Selecciona “Abrir Foto”  
   2️⃣ Verifica que se abra la galeria y sube una foto

---

### 🛠️ Explícitos

1. 🖼️ **MainActivity → PhotoActivity (Imagen tomada)**   
   **Pasos de prueba**:  
   1️⃣ Toma una foto  
   2️⃣ Visualízala en PhotoActivity  
   3️⃣ Verifica permisos activos

2. ⚙️ **MainActivity → ConfigActivity (Ajustes)**  
   **Pasos de prueba**:  
   1️⃣ Abre el menú de ajustes  
   2️⃣ Usa “Atrás” en la toolbar  
   3️⃣ Cambia alguna preferencia

3. ❓ **MainActivity → AyudaActivity (FAQ/Tutorial)**  
   **Pasos de prueba**:  
   1️⃣ Ingresa al apartado de ayuda  
   2️⃣ Revisa la guía de uso  
   3️⃣ Consulta los comandos de voz

---

## 🖼️ Capturas de Pantalla

- ![Captura 1]([ruta/a/imagen1.png](/readme-elements/login.jpeg)) 📍
- ![Captura 2](ruta/a/imagen2.png) 🌐
- ![Captura 3](ruta/a/imagen3.png) 📷
- ![Captura 4](ruta/a/imagen4.png) ⚙️

---

## 🛠️ Instrucciones para Compilar

1. Clona el repositorio: git clone https://github.com/SamaelBlossom/Android-Prototipo-2.git

2. Abre el proyecto en **Android Studio** (v4.2+ recomendado)
3. Elige un emulador o dispositivo físico con Android 12+
4. Pulsa **Run ▶️** para compilar y ejecutar

---

## 📦 APK



---
