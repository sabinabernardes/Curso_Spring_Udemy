package com.sabinabernardes.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sabinabernardes.dominio.Categoria;



@RestController
@RequestMapping(value="/categorias")//endpoint rest
public class CategoriaResources {
	@RequestMapping(method = RequestMethod.GET)
	
	public String listar() {
		
		Categoria cat1 = new Categoria (1,"Informatica");
		Categoria cat2 = new Categoria (2,"Escritório ");
		return listar();
	}
	
}
