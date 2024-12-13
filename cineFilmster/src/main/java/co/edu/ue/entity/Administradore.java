package co.edu.ue.entity;

import java.io.Serializable;
import jakarta.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the administradores database table.
 * 
 */
@Entity
@Table(name="administradores")
@NamedQuery(name="Administradore.findAll", query="SELECT a FROM Administradore a")
public class Administradore implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_admin")
	private int idAdmin;

	private String contraseña;

	private String correo;

	@Column(name="fecha_creacion")
	private Timestamp fechaCreacion;

	private String nombre;

	public Administradore() {
	}

	public int getIdAdmin() {
		return this.idAdmin;
	}

	public void setIdAdmin(int idAdmin) {
		this.idAdmin = idAdmin;
	}

	public String getContraseña() {
		return this.contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Timestamp getFechaCreacion() {
		return this.fechaCreacion;
	}

	public void setFechaCreacion(Timestamp fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}