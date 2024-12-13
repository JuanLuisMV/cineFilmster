package co.edu.ue.entity;

import java.io.Serializable;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the ingresos database table.
 * 
 */
@Entity
@Table(name="ingresos")
@NamedQuery(name="Ingreso.findAll", query="SELECT i FROM Ingreso i")
public class Ingreso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_ingreso")
	private int idIngreso;

	@Column(name="fecha_actualizacion")
	private Timestamp fechaActualizacion;

	@Column(name="id_pelicula")
	private int idPelicula;

	@Column(name="total_recaudado")
	private BigDecimal totalRecaudado;

	public Ingreso() {
	}

	public int getIdIngreso() {
		return this.idIngreso;
	}

	public void setIdIngreso(int idIngreso) {
		this.idIngreso = idIngreso;
	}

	public Timestamp getFechaActualizacion() {
		return this.fechaActualizacion;
	}

	public void setFechaActualizacion(Timestamp fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}

	public int getIdPelicula() {
		return this.idPelicula;
	}

	public void setIdPelicula(int idPelicula) {
		this.idPelicula = idPelicula;
	}

	public BigDecimal getTotalRecaudado() {
		return this.totalRecaudado;
	}

	public void setTotalRecaudado(BigDecimal totalRecaudado) {
		this.totalRecaudado = totalRecaudado;
	}

}