package com.informatorio.APItienda.controller;


import com.informatorio.APItienda.entity.Producto;
import com.informatorio.APItienda.repository.ProductoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class ProductoController {

    @Autowired
    private ProductoRepository Prepositoty;
    private Producto producto;


    @GetMapping(value = "/productos")
    public Iterable<Producto> getProductos(){
        return Prepositoty.findAll();
    }


    @GetMapping(value = "/productos/{id}")
    public Producto getProductosPorId(@PathVariable("id") Long id) {
        return Prepositoty.findById(id).get();
    }


    @PostMapping(value = "/productos")
    public Producto postProductos(@RequestBody Producto producto){
        return Prepositoty.save(producto);
    }



    @PutMapping(value = "/productos/{id}")
    public Producto putProductos(@PathVariable("id") Long id, @RequestBody  Producto producto){
        Producto mproducto = Prepositoty.findById(id).get();
        mproducto.setNombre(producto.getNombre());
        mproducto.setDescripcion(producto.getDescripcion());
        mproducto.setPrecio(producto.getPrecio());
        mproducto.setCodigoInventario(producto.getCodigoInventario());
        mproducto.setCategoria(producto.getCategoria());
      return Prepositoty.save(mproducto);
    }

    @DeleteMapping(value = "productos/{id}")
    public void deletProductos(@PathVariable("id") Long id){
         Prepositoty.deleteById(id);
    }

    @GetMapping(value = "/productos/N")
    public List<Producto> getProductosPorNombre(@RequestParam("nombre") String nombre) {
        List<Producto> productos = Prepositoty.buscarLetra(nombre);
        return productos;
    }

}
