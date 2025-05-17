package com.example.libreria.repository;

import com.example.libreria.model.libros;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class librosrepository {
    
    private List<libros> listaLibros = new ArrayList<>();

    public List<libros> obtenerLibros() {
        return listaLibros;
    }

    public libros buscarporid(int id) {
        for (libros libros : listaLibros) {
            if (libros.getId() == id) {
                return libros;
            }
        }
        return null; // Agregado para manejar el caso en que no se encuentra el libro
    }
}

