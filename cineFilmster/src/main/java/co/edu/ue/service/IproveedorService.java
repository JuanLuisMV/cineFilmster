package co.edu.ue.service;

import java.util.List;

import co.edu.ue.entity.Proveedore;

public interface IproveedorService {
List<Proveedore> saveProveedor(Proveedore proveedore);
	
	Proveedore upProveedor(Proveedore proveedore);
		
	List<Proveedore> listAll();
		
	Proveedore findById(int id);
		
	Proveedore deleteById(int id);
}
