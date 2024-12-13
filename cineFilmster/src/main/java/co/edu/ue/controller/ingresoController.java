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

import co.edu.ue.entity.Ingreso;
import co.edu.ue.service.IingresoService;


@RestController
public class ingresoController {
	@Autowired
	IingresoService serviceI;


	@PostMapping(value="ingreso-save")
	public List<Ingreso> IngresoSave(@RequestBody Ingreso ingreso) {
		//TODO: process POST request
		return serviceI.saveIngreso(ingreso);
	}

	@GetMapping(value="ingreso-all")
	public List<Ingreso> getListAll() {
		return serviceI.listAll();
		}

	@GetMapping(value="ingreso/id/{id}")
	public Ingreso getById(@PathVariable ("id") Integer id) {
		return serviceI.findById(id);
		
	}

	@GetMapping(value="ingreso/date/{date}")
	public Ingreso getByDate(@PathVariable("date") @DateTimeFormat(pattern = "yyyy-MM-dd") Date date) {
		return serviceI.findByfecha(date);
		}

	@PutMapping(value= "ingreso/up/{id}")
	public Ingreso upPositionByID(@PathVariable ("id") Integer id, @RequestBody Ingreso ingreso) {
		//TODO: process PUT request

		return serviceI.upIngreso(ingreso);
	}

	@DeleteMapping(value="ingreso/delete/{id}")
	public Ingreso deleteById(@PathVariable ("id") Integer id) {
		
		return serviceI.deleteById(id);
	}
	}

