package co.edu.ue.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.edu.ue.entity.Proveedore;
import co.edu.ue.jpa.Iproveedor;

@Repository
public class proveedorDao implements IproveedorDao {
	
	@Autowired
	Iproveedor jpa;

	@Override
	public List<Proveedore> guardarproveedor(Proveedore proveedore) {
		// TODO Auto-generated method stub
		jpa.save(proveedore);
		return listacompleta();
	}

	@Override
	public Proveedore actualizarproveedor(Proveedore proveedore) {
		// TODO Auto-generated method stub
		return jpa.save(proveedore);
	}

	@Override
	public List<Proveedore> listacompleta() {
		// TODO Auto-generated method stub
		return jpa.findAll();
	}

	@Override
	public Proveedore busquedaporId(int id) {
		// TODO Auto-generated method stub
		return jpa.findById(id).orElse(null);
	}

	@Override
	public Proveedore eliminarporId(int id) {
		// TODO Auto-generated method stub
		jpa.deleteById(id);
		return null;
	}

}
