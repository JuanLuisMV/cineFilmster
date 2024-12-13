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
import co.edu.ue.entity.Reserva;
import co.edu.ue.service.IreservaService;

@RestController
public class reservaController {
	@Autowired
	IreservaService serviceR;
	

@PostMapping(value="reserva-save")
public List<Reserva> HorarioSave(@RequestBody Reserva reserva) {
	//TODO: process POST request
	return serviceR.saveReserva(reserva);
}

@GetMapping(value="reserva-all")
public List<Reserva> getListAll() {
	return serviceR.listacompleta();
	}

@GetMapping(value="reserva/id/{id}")
public Reserva getById(@PathVariable ("id") Integer id) {
	return serviceR.findById(id);
	
}

@GetMapping(value="reserva/date/{date}")
public Reserva getByDate(@PathVariable("date") @DateTimeFormat(pattern = "yyyy-MM-dd") Date date) {
	return serviceR.findByfecha(date);
	}

@PutMapping(value= "reserva/up/{id}")
public Reserva upReservaByID(@PathVariable ("id") Integer id, @RequestBody Reserva reserva) {
	//TODO: process PUT request

	return serviceR.upReserva(reserva);
}

@DeleteMapping(value="reserva/delete/{id}")
public Pelicula deleteById(@PathVariable ("id") Integer id) {
	
	serviceR.deleteById(id);
	
	return null;
}
	
	

}
