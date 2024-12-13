package co.edu.ue.service;

import java.util.Date;
import java.util.List;

import co.edu.ue.entity.Boleta;

public interface IboletaService {
List<Boleta> saveBoleta(Boleta boleta);
	
Boleta upBoleta(Boleta boleta);
	
	List<Boleta> listAll();
	
	Boleta findById(int id);
	
	Boleta findByfecha(Date fecha);
	
	Boleta deleteById(int id);

}
