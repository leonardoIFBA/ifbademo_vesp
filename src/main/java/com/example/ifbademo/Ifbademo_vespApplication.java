package com.example.ifbademo;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.ifbademo.model.Cargo;
import com.example.ifbademo.model.Departamento;
import com.example.ifbademo.model.Endereco;
import com.example.ifbademo.model.Funcionario;
import com.example.ifbademo.model.UF;
import com.example.ifbademo.service.CargoService;
import com.example.ifbademo.service.DepartamentoService;
import com.example.ifbademo.service.FuncionarioService;

@SpringBootApplication
public class Ifbademo_vespApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ifbademo_vespApplication.class, args);
	}

	//obtem uma saída para o console

	@Bean
	//public CommandLineRunner demo(Departamentos dep) {
	public CommandLineRunner demo(DepartamentoService depService, 
				CargoService carService, FuncionarioService funService) {
		return (args) -> {
			Departamento d = new Departamento();
			d.setNome("Tecnologia da Informação");
			depService.salvar(d);
			System.out.println(depService.buscarTodos());
			
			Cargo c = new Cargo();
			c.setNome("Programador Java Jr");
			c.setDepartamento(d);
			carService.salvar(c);
			System.out.println(carService.buscarTodos());

			Endereco e = new Endereco();
			e.setLogradouro("Rua A");
			e.setNumero(10);
			e.setBairro("Centro");
			e.setCep("46100000");
			e.setComplemento("casa");
			e.setCidade("Brumado");
			e.setUf(UF.BA);

			Funcionario f = new Funcionario();
			f.setNome("leonardo");
			f.setDataEntrada(LocalDate.now());
			f.setSalario(new BigDecimal("1000.00"));
			f.setEndereco(e);
			funService.salvar(f);
		};
	}

}
