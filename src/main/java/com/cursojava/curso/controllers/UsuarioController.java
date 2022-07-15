package com.cursojava.curso.controllers;

import java.util.List;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cursojava.curso.models.Usuario;

@RestController
public class UsuarioController {

    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id) {
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Freddy Fernando");
        usuario.setApellido("Galarde");
        usuario.setEmail("ffgalarde@gmail.com");
        usuario.setTelefono("4421979359");
        return usuario;
    }

    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        Usuario usuario = new Usuario();
        usuario.setId(1L);
        usuario.setNombre("Freddy Fernando");
        usuario.setApellido("Galarde");
        usuario.setEmail("ffgalarde@gmail.com");
        usuario.setTelefono("4421979359");

        Usuario usuario2 = new Usuario();
        usuario2.setId(2L);
        usuario2.setNombre("Angie");
        usuario2.setApellido("Rodriguez");
        usuario2.setEmail("ceciliaarv@gmail.com");
        usuario2.setTelefono("4421979359");

        Usuario usuario3 = new Usuario();
        usuario3.setId(3L);
        usuario3.setNombre("Freddy");
        usuario3.setApellido("Galarde");
        usuario3.setEmail("fgalarde@gmail.com");
        usuario3.setTelefono("4421979359");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        return usuarios;
    }

    @RequestMapping(value = "usuario1")
    public Usuario editar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Freddy Fernando");
        usuario.setApellido("Galarde");
        usuario.setEmail("ffgalarde@gmail.com");
        usuario.setTelefono("4421979359");
        return usuario;
    }

    @RequestMapping(value = "usuario2")
    public Usuario eliminar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Freddy Fernando");
        usuario.setApellido("Galarde");
        usuario.setEmail("ffgalarde@gmail.com");
        usuario.setTelefono("4421979359");
        return usuario;
    }

    @RequestMapping(value = "usuario3")
    public Usuario buscar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Freddy Fernando");
        usuario.setApellido("Galarde");
        usuario.setEmail("ffgalarde@gmail.com");
        usuario.setTelefono("4421979359");
        return usuario;
    }

}
