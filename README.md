# Tarea2
# Web-API-de-Libro
Basado en la tarea anterior se debe de hacer una modificación a los API, lo primero seria crear una nueva carpeta "utils" para crear las clases que necesitaremos para los mensajes de error y del estado.

![image](https://github.com/Nayib27/Tarea2/assets/121632251/ba947db6-266c-4beb-ab29-94b5563f69a0)


Ahora vamos con la modificación del codigo para lograr lo que se pide en la parte del controlador.

![image](https://github.com/Nayib27/Tarea2/assets/121632251/f05bdeeb-ebec-4a91-b214-b278b17f14c0)


1. Si no existe un libro, se debe de lanzar una clase LibroException (GET /libros/{id_libro}). El estado que se debe enviar es un NOT_FOUND con un mensaje personalizado

   * LibroException

    ![image](https://github.com/Nayib27/Tarea2/assets/121632251/c55090a7-8e66-4eed-a079-bc24c5a67c4f)


  
   * ExceptionResponse
  
   ![image](https://github.com/Nayib27/Tarea2/assets/121632251/02a8e3f0-95e5-4660-b9c9-01f70c2d9dfd)

   
   * RestResponseEntityExceptionHandler
  
   ![image](https://github.com/Nayib27/Tarea2/assets/121632251/5e326b9b-a34b-4224-99be-9329600f8ade)

# EJECUCIÓN

   * Libro no  encontrado
  
  ![image](https://github.com/Nayib27/Tarea2/assets/121632251/d0c1546e-f597-43eb-89b7-0bf188834f3e)



* Ejecución libro creado
  
  ![image](https://github.com/Nayib27/Tarea2/assets/121632251/eb5815b7-e47c-4ffc-a631-0d5f44505cc4)

