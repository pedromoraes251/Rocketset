package br.com.pedromoraes.todolist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodolistApplication {

	/**
     * Métodos de acesso do HTTP
     * GET - Buscar informacao
     * Push - Add uma informacao
     * Put - Alterar um dado/info
     * Delete - Remover um dado
     * Patch - Alterar um dado especifico
     */

	public static void main(String[] args) {
		SpringApplication.run(TodolistApplication.class, args);	
	}

}
