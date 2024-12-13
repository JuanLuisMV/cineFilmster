package co.edu.ue.service;

import java.util.Date;
import java.util.List;

import co.edu.ue.entity.Administradore;

public interface IadminService {
	 List<Administradore> saveAdmin(Administradore Admin);
		
	    Administradore upAdmin(Administradore Admin);
		
		List<Administradore> listacompleta();
		
		Administradore findById(int id);
		
		Administradore findByfecha(Date fecha);
		
		Administradore deleteById(int id);
		
		Administradore findByemail(String email);
}
