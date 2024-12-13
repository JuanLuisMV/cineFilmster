package co.edu.ue.jpa;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ue.entity.Pelicula;

public interface Ipelicula extends JpaRepository<Pelicula, Integer> {

	Pelicula findByfechaEstreno(Date fecha);
	 
}
