package com.generation.blogPessoal.Repository;

import java.util.List;
import java.util.Optional;

import com.generation.blogPessoal.model.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	public Optional<Usuario> findByUsuario(String usuario);

    public List<Usuario> findAllByNomeContainingIgnoreCase(String string);

}
