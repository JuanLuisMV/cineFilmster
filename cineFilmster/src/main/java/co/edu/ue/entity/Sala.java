package co.edu.ue.entity;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.List;


/**
 * The persistent class for the salas database table.
 * 
 */
@Entity
@Table(name="salas")
@NamedQuery(name="Sala.findAll", query="SELECT s FROM Sala s")
public class Sala implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_sala")
	private int idSala;

	private String estado;

	private String fila;

	@Column(name="numero_puesto")
	private int numeroPuesto;

	//bi-directional many-to-one association to Horario
	@OneToMany(mappedBy="sala")
	private List<Horario> horarios;

	public Sala() {
	}

	public int getIdSala() {
		return this.idSala;
	}

	public void setIdSala(int idSala) {
		this.idSala = idSala;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getFila() {
		return this.fila;
	}

	public void setFila(String fila) {
		this.fila = fila;
	}

	public int getNumeroPuesto() {
		return this.numeroPuesto;
	}

	public void setNumeroPuesto(int numeroPuesto) {
		this.numeroPuesto = numeroPuesto;
	}

	public List<Horario> getHorarios() {
		return this.horarios;
	}

	public void setHorarios(List<Horario> horarios) {
		this.horarios = horarios;
	}

	public Horario addHorario(Horario horario) {
		getHorarios().add(horario);
		horario.setSala(this);

		return horario;
	}

	public Horario removeHorario(Horario horario) {
		getHorarios().remove(horario);
		horario.setSala(null);

		return horario;
	}

}