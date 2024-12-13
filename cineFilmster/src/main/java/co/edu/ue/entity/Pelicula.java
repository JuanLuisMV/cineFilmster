package co.edu.ue.entity;

import java.io.Serializable;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the peliculas database table.
 * 
 */
@Entity
@Table(name="peliculas")
@NamedQuery(name="Pelicula.findAll", query="SELECT p FROM Pelicula p")
public class Pelicula implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_pelicula")
	private int idPelicula;

	private String director;

	private int duracion;

	private String estado;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_estreno")
	private Date fechaEstreno;

	@Column(name="id_genero")
	private int idGenero;

	@Column(name="id_proveedor")
	private int idProveedor;

	private BigDecimal puntuacion;

	@Lob
	private String sinopsis;

	private String titulo;

	//bi-directional many-to-one association to Horario
	@OneToMany(mappedBy="pelicula")
	private List<Horario> horarios;

	public Pelicula() {
	}

	public int getIdPelicula() {
		return this.idPelicula;
	}

	public void setIdPelicula(int idPelicula) {
		this.idPelicula = idPelicula;
	}

	public String getDirector() {
		return this.director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getDuracion() {
		return this.duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getFechaEstreno() {
		return this.fechaEstreno;
	}

	public void setFechaEstreno(Date fechaEstreno) {
		this.fechaEstreno = fechaEstreno;
	}

	public int getIdGenero() {
		return this.idGenero;
	}

	public void setIdGenero(int idGenero) {
		this.idGenero = idGenero;
	}

	public int getIdProveedor() {
		return this.idProveedor;
	}

	public void setIdProveedor(int idProveedor) {
		this.idProveedor = idProveedor;
	}

	public BigDecimal getPuntuacion() {
		return this.puntuacion;
	}

	public void setPuntuacion(BigDecimal puntuacion) {
		this.puntuacion = puntuacion;
	}

	public String getSinopsis() {
		return this.sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public List<Horario> getHorarios() {
		return this.horarios;
	}

	public void setHorarios(List<Horario> horarios) {
		this.horarios = horarios;
	}

	public Horario addHorario(Horario horario) {
		getHorarios().add(horario);
		horario.setPelicula(this);

		return horario;
	}

	public Horario removeHorario(Horario horario) {
		getHorarios().remove(horario);
		horario.setPelicula(null);

		return horario;
	}

}