package com.demo.libros.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.demo.libros.models.Libro;

@Repository
public class LibroRepositoryImpl implements LibroRepository {
    private List<Libro> libros = new ArrayList<>();

    public LibroRepositoryImpl() {
        libros.add(new Libro(1, "LOS CUATRO ACUERDOS", "Gabriel García Márquez", "Urano", 1997));
        libros.add(new Libro(2, "El poder del ahora", "George Orwell", "Hermida Editores", 1948));
        libros.add(new Libro(3, "Padre rico, padre pobre", "Robert T. Kiyosaki", "Penguin Random House", 1605));
        libros.add(new Libro(4, "El monje que vendió su Ferrari", "Robin Sharma", "DEBOLSILLO", 1960));
        libros.add(new Libro(5, "Los 7 hábitos de la gente altamente efectiva", "Stephen R. Covey", "PAIDOS", 1925));
    }

    public Libro getLibro(int id) {
        System.out.println("Conectando a base de datos ORACLE");
        for (Libro libro : libros) {
            if (id == libro.getId())
                return libro;

        }

        return null;
    }

    public List<Libro> getLibros() {
        System.out.println("Conectando a base de datos ORACLE");
        return libros;
    }

    @Override
    public Libro nuevLibro(Libro libro) {
        libros.add(libro);
        return libro;
    }

}
