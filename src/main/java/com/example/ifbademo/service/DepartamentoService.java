package com.example.ifbademo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ifbademo.model.Departamento;
import com.example.ifbademo.repository.IDepartamentoRepository;
import java.util.*;

@Service
public class DepartamentoService {

    @Autowired
    private IDepartamentoRepository repository;

    public void salvar(Departamento departamento){
        repository.save(departamento);
    }

    public void editar(Departamento departamento){
        repository.save(departamento);
    }

    public void excluir(Long id){
        repository.deleteById(id);
    }

    public Optional<Departamento> buscarPorId(Long id){
        return repository.findById(id);
    }

    public List<Departamento> buscarTodos(){
        return repository.findAll();
    }
    
}
