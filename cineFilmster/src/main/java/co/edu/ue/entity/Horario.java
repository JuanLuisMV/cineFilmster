package co.edu.ue.entity;

import java.io.Serializable;
import jakarta.persistence.*;
import java.sql.Time;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the horarios database table.
 * 
 */
@Entity
@Table(name="horarios")
@NamedQuery(name="Horario.findAll", query="SELECT h FROM Horario h")
public class Horario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_horario")
	private int idHorario;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	private Time hora;

	//bi-directional many-to-one association to Pelicula
	@ManyToOne
	@JoinColumn(name="id_pelicula")
	private Pelicula pelicula;

	//bi-directional many-to-one association to Sala
	@ManyToOne
	@JoinColumn(name="id_sala")
	private Sala sala;

	//bi-directional many-to-one association to Reserva
	@OneToMany(mappedBy="horario")
	private List<Reserva> reservas;

	public Horario() {
	}

	public int getIdHorario() {
		return this.idHorario;
	}

	public void setIdHorario(int idHorario) {
		this.idHorario = idHorario;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Time getHora() {
		return this.hora;
	}

	public void setHora(Time hora) {
		this.hora = hora;
	}

	public Pelicula getPelicula() {
		return this.pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	public Sala getSala() {
		return this.sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	public List<Reserva> getReservas() {
		return this.reservas;
	}

	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}

	public Reserva addReserva(Reserva reserva) {
		getReservas().add(reserva);
		reserva.setHorario(this);

		return reserva;
	}

	public Reserva removeReserva(Reserva reserva) {
		getReservas().remove(reserva);
		reserva.setHorario(null);

		return reserva;
	}

}