package com.informatorio.APItienda.repository;

import com.informatorio.APItienda.entity.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario,Long> {
}
