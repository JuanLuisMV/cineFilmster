package co.edu.ue.service;

import java.util.Date;
import java.util.List;

import co.edu.ue.entity.Horario;

public interface IhorarioService {

	
	List<Horario> saveFecha(Horario Fecha);
	
	Horario upFecha(Horario Fecha);
	
	List<Horario> listAll();
	
	Horario findById(int id);
	
	Horario findByDate(Date fecha);
	
	Horario deleteById(int id);
	
	
	
}
