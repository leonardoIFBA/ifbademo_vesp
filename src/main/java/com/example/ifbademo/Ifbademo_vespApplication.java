package com.example.ifbademo;

import java.math.BigDecimal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.ifbademo.model.Cargo;
import com.example.ifbademo.model.Departamento;
import com.example.ifbademo.repository.ICargoRepository;
import com.example.ifbademo.repository.IDepartamentoRepository;
import com.example.ifbademo.repository.IFuncionarioRepository;

@SpringBootApplication
public class Ifbademo_vespApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ifbademo_vespApplication.class, args);
	}

	//obtem uma saída para o console

	@Bean
	//public CommandLineRunner demo(Departamentos dep) {
	public CommandLineRunner demo(IDepartamentoRepository depRep, 
				ICargoRepository carRep, IFuncionarioRepository funRep) {
		return (args) -> {

			/*Departamento d = new Departamento();
			d.setNome("Tecnologia da Informação");
			dep.save(d);
			System.out.println(dep.findAll());
			Cargo c = new Cargo();

			c.setNome("Programador Java Jr");
			car.save(c);
			System.out.println(car.findAll());*/
			//System.out.println("departemento:" + depRep.findByNome("SEG"));
			//System.out.println("Funcionario: " + funRep.findByNome("LEO"));
			System.out.println("Funcionario: " + funRep.findByNomeAndSalario(
							"LEO", new BigDecimal("1000.00")));
			//System.out.println("Salario: " + funRep.findBySalario(new BigDecimal("200.00")));
			System.out.println("Salario: " + funRep.findBySalarioBetween(
							new BigDecimal("200.00"), new BigDecimal("700.00")));

		};
	}

}
