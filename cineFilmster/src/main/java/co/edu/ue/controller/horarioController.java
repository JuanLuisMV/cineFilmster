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

import co.edu.ue.entity.Horario;

import co.edu.ue.service.IhorarioService;

@RestController
public class horarioController {
	@Autowired
	IhorarioService serviceH;
  
	
	@PostMapping(value="horario-save")
	public List<Horario> HorarioSave(@DateTimeFormat(pattern = "yyyy-MM-dd" )@RequestBody Horario fecha) {
		//TODO: process POST request
		return serviceH.saveFecha(fecha);
	}
	
	@GetMapping(value="horario-all")
	public List<Horario> getListAll() {
		return serviceH.listAll();
	}
	
	@GetMapping(value="horario/id/{id}")
	public Horario getById(@PathVariable ("id") Integer id) {
		return serviceH.findById(id);
		
	}
	
	@GetMapping(value="horario/date/{date}")
	public Horario getByDate(@PathVariable("date") @DateTimeFormat(pattern = "yyyy-MM-dd") Date date) {
		return serviceH.findByDate(date);
	}
	
	@PutMapping(value="horario/up/{id}")
	public Horario upById(@PathVariable ("id") Integer id, @RequestBody   Horario Fecha ) {
		//TODO: process PUT request
		return serviceH.upFecha(Fecha);
	}
	
	@DeleteMapping(value="horario/delete/{id}")
	public Horario deleteById(@PathVariable ("id") Integer id) {
		
		return serviceH.deleteById(id);
	}
	
}
