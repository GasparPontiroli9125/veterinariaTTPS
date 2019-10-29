package core;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "EVENTO")
public class Evento implements Serializable {
	

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private int id;
	
	@Column(name = "MASCOTA")
	private Mascota mascota;
	
	@OneToOne(optional = true)
	@Column(name = "TIPOEVENTO")
	private TipoEvento tipoEvento;
	
	@Column(name = "FECHA")
	private LocalDate fecha;
	
	@Column(name = "INFORMACIONES")
	private List<Informacion> informaciones;
	
	public Evento() {
		
	}
	
	public Evento(Mascota mascota, TipoEvento tipoEvento, LocalDate fecha, List<Informacion> informaciones) {
		
		this.mascota = mascota;
		this.tipoEvento = tipoEvento;
		this.fecha = fecha;
		this.informaciones = informaciones;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Mascota getMascota() {
		return mascota;
	}
	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}
	public TipoEvento getTipoEvento() {
		return tipoEvento;
	}
	public void setTipoEventos(TipoEvento tipoEvento) {
		this.tipoEvento = tipoEvento;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public List<Informacion> getInformaciones() {
		return informaciones;
	}
	public void setInformaciones(List<Informacion> informaciones) {
		this.informaciones = informaciones;
	}
}
