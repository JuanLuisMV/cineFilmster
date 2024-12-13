package co.edu.ue.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ue.dao.IingresoDao;
import co.edu.ue.entity.Ingreso;

@Service
public class ingresoService implements IingresoService {
	
	@Autowired
	IingresoDao dao;

	@Override
	public List<Ingreso> saveIngreso(Ingreso ingreso) {
		// TODO Auto-generated method stub
		return dao.guardaringreso(ingreso);
	}

	@Override
	public Ingreso upIngreso(Ingreso ingreso) {
		// TODO Auto-generated method stub
		return dao.actualizaringreso(ingreso);
	}

	@Override
	public List<Ingreso> listAll() {
		// TODO Auto-generated method stub
		return dao.listacompleta();
	}

	@Override
	public Ingreso findById(int id) {
		// TODO Auto-generated method stub
		return dao.busquedaporId(id);
	}

	@Override
	public Ingreso findByfecha(Date fecha) {
		// TODO Auto-generated method stub
		return dao.busquedaporfecha(fecha);
	}

	@Override
	public Ingreso deleteById(int id) {
		// TODO Auto-generated method stub
		return dao.eliminarporId(id);
	}

}
