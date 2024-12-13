package co.edu.ue.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ue.dao.IhorarioDao;
import co.edu.ue.entity.Horario;

@Service
public class horarioService implements IhorarioService {

	@Autowired
	IhorarioDao dao;

	@Override
	public List<Horario> saveFecha(Horario Fecha) {
		// TODO Auto-generated method stub
		return dao.guardarFecha(Fecha);
	}

	@Override
	public Horario upFecha(Horario Fecha) {
		// TODO Auto-generated method stub
		return dao.actualizarFecha(Fecha);
	}

	@Override
	public List<Horario> listAll() {
		// TODO Auto-generated method stub
		return dao.listacompleta();
	}

	@Override
	public Horario findById(int id) {
		// TODO Auto-generated method stub
		return dao.busquedaporId(id);
	}

	@Override
	public Horario findByDate(Date fecha) {
		// TODO Auto-generated method stub
		return dao.busquedaporfecha(fecha);
	}

	@Override
	public Horario deleteById(int id) {
		// TODO Auto-generated method stub
		return dao.eliminarporId(id);
	}

}
