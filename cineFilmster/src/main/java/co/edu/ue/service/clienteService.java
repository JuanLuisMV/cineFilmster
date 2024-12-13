package co.edu.ue.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ue.dao.IclienteDao;
import co.edu.ue.entity.Cliente;
@Service
public class clienteService implements IclienteService{

	
	@Autowired
	IclienteDao dao;

	@Override
	public List<Cliente> saveCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		return dao.guardarCliente(cliente);
	}

	@Override
	public Cliente upCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		return dao.actualizarCliente(cliente);
	}

	@Override
	public List<Cliente> ListAll() {
		// TODO Auto-generated method stub
		return dao.listacompleta();
	}

	@Override
	public Cliente findById(int id) {
		// TODO Auto-generated method stub
		return dao.busquedaporId(id);
	}

	@Override
	public Cliente findByfecha(Date fecha) {
		// TODO Auto-generated method stub
		return dao.busquedaporfecha(fecha);
	}

	@Override
	public Cliente deleteById(int id) {
		// TODO Auto-generated method stub
		return dao.eliminarporId(id);
	}
	
}
