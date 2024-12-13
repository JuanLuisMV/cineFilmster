package co.edu.ue.entity;

import java.io.Serializable;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the boletas database table.
 * 
 */
@Entity
@Table(name="boletas")
@NamedQuery(name="Boleta.findAll", query="SELECT b FROM Boleta b")
public class Boleta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_boleta")
	private int idBoleta;

	@Column(name="fecha_compra")
	private Timestamp fechaCompra;

	private String fila;

	@Column(name="id_cliente")
	private int idCliente;

	@Column(name="id_pelicula")
	private int idPelicula;

	@Column(name="id_sala")
	private int idSala;

	@Column(name="metodo_pago")
	private String metodoPago;

	@Column(name="numero_puesto")
	private int numeroPuesto;

	private BigDecimal precio;

	public Boleta() {
	}

	public int getIdBoleta() {
		return this.idBoleta;
	}

	public void setIdBoleta(int idBoleta) {
		this.idBoleta = idBoleta;
	}

	public Timestamp getFechaCompra() {
		return this.fechaCompra;
	}

	public void setFechaCompra(Timestamp fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public String getFila() {
		return this.fila;
	}

	public void setFila(String fila) {
		this.fila = fila;
	}

	public int getIdCliente() {
		return this.idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public int getIdPelicula() {
		return this.idPelicula;
	}

	public void setIdPelicula(int idPelicula) {
		this.idPelicula = idPelicula;
	}

	public int getIdSala() {
		return this.idSala;
	}

	public void setIdSala(int idSala) {
		this.idSala = idSala;
	}

	public String getMetodoPago() {
		return this.metodoPago;
	}

	public void setMetodoPago(String metodoPago) {
		this.metodoPago = metodoPago;
	}

	public int getNumeroPuesto() {
		return this.numeroPuesto;
	}

	public void setNumeroPuesto(int numeroPuesto) {
		this.numeroPuesto = numeroPuesto;
	}

	public BigDecimal getPrecio() {
		return this.precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

}