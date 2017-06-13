package com.chargeApp.cobranca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chargeApp.cobranca.model.Titulo;

public interface Titulos extends JpaRepository<Titulo, Long> {

}