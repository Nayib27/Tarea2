# Tarea2
# Web-API-de-Libro
Basado en la tarea anterior se debe de hacer una modificación a los API, lo primero seria crear una nueva carpeta "utils" para crear las clases que necesitaremos para los mensajes de error y del estado.

![image](https://github.com/Nayib27/Tarea2/assets/121632251/ba947db6-266c-4beb-ab29-94b5563f69a0)


Ahora vamos con la modificación del codigo para lograr lo que se pide en la parte del controlador.

![image](https://github.com/Nayib27/Tarea2/assets/121632251/f05bdeeb-ebec-4a91-b214-b278b17f14c0)


1. Si no existe un libro, se debe de lanzar una clase LibroException (GET /libros/{id_libro}). El estado que se debe enviar es un NOT_FOUND con un mensaje personalizado

   * LibroException

    ![image](https://github.com/Nayib27/Tarea2/assets/121632251/dee48e20-afb5-4b7b-bfbc-dde4953e4032)


  
   * ExceptionResponse
  
   ![image](https://github.com/Nayib27/Tarea2/assets/121632251/02a8e3f0-95e5-4660-b9c9-01f70c2d9dfd)

   
   * RestResponseEntityExceptionHandler
  
   ![image](https://github.com/Nayib27/Tarea2/assets/121632251/5e326b9b-a34b-4224-99be-9329600f8ade)


   * Ejecución
  
  ![image](https://github.com/Nayib27/Tarea2/assets/121632251/d0c1546e-f597-43eb-89b7-0bf188834f3e)




