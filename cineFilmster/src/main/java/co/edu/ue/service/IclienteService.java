package co.edu.ue.service;

import java.util.Date;
import java.util.List;

import co.edu.ue.entity.Cliente;

public interface IclienteService {
	
	List<Cliente> saveCliente(Cliente cliente);
	
	Cliente upCliente(Cliente cliente);
	
	List<Cliente> ListAll();
	
	Cliente findById(int id);
	
	Cliente findByfecha(Date fecha);
	
	Cliente deleteById(int id);
	
}
