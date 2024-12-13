package co.edu.ue.dao;

import java.util.Date;
import java.util.List;

import co.edu.ue.entity.Boleta;

public interface IboletaDao {
List<Boleta> guardarboleta(Boleta boleta);
	
Boleta actualizaringreso(Boleta boleta);
	
	List<Boleta> listacompleta();
	
	Boleta busquedaporId(int id);
	
	Boleta busquedaporfecha(Date fecha);
	
	Boleta eliminarporId(int id);

}
