package com.example.ifbademo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.ifbademo.model.Cargo;
import com.example.ifbademo.repository.ICargoRepository;
import java.util.*;

@Service
@Transactional(readOnly = false)
public class CargoService {
    @Autowired
    private ICargoRepository repository;

    public void salvar(Cargo cargo){
        repository.save(cargo);
    }

    public void editar(Cargo cargo){
        repository.save(cargo);
    }

    public void excluir(Long id){
        repository.deleteById(id);
    }

    @Transactional(readOnly = true)
    public Optional<Cargo> buscarPorId(Long id){
        return repository.findById(id);
    }

    @Transactional(readOnly = true)
    public List<Cargo> buscarTodos(){
        return repository.findAll();
    }
}
