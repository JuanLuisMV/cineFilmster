package co.edu.ue.jpa;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ue.entity.Boleta;

public interface Iboleta extends JpaRepository<Boleta, Integer> {
	Boleta findByfechaCompra(Date fecha);
}
