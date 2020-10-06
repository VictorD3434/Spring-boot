package com.mitocode.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mitocode.model.Ususario;

public interface IUsuario extends JpaRepository<Ususario, Integer>{

	Ususario findByNombre(String nombre);
}
