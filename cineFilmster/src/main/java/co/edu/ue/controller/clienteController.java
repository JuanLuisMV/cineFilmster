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

import co.edu.ue.entity.Cliente;
import co.edu.ue.service.IclienteService;
import jakarta.validation.Valid;

@RestController
public class clienteController {
	
	@Autowired
	IclienteService serviceC;

	@PostMapping(value="cliente-save")
	public List<Cliente> clienteSave(@RequestBody Cliente cliente) {
		//TODO: process POST request
		return serviceC.saveCliente(cliente);
	}

	@GetMapping(value="cliente-all")
	public List<Cliente> getListAll() {
		return serviceC.ListAll();
		}

	@GetMapping(value="cliente/id/{id}")
	public Cliente getById(@PathVariable ("id") Integer id) {
		return serviceC.findById(id);
		
	}

	@GetMapping(value="cliente/date/{date}")
	public Cliente getByDate(@PathVariable("date") @DateTimeFormat(pattern = "yyyy-MM-dd") Date date) {
		return serviceC.findByfecha(date);
		}

	@PutMapping(value= "cliente/up/{id}")
	public Cliente upPositionByID(@PathVariable ("id") Integer id, @RequestBody Cliente cliente) {
		//TODO: process PUT request

		return serviceC.upCliente(cliente);
	}

	@DeleteMapping(value="cliente/delete/{id}")
	public Cliente deleteById(@PathVariable ("id") Integer id) {
		
		return serviceC.deleteById(id);
}
}
