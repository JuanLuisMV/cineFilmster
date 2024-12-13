package co.edu.ue.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ue.dao.IadministradorDao;
import co.edu.ue.entity.Administradore;
@Service
public class adminService implements IadminService {
	
	@Autowired
	IadministradorDao dao;

	@Override
	public List<Administradore> saveAdmin(Administradore Admin) {
		// TODO Auto-generated method stub
		return dao.guardarAdmin(Admin);
	}

	@Override
	public Administradore upAdmin(Administradore Admin) {
		// TODO Auto-generated method stub
		return dao.actualizarAdmin(Admin);
	}

	@Override
	public List<Administradore> listacompleta() {
		// TODO Auto-generated method stub
		return dao.listacompleta();
	}

	@Override
	public Administradore findById(int id) {
		// TODO Auto-generated method stub
		return dao.busquedaporId(id);
	}

	@Override
	public Administradore findByfecha(Date fecha) {
		// TODO Auto-generated method stub
		return dao.busquedaporfecha(fecha);
	}

	@Override
	public Administradore deleteById(int id) {
		// TODO Auto-generated method stub
		return dao.eliminarporId(id);
	}

	@Override
	public Administradore findByemail(String email) {
		// TODO Auto-generated method stub
		return dao.busquedaporemail(email);
	}

}
