package com.duoc.api_biblioteca.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.duoc.api_biblioteca.modelo.Libro;
import com.duoc.api_biblioteca.repositorio.LibroRepository;

@RestController
@RequestMapping("/api/libros")
public class LibroController {

    @Autowired
    private LibroRepository libroRepository;

    @GetMapping("/listar")
    public List<Libro> listarTodo() {
        return libroRepository.findAll();
    }

    @PostMapping("/guardar")
    public Libro guardar(@RequestBody Libro libro) {
        return libroRepository.save(libro);
    }
}