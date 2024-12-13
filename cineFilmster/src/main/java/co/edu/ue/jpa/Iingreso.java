package co.edu.ue.jpa;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ue.entity.Ingreso;

public interface Iingreso extends JpaRepository<Ingreso, Integer> {
	
	Ingreso findByfechaActualizacion(Date fecha);
	

}
