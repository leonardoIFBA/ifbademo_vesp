package com.example.ifbademo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ifbademo.model.Cargo;
import com.example.ifbademo.repository.ICargoRepository;
import java.util.*;

@Service
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

    public Optional<Cargo> buscarPorId(Long id){
        return repository.findById(id);
    }

    public List<Cargo> buscarTodos(){
        return repository.findAll();
    }
}
