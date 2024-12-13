package co.edu.ue.dao;

import java.util.Date;
import java.util.List;

import co.edu.ue.entity.Administradore;


public interface IadministradorDao {
 List<Administradore> guardarAdmin(Administradore Admin);
	
    Administradore actualizarAdmin(Administradore Admin);
	
	List<Administradore> listacompleta();
	
	Administradore busquedaporId(int id);
	
	Administradore busquedaporfecha(Date fecha);
	
	Administradore eliminarporId(int id);
	
	Administradore busquedaporemail(String email);
	
	
}
