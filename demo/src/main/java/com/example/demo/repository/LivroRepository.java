package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entities.Livro;
@Repository
public interface LivroRepository extends JpaRepository<Livro, Long>{

}
