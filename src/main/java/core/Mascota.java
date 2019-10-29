package core;
import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MASCOTA")
public class Mascota implements Serializable {
	
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "ID")
	private int id;
	
	@Column(name = "RAZA")
	private Raza raza;
	
	@Column(name = "DUENO")
	private Usuario due�o;
	
	@Column(name = "FICHA")
	private List<CampoFicha> ficha;
	
	@Column(name = "VETERINARIO")
	private Usuario veterinario;
	
	@Column(name = "EVENTOS")
	private List<Evento> eventos;
	
	
	public Mascota() {
		
	}
	
	
	
	public Mascota(Raza raza, Usuario due�o, List<CampoFicha> ficha, Usuario veterinario, List<Evento> eventos) {
		
		this.raza = raza;
		this.due�o = due�o;
		this.ficha = ficha;
		this.veterinario = veterinario;
		this.eventos = eventos;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public Raza getRaza() {
		return raza;
	}
	public void setRaza(Raza raza) {
		this.raza = raza;
	}

	public Usuario getDue�o() {
		return due�o;
	}
	public void setDue�o(Usuario due�o) {
		this.due�o = due�o;
	}
	public List<CampoFicha> getCampoFicha() {
		return ficha;
	}
	public void setCampoFicha(List<CampoFicha> ficha) {
		this.ficha = ficha;
	}
	public Usuario getVeterinario() {
		return veterinario;
	}
	public void setVeterinario(Usuario veterinario) {
		this.veterinario = veterinario;
	}
	public List<Evento> getEventos() {
		return eventos;
	}
	public void setEventos(List<Evento> eventos) {
		this.eventos = eventos;
	}
}
