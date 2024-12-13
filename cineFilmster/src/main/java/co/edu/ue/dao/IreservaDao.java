package co.edu.ue.dao;

import java.util.Date;
import java.util.List;
import co.edu.ue.entity.Reserva;

public interface IreservaDao {
	
	
	List<Reserva> guardarReserva(Reserva reserva);
	
	Reserva actualizarReserva(Reserva reserva);
	
	List<Reserva> listacompleta();
	
	Reserva busquedaporId(int id);
	
	Reserva busquedaporfecha(Date fecha);
	
	Reserva eliminarporId(int id);
	
	
}

