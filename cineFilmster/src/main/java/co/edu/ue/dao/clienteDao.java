package co.edu.ue.dao;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.edu.ue.entity.Cliente;
import co.edu.ue.jpa.Icliente;

@Repository
public class clienteDao implements IclienteDao{
	
	@Autowired
	Icliente jpa;

	@Override
	public List<Cliente> guardarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		jpa.save(cliente);
		return listacompleta();
	}

	@Override
	public Cliente actualizarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		return jpa.save(cliente);
	}

	@Override
	public List<Cliente> listacompleta() {
		// TODO Auto-generated method stub
		return jpa.findAll();
	}

	@Override
	public Cliente busquedaporId(int id) {
		// TODO Auto-generated method stub
		return jpa.findById(id).orElse(null);
	}

	@Override
	public Cliente busquedaporfecha(Date fecha) {
		// TODO Auto-generated method stub
		return jpa.findByfechaCreacion(fecha);
	}

	@Override
	public Cliente eliminarporId(int id) {
		// TODO Auto-generated method stub
		jpa.deleteById(id);
		return null;
	}
	
	

}
