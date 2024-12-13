package co.edu.ue.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ue.dao.IreservaDao;
import co.edu.ue.entity.Reserva;
@Service
public class reservaService implements IreservaService {
	
	@Autowired
	IreservaDao dao;

	@Override
	public List<Reserva> saveReserva(Reserva reserva) {
		// TODO Auto-generated method stub
		return dao.guardarReserva(reserva);
	}

	@Override
	public Reserva upReserva(Reserva reserva) {
		// TODO Auto-generated method stub
		return dao.actualizarReserva(reserva);
	}

	@Override
	public List<Reserva> listacompleta() {
		// TODO Auto-generated method stub
		return dao.listacompleta();
	}

	@Override
	public Reserva findById(int id) {
		// TODO Auto-generated method stub
		return dao.busquedaporId(id);
	}

	@Override
	public Reserva findByfecha(Date fecha) {
		// TODO Auto-generated method stub
		return dao.busquedaporfecha(fecha);
	}

	@Override
	public Reserva deleteById(int id) {
		// TODO Auto-generated method stub
		return dao.eliminarporId(id);
	}
	
	

}
