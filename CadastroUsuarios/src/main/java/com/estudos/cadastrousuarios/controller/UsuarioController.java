package com.estudos.cadastrousuarios.controller;
import com.estudos.cadastrousuarios.model.Usuario;
import com.estudos.cadastrousuarios.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService service;

    @GetMapping
    public List<Usuario> Listar(){
        return service.ListarTodos();
    }

    @PostMapping
    public Usuario criar(@RequestBody Usuario usuario){
        return service.salvar(usuario);
    }

}
