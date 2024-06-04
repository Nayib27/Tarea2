# LibroTarea
Para la creación de una entidad "Libro" en un proyecto organizado en varias capas, podemos seguir esta estructura:
![image](https://github.com/Nayib27/LibroTarea/assets/121632251/e79a3060-4b00-4c13-afa2-2285db29e4e1)

Creamos la clase libro con los campos, junto con sus getters-setters

*id: Long
*titulo: String
*autor: String
*editorial: String
*año de Publicacion: Integer

![image](https://github.com/Nayib27/LibroTarea/assets/121632251/293db8d7-da70-4307-bd3e-7cad9ff67231)

Creación del controllers

Aqui definiremos el get y post

![image](https://github.com/Nayib27/LibroTarea/assets/121632251/62786aaf-e77c-4f23-b3f1-849542906691)

Creación del repository

"LibroRepository.java": Definimos los metodos, que vamos a utilizar

![image](https://github.com/Nayib27/LibroTarea/assets/121632251/f9e8c169-f33e-4856-bbe4-0fc9a4f09133)

"LibroRepositoryDemo.java" y "LibroRepositoryImpl.java": Definimos la base de datos que contendrá objetos quemados de los libros

![image](https://github.com/Nayib27/LibroTarea/assets/121632251/d5cce2c4-d6ab-47ea-9d6d-cf2680249654)

Creación del services

![image](https://github.com/Nayib27/LibroTarea/assets/121632251/fe7752d5-9d48-416e-841b-ada19d880308)

Ejecución del Web API

![image](https://github.com/Nayib27/LibroTarea/assets/121632251/002b2ce2-92aa-4cfd-9ac2-46672d49756e)


Prueba en postman


![image](https://github.com/Nayib27/LibroTarea/assets/121632251/2fc8e786-b065-4ae3-a70b-911c3c1b1acb)


![image](https://github.com/Nayib27/LibroTarea/assets/121632251/78e3ba42-2b88-4ea8-9c98-76fe4bcf2987)


![image](https://github.com/Nayib27/LibroTarea/assets/121632251/5520ed2b-4f59-49f9-b8d1-4f0725417e24)
