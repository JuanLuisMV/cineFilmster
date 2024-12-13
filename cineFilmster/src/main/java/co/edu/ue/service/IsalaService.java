package co.edu.ue.service;

import java.util.List;

import co.edu.ue.entity.Sala;

public interface IsalaService {

	List<Sala> saveSala(Sala sala);
	
	Sala upSala(Sala sala);
	
	List<Sala> listAll();
	
	Sala findById(int id);
	
	Sala deleteById(int id);
	

}
