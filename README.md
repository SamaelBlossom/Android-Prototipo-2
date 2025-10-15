## Listado de eventos

### Implicitos
1. abrir ubicacion de Google Maps.
  - **Objetivo:** Usa Activity y almacena la fotografia que quede en la galeria.
  - **Acción:** geo:lat,lng?q=texto.
3. ver una pagina web especifica.
  - **Objetivo:** Ideal para abrir sitio institucional o tutorial.
  - **Acción:** ACTION_VIEW con https://.
4. Enviar correo electronico.
  - **Objetivo:** Prellenar asunto y cuerpo.
  - **Acción:** ACTION_SENDTO con mailto:
5. Tomar Fotografia con la camara.
  - **Objetivo:** Usa Activity y almacena la fotografia que quede en la galeria.
  - **Acción:** MediaStore.ACTION_IMAGE_CAPTURE
6. Abrir camara frontal.
  - **Objetivo:** Requiere verificar disponibilidad.
  - **Acción:** MediaStore.INTENT_ACTION_STILL_IMAGE_CAMERA_FRONT


### Explicitos
1. MainActivity → PhotoActivity (mostrar imagen tomada).
  - **Objetivo:** Envía URI de foto capturada.
  - **Comentario:** Requiere manejo de permisos.
3. MainActivity → ConfigActivity (ajustes).
  - **Objetivo:** Simular pantalla de ajustes interna.
  - **Comentario:** Usa Toolbar con botón “Atrás”.
4. MainActivity → AyudaActivity (FAQ o tutorial).
  - **Objetivo:** Mostrar guía de uso o comandos de voz
  - **Comentario:** Ideal para apps con flujo de usuario

---
---

## Listado de Pendientes

### Implicitos
- [ ] abrir ubicacion de Google Maps.
- [X] ver una pagina web especifica.
- [X] Enviar correo electronico.
- [X] Tomar Fotografia con la camara.
- [ ] Abrir camara frontal.


### Explicitos
- [X] MainActivity → PhotoActivity (mostrar imagen tomada).
- [ ] MainActivity → ConfigActivity (ajustes).
- [ ] MainActivity → AyudaActivity (FAQ o tutorial).
