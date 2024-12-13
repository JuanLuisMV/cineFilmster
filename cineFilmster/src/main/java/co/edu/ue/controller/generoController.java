package co.edu.ue.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ue.entity.Genero;
import co.edu.ue.entity.Pelicula;
import co.edu.ue.entity.Reserva;
import co.edu.ue.service.IgeneroService;
import co.edu.ue.service.IreservaService;

@RestController
public class generoController {
	@Autowired
	IgeneroService serviceG;

@PostMapping(value="genero-save")
public List<Genero> generoSave(@RequestBody Genero genero) {
	//TODO: process POST request
	return serviceG.saveGenero(genero);
}

@GetMapping(value="genero-all")
public List<Genero> getListAll() {
	return serviceG.listAll();
	}

@GetMapping(value="genero/id/{id}")
public Genero getById(@PathVariable ("id") Integer id) {
	return serviceG.findById(id);
	
}

@PutMapping(value= "genero/up/{id}")
public Genero upReservaByID(@PathVariable ("id") Integer id, @RequestBody Genero genero) {
	//TODO: process PUT request

	return serviceG.upGenero(genero);
}

@DeleteMapping(value="genero/delete/{id}")
public Genero deleteById(@PathVariable ("id") Integer id) {
	
	serviceG.deleteById(id);
	
	return null;
}
	
	
}
