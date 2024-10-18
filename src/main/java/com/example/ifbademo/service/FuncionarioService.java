package com.example.ifbademo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ifbademo.model.Funcionario;
import com.example.ifbademo.repository.IFuncionarioRepository;
import java.util.*;

@Service
public class FuncionarioService {
    @Autowired
    private IFuncionarioRepository repository;

    public void salvar(Funcionario funcionario){
        repository.save(funcionario);
    }

    public void editar(Funcionario funcionario){
        repository.save(funcionario);
    }

    public void excluir(Long id){
        repository.deleteById(id);
    }

    public Optional<Funcionario> buscarPorId(Long id){
        return repository.findById(id);
    }

    public List<Funcionario> buscarTodos(){
        return repository.findAll();
    }

    
}
