package co.edu.ue.dao;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.edu.ue.entity.Reserva;
import co.edu.ue.jpa.Ireserva;

@Repository
public class reservaDao implements IreservaDao {
	
	@Autowired
	Ireserva jpa;

	@Override
	public List<Reserva> guardarReserva(Reserva reserva) {
		jpa.save(reserva);
		return listacompleta();
	}

	@Override
	public Reserva actualizarReserva(Reserva reserva) {
		// TODO Auto-generated method stub
		return jpa.save(reserva);
	}

	@Override
	public List<Reserva> listacompleta() {
		// TODO Auto-generated method stub
		return jpa.findAll();
	}

	@Override
	public Reserva busquedaporId(int id) {
		// TODO Auto-generated method stub
		return jpa.findById(id).orElse(null);
	}

	@Override
	public Reserva busquedaporfecha(Date fecha) {
		// TODO Auto-generated method stub
		return jpa.findByFechaReserva(fecha);
	}

	@Override
	public Reserva eliminarporId(int id) {
		// TODO Auto-generated method stub
		jpa.deleteById(id);
		return null;
	}

	
}
