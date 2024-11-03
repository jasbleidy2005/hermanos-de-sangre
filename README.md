# Proyecto: Serie "Hermanos de Sangre" - Aplicación Web

Este es un proyecto de aplicación web desarrollado en Java con Spring Boot para mostrar información detallada de la serie *Hermanos de Sangre*. Incluye características como visualización de temporadas y capítulos, posibilidad de agregar temporadas y capítulos, y un sistema de calificación de capítulos.

## Descripción

La aplicación web despliega información sobre la serie *Hermanos de Sangre*, incluyendo:
- **Póster de la serie**
- **Nombre del creador y clasificación**
- **Resumen de la serie**
- **Lista de temporadas** y sus descripciones
- **Lista de capítulos** por temporada, con la opción de ver detalles, agregar capítulos y calificarlos con un sistema de estrellas.

## Estructura del Proyecto

El proyecto se organiza de la siguiente manera:
- **Controladores:** Gestionan las rutas y la lógica para mostrar información de temporadas y capítulos.
- **Modelos:** Clases Java que representan las entidades `Temporada` y `Capitulo`.
- **Vistas:** Plantillas HTML (utilizando Thymeleaf) para la interfaz de usuario.
- **Servicios:** Lógica de negocio para manejar temporadas y capítulos en la base de datos.

## Navegación en la Aplicación

### Acceder a la Aplicación
Una vez que la aplicación esté ejecutándose, puedes acceder a ella desde un navegador web ingresando la siguiente URL:
```plaintext
http://localhost:8080

