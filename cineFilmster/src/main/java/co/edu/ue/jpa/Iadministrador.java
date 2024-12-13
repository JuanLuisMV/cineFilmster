
package co.edu.ue.jpa;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ue.entity.Administradore;

public interface Iadministrador extends JpaRepository<Administradore, Integer> {

	
	Administradore findBycorreo(String email);
	Administradore findByfechaCreacion(Date fecha);
	
}
