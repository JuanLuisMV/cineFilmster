package co.edu.ue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ue.entity.Proveedore;
import co.edu.ue.service.IproveedorService;

@RestController
public class proveedorController {
	
	@Autowired
	IproveedorService serviceP;


	@PostMapping(value="proveedor-save")
	public List<Proveedore> ProveedoreSave(@RequestBody Proveedore proveedore) {
		//TODO: process POST request
		return serviceP.saveProveedor(proveedore);
	}

	@GetMapping(value="proveedor-all")
	public List<Proveedore> getListAll() {
		return serviceP.listAll();
	}

	@GetMapping(value="proveedor/id/{id}")
	public Proveedore getById(@PathVariable ("id") Integer id) {
		return serviceP.findById(id);
		
	}

	@PutMapping(value= "proveedor/up/{id}")
	public Proveedore upPositionByID(@PathVariable ("id") Integer id, @RequestBody Proveedore proveedore) {
		//TODO: process PUT request
		return serviceP.upProveedor(proveedore);
	}

	@DeleteMapping(value="proveedore/delete/{id}")
	public Proveedore deleteById(@PathVariable ("id") Integer id) {
		return serviceP.deleteById(id);
	}
	}
