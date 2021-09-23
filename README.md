Se sube el API de ArkonData

La ruta local es: localhost:8080/*
La api consta de los siguiente:

○ Obtener una lista de unidades disponibles

○ Consultar los el historial de ubicaciones/fechas de una unidad dado su ID

○ Obtener una lista de alcaldías disponibles

○ Obtener una lista de unidades que hayan estado dentro de una alcaldía

La documentación se creo en Swagger, por lo cual la ruta para acceder a la documentacion es: http://localhost:8080/swagger-ui.html

Para poder correr la parte de docker se adjunto el archivo Dockerfile.txt, se debe crear un archivo dentro la carpeta donde se encuentra el BACK-END, este archivo se debe de llamar
DockerFile (sin extension) y se debe copiar y pegar lo que viene en el txt.
Una vez agregado esto, se debe crear el jar directo desde maven y debemos estar parados en la carpeta 
