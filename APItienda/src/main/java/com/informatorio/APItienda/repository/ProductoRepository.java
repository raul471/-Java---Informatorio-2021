package com.informatorio.APItienda.repository;


import com.informatorio.APItienda.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepository extends JpaRepository<Producto,Long> {

    List<Producto> buscarLetra(String nombre);

}