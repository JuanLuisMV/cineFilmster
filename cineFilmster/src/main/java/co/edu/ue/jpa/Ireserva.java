package co.edu.ue.jpa;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ue.entity.Reserva;

public interface Ireserva extends JpaRepository<Reserva, Integer>{

	
	Reserva findByFechaReserva(Date fecha);
}
