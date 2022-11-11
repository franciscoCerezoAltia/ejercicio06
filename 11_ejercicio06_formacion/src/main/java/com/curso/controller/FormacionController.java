package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Formacion;
import com.curso.service.FormacionService;

@RestController
public class FormacionController {
	@Autowired
	FormacionService service;
	
	@PostMapping(value="formacion",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Formacion> listadoFormacion(){
		return service.listadoCursos();
	}
	
	@PutMapping(value="formacion",consumes=MediaType.APPLICATION_JSON_VALUE)
	public void altaCurso (@RequestBody Formacion formacion) {
		service.altaCurso(formacion);
	}
}
