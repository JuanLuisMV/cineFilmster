package co.edu.ue.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import co.edu.ue.entity.Sala;
import co.edu.ue.service.IsalaService;

@RestController
public class salaController {
	
	@Autowired
	IsalaService serviceS;

@PostMapping(value="sala-save")
public List<Sala> salaSave(@RequestBody Sala sala) {
	 try {
         return serviceS.saveSala(sala);
     } catch (RuntimeException e) {
        
         throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
     }
 }

@GetMapping(value="sala-all")
public List<Sala> getListAll() {
	return serviceS.listAll();
	}

@GetMapping(value="sala/id/{id}")
public Sala getById(@PathVariable ("id") Integer id) {
	
	return serviceS.findById(id);
	
}

@PutMapping(value= "sala/up/{id}")
public Sala upSalaByID(@PathVariable ("id") Integer id, @RequestBody Sala sala) {
	//TODO: process PUT request

	return serviceS.upSala(sala);
}

@DeleteMapping(value="sala/delete/{id}")
public Sala deleteById(@PathVariable ("id") Integer id) {
	
	serviceS.deleteById(id);
	
	return null;
}
}
