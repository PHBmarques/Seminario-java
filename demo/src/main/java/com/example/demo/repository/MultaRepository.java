package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entities.Multa;
import com.example.demo.Entities.StatusMulta;

import java.util.List;


@Repository
public interface MultaRepository extends JpaRepository<Multa, Long> {

    Optional<Multa> findByEmprestimoId(Long emprestimoId);
    List<Multa> findByStatus(StatusMulta status);
}
