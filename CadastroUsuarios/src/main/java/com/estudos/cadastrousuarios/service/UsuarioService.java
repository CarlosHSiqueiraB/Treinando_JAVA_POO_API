package com.estudos.cadastrousuarios.service;
import com.estudos.cadastrousuarios.model.Usuario;
import com.estudos.cadastrousuarios.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository repository;

    public List<Usuario> ListarTodos(){
        return repository.findAll();
    }

    public Usuario salvar(Usuario usuario){
        if(repository.findByEmail(usuario.getGmail()).isPresent()){
            throw new RuntimeException("Gmail já cadastrado");
        }
        return repository.save(usuario);
    }


}
