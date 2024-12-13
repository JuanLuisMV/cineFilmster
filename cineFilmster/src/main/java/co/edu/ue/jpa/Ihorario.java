package co.edu.ue.jpa;

import java.util.Date;


import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ue.entity.Horario;

public interface Ihorario extends JpaRepository<Horario, Integer>{
	
	Horario findByFecha(Date fecha);

}
