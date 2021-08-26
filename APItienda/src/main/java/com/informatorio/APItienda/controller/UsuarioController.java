package com.informatorio.APItienda.controller;

import com.informatorio.APItienda.entity.Usuario;
import com.informatorio.APItienda.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UsuarioController {
    @Autowired
    private UsuarioRepository Urepositoty;

    @RequestMapping(value = "/usuarios",method = RequestMethod.GET)
    public @ResponseBody
    Iterable <Usuario> findUsuario() {
        return Urepositoty.findAll();
    }
}
