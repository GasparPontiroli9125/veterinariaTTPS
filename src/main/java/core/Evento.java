package core;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "MascotaId")
	private Mascota mascota;
	
	@OneToOne(optional = true, cascade = CascadeType.ALL)
	@JoinColumn(name="TipoEventoId")
	private TipoEvento tipoEvento;
	
	@Column(name = "FECHA")
	private LocalDate fecha;
	
	//@ManyToOne(cascade = CascadeType.ALL)
	@OneToOne(optional = true, cascade = CascadeType.ALL)
	@JoinColumn(name = "InformacionId")
	private Informacion informacion;
	
	public Evento() {
		
	}
	
	public Evento( Mascota mascota,TipoEvento tipoEvento, LocalDate fecha,Informacion info) {
		
		this.mascota = mascota;
		this.tipoEvento = tipoEvento;
		this.fecha = fecha;
		this.informacion = info;
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
	
	public Informacion getInformacion() {
		return informacion;
	}

	public void setInformacion(Informacion informacion) {
		this.informacion = informacion;
	}
}
