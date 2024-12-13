package co.edu.ue.dao;

import java.util.Date;
import java.util.List;

import co.edu.ue.entity.Genero;
import co.edu.ue.entity.Horario;

public interface IgeneroDao {

    List<Genero> guardarGenero(Genero genero);
	
	Genero actualizarGenero(Genero genero);
	
	List<Genero> listacompleta();
	
	Genero busquedaporId(int id);
	
	Genero eliminarporId(int id);
	
}
