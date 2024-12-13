package co.edu.ue.dao;

import java.util.List;

import co.edu.ue.entity.Pelicula;
import co.edu.ue.entity.Sala;

public interface IsalaDao {

	List<Sala> guardarSala(Sala sala);
	
	Sala actualizarSala(Sala sala);
	
	List<Sala> listacompleta();
	
	Sala busquedaporId(int id);
	
	Sala eliminarporId(int id);
	
}
