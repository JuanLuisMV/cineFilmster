package co.edu.ue.dao;

import java.util.Date;
import java.util.List;

import co.edu.ue.entity.Cliente;
import co.edu.ue.entity.Pelicula;

public interface IclienteDao {
	
	List<Cliente> guardarCliente(Cliente cliente);
	
	Cliente actualizarCliente(Cliente cliente);
	
	List<Cliente> listacompleta();
	
	Cliente busquedaporId(int id);
	
	Cliente busquedaporfecha(Date fecha);
	
	Cliente eliminarporId(int id);
	

}
