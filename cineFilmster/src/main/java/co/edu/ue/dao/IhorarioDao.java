package co.edu.ue.dao;

import java.util.Date;
import java.util.List;

import co.edu.ue.entity.Horario;


public interface IhorarioDao {
	
	List<Horario> guardarFecha(Horario Fecha);
	
	Horario actualizarFecha(Horario Fecha);
	
	List<Horario> listacompleta();
	
	Horario busquedaporId(int id);
	
	Horario busquedaporfecha(Date fecha);
	
	Horario eliminarporId(int id);
	
	
	

}
