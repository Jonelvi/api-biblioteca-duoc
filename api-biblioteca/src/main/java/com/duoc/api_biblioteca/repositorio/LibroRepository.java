package com.duoc.api_biblioteca.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.duoc.api_biblioteca.modelo.Libro;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Long> {
}