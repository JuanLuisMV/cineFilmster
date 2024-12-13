package co.edu.ue.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ue.dao.IproveedorDao;
import co.edu.ue.entity.Proveedore;

@Service
public class proveedorService implements IproveedorService {
	
	@Autowired 
	IproveedorDao dao;

	@Override
	public List<Proveedore> saveProveedor(Proveedore proveedore) {
		// TODO Auto-generated method stub
		return dao.guardarproveedor(proveedore);
	}

	@Override
	public Proveedore upProveedor(Proveedore proveedore) {
		// TODO Auto-generated method stub
		return dao.actualizarproveedor(proveedore);
	}

	@Override
	public List<Proveedore> listAll() {
		// TODO Auto-generated method stub
		return dao.listacompleta();
	}

	@Override
	public Proveedore findById(int id) {
		// TODO Auto-generated method stub
		return dao.busquedaporId(id);
	}

	@Override
	public Proveedore deleteById(int id) {
		// TODO Auto-generated method stub
		return dao.eliminarporId(id);
	}
}

	