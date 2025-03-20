Documentación de Endpoints - API de Gestión de Estudiantes

Requisitos previos

Antes de probar los endpoints, asegúrate de que el proyecto esté correctamente configurado y en ejecución.

1. Clonar el proyecto
2. Iniciar el proyecto

La API se ejecutará en http://localhost:8080.

Endpoints

1. Obtener todos los estudiantes

Endpoint: http://localhost:8080/api/estudiantes

Respuesta esperada (200 OK):
{
  "id": 1,
  "nombre": "Juan Pérez",
  "edad": 22,
  "carrera": "Ingeniería en Sistemas"
}

2. Obtener un estudiante por ID

Endpoint:

Ejemplo en Thunder Client:

Respuesta esperada (200 OK):

Si el ID no existe (404 Not Found):

3. Crear un nuevo estudiante

Endpoint:

Ejemplo en Thunder Client:

Respuesta esperada (201 Created):

4. Actualizar un estudiante

Endpoint:

Ejemplo en Thunder Client:

Respuesta esperada (200 OK):

5. Eliminar un estudiante

Endpoint:

Ejemplo en Thunder Client:

Respuesta esperada (204 No Content):
No hay contenido en la respuesta.

Si el ID no existe:

Notas adicionales

Si el proyecto no inicia correctamente, revisa los logs de la consola.

Asegúrate de que la base de datos esté configurada correctamente en application.properties.

Puedes usar Thunder Client o Postman para probar los endpoints.

Si tienes dudas o necesitas ajustes, dímelo. 🚀
