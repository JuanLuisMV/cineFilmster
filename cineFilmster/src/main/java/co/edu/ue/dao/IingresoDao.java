package co.edu.ue.dao;

import java.util.Date;
import java.util.List;

import co.edu.ue.entity.Ingreso;


public interface IingresoDao {
List<Ingreso> guardaringreso(Ingreso ingreso);
	
	Ingreso actualizaringreso(Ingreso ingreso);
	
	List<Ingreso> listacompleta();
	
	Ingreso busquedaporId(int id);
	
	Ingreso busquedaporfecha(Date fecha);
	
	Ingreso eliminarporId(int id);

}
