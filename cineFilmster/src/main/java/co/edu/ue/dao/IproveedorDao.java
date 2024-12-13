package co.edu.ue.dao;

import java.util.List;

import co.edu.ue.entity.Proveedore;

public interface IproveedorDao {
List<Proveedore> guardarproveedor(Proveedore proveedore);
	
Proveedore actualizarproveedor(Proveedore proveedore);
	
	List<Proveedore> listacompleta();
	
	Proveedore busquedaporId(int id);
	
	Proveedore eliminarporId(int id);


}
