package com.example.ifbademo.model;

import jakarta.persistence.*;


@Entity
@Table(name = "CARGOS")
public class Cargo extends AbstractEntity<Long>{
    @Column(nullable = false, unique = true, length = 60)
    private String nome;
    @ManyToOne
    @JoinColumn(name = "id_departamento_fk")
    private Departamento departamento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    
    
}
