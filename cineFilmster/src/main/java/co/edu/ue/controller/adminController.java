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

import co.edu.ue.entity.Administradore;
import co.edu.ue.entity.Horario;
import co.edu.ue.service.IadminService;

@RestController
public class adminController {

	@Autowired
	IadminService serviceA;
	
	
	@PostMapping(value="admin-save")
	public List<Administradore> adminSave(@RequestBody Administradore admin) {
		//TODO: process POST request
		return serviceA.saveAdmin(admin);
	}
	
	@GetMapping(value="admin-all")
	public List<Administradore> getListAll() {
		return serviceA.listacompleta();
	}
	
	@GetMapping(value="admin/id/{id}")
	public Administradore getById(@PathVariable ("id") Integer id) {
		return serviceA.findById(id);
		
	}
	
	@GetMapping(value="admin/date/{date}")
	public Administradore getByDate(@PathVariable("date") @DateTimeFormat(pattern = "yyyy-MM-dd") Date date) {
		return serviceA.findByfecha(date);
	}
	
	@PutMapping(value="admin/up/{id}")
	public Administradore upById(@PathVariable ("id") int id, @RequestBody   Administradore admin) {
		//TODO: process PUT request
		return serviceA.upAdmin(admin);
	}
	
	@DeleteMapping(value="admin/delete/{id}")
	public Administradore deleteById(@PathVariable ("id") Integer id) {
		
		return serviceA.deleteById(id);
	}
}
