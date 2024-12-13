package co.edu.ue.jpa;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ue.entity.Cliente;

public interface Icliente extends JpaRepository<Cliente, Integer> {
	
	Cliente findByfechaCreacion(Date fecha);

}
