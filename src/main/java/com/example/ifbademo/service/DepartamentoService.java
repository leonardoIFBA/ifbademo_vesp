package com.example.ifbademo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.ifbademo.model.Departamento;
import com.example.ifbademo.repository.IDepartamentoRepository;
import java.util.*;

@Service
@Transactional(readOnly = true)
public class DepartamentoService {

    @Autowired
    private IDepartamentoRepository repository;

    @Transactional(readOnly = false)
    public void salvar(Departamento departamento){
        repository.save(departamento);
    }

    @Transactional(readOnly = false)
    public void editar(Departamento departamento){
        repository.save(departamento);
    }

    @Transactional(readOnly = false)
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
