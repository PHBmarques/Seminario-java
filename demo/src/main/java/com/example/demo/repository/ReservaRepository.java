package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entities.Reserva;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Long>{

}
