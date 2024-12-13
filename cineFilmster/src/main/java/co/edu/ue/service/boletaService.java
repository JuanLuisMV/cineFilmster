package co.edu.ue.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ue.dao.IboletaDao;
import co.edu.ue.entity.Boleta;

@Service
public class boletaService implements IboletaService {
	
	@Autowired
	IboletaDao dao;

	@Override
	public List<Boleta> saveBoleta(Boleta boleta) {
		// TODO Auto-generated method stub
		return dao.guardarboleta(boleta);
	}

	@Override
	public Boleta upBoleta(Boleta boleta) {
		// TODO Auto-generated method stub
		return dao.actualizaringreso(boleta);
	}

	@Override
	public List<Boleta> listAll() {
		// TODO Auto-generated method stub
		return dao.listacompleta();
	}

	@Override
	public Boleta findById(int id) {
		// TODO Auto-generated method stub
		return dao.busquedaporId(id);
	}

	@Override
	public Boleta findByfecha(Date fecha) {
		// TODO Auto-generated method stub
		return dao.busquedaporfecha(fecha);
	}

	@Override
	public Boleta deleteById(int id) {
		// TODO Auto-generated method stub
		return dao.eliminarporId(id);
	}
}

	