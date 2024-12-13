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


import co.edu.ue.entity.Pelicula;

import co.edu.ue.service.IpeliculaService;

@RestController
public class peliculacController {
@Autowired
IpeliculaService serviceP;


@PostMapping(value="pelicula-save")
public List<Pelicula> HorarioSave(@RequestBody Pelicula pelicula) {
	//TODO: process POST request
	return serviceP.saveMovie(pelicula);
}

@GetMapping(value="pelicula-all")
public List<Pelicula> getListAll() {
	return serviceP.ListAll();
	}

@GetMapping(value="pelicula/id/{id}")
public Pelicula getById(@PathVariable ("id") Integer id) {
	return serviceP.findById(id);
	
}

@GetMapping(value="pelicula/date/{date}")
public Pelicula getByDate(@PathVariable("date") @DateTimeFormat(pattern = "yyyy-MM-dd") Date date) {
	return serviceP.findByDate(date);
	}

@PutMapping(value= "pelicula/up/{id}")
public Pelicula upPositionByID(@PathVariable ("id") Integer id, @RequestBody Pelicula pelicula) {
	//TODO: process PUT request

	return serviceP.upmovie(pelicula);
}

@DeleteMapping(value="pelicula/delete/{id}")
public Pelicula deleteById(@PathVariable ("id") Integer id) {
	
	return serviceP.deleteById(id);
}
}
