package co.edu.ue.service;

import java.util.Date;
import java.util.List;

import co.edu.ue.entity.Reserva;

public interface IreservaService {

	List<Reserva> saveReserva(Reserva reserva);
	
	Reserva upReserva(Reserva reserva);
	
	List<Reserva> listacompleta();
	
	Reserva findById(int id);
	
	Reserva findByfecha(Date fecha);
	
	Reserva deleteById(int id);
	
}
