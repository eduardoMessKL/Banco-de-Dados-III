package com.example.meusgastos.domain.repository;

import java.util.Optional;

import com.example.meusgastos.domain.model.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    Optional <Usuario> findByEmail (String email);
}
