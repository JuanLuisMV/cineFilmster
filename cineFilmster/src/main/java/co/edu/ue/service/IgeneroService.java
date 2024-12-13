package co.edu.ue.service;

import java.util.List;

import co.edu.ue.entity.Genero;

public interface IgeneroService {
List<Genero> saveGenero(Genero genero);
	
	Genero upGenero(Genero genero);
	
	List<Genero> listAll();
	
	Genero findById(int id);
	
	Genero deleteById(int id);
}
