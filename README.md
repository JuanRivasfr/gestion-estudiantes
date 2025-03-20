# Gestion Estudiantes

El proyecto Gestión de Estudiantes es una API REST desarrollada en Spring Boot, diseñada para administrar estudiantes y sus notas. Permite realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) sobre los estudiantes y gestionar su información académica.

## Instrucciones de Instalación

1. Clona el repositorio:

   ```bash
   git clone https://github.com/JuanRivasfr/gestion-estudiantes.git
   cd gestiosn-estudiantes
   ```
2. Inicia la aplicación:

   ```bash
   ./mvnw clean package # Esto generará un archivo .jar en la carpeta target/.
   java -jar target/gestion-estudiantes-0.0.1-SNAPSHOT.jar # Inicia el proyecto
   ```

## Documentación de la API

### URL BASE

```
http://localhost:8080
```

# Documentación de Endpoints

## Creación y Gestión de Estudiantes

### `GET /estudiantes`

- **Descripción**: Consulta todos los estudiantes creados.
- **Respuestas**:
```
[
  {
    "id": 1,
    "nombre": "Juan Pérez",
    "edad": 22,
    "carrera": "Ingeniería en Sistemas"
  }
]
//
[]

```

### `POST /estudiantes`

- **Descripción**: Agrega un nuevo estudiante.
- **Ejemplo**:
```
{
  "nombre": "Juan Pérez",
  "correo": "juan@example.com",
  "edad": 21
}

```

### `GET /estudiantes/1`

- **Descripción**: Obtiene un estudiante al que corresponda el ID.
- **Respuestas**:
```
[
  {
    "id": 1,
    "nombre": "Juan Pérez",
    "edad": 22,
    "carrera": "Ingeniería en Sistemas"
  }
]

```

### `DELETE /estudiantes/1`

- **Descripción**: Elimina un estrudiante por el ID.
- **Respuestas**:
204 No Content
