package co.edu.ue.service;

import java.util.Date;
import java.util.List;

import co.edu.ue.entity.Ingreso;

public interface IingresoService {
List<Ingreso> saveIngreso(Ingreso ingreso);
	
	Ingreso upIngreso(Ingreso ingreso);
	
	List<Ingreso> listAll();
	
	Ingreso findById(int id);
	
	Ingreso findByfecha(Date fecha);
	
	Ingreso deleteById(int id);

}
