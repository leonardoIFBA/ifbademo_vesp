package com.example.ifbademo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.ifbademo.model.Departamento;
import com.example.ifbademo.repository.DepartamentoRepository;

@SpringBootApplication
public class Ifbademo_vespApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ifbademo_vespApplication.class, args);
	}

	//obtem uma saída para o console
	@Bean
	//public CommandLineRunner demo(Departamentos dep) {
	public CommandLineRunner demo(DepartamentoRepository dep) {
		return (args) -> {

			Departamento d = new Departamento();
			d.setNome("SEGURANÇA");
			dep.save(d);

			System.out.println(dep.findAll());


		};
	}

}
