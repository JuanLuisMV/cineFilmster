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

import co.edu.ue.entity.Boleta;
import co.edu.ue.service.IboletaService;

@RestController
public class boletaController {
	
	@Autowired
	IboletaService serviceB;
	
	@PostMapping(value="boleta-save")
	public List<Boleta> BoletaSave(@RequestBody Boleta boleta) {
		//TODO: process POST request
		return serviceB.saveBoleta(boleta);
	}

	@GetMapping(value="boleta-all")
	public List<Boleta> getListAll() {
		return serviceB.listAll();
		}

	@GetMapping(value="boleta/id/{id}")
	public Boleta getById(@PathVariable ("id") Integer id) {
		return serviceB.findById(id);
		
	}

	@GetMapping(value="boleta/date/{date}")
	public Boleta getByDate(@PathVariable("date") @DateTimeFormat(pattern = "yyyy-MM-dd") Date date) {
		return serviceB.findByfecha(date);
		}

	@PutMapping(value= "boleta/up/{id}")
	public Boleta upPositionByID(@PathVariable ("id") Integer id, @RequestBody Boleta boleta) {
		//TODO: process PUT request

		return serviceB.upBoleta(boleta);
	}

	@DeleteMapping(value="boleta/delete/{id}")
	public Boleta deleteById(@PathVariable ("id") Integer id) {
		return serviceB.deleteById(id);
	}
}
