package core;
import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Mascota implements Serializable {
	
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "MascotaId")
	private int id;
	
	//@Column(name = "RAZA")
	private Raza raza;
	
	@OneToOne(optional = false, cascade =  CascadeType.PERSIST)
	@JoinColumn(name = "duenoId")
	private Usuario dueno;
	
	//@Column(name = "FICHA")
	//private List<CampoFicha> ficha;
	
	@OneToOne(optional = false, cascade =  CascadeType.PERSIST)
	@JoinColumn(name = "veterinarioId")
	private Usuario veterinario;
	
	
	@OneToMany( mappedBy = "mascota",cascade = CascadeType.ALL)
	private List<Evento> eventos;
	
	
	public Mascota() {
		
	}
	
	
	
	public Mascota(Raza raza, Usuario dueno, List<CampoFicha> ficha, Usuario veterinario, List<Evento> eventos) {
		
		this.raza = raza;
		this.dueno = dueno;
		//this.ficha = ficha;
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

	public Usuario getDueno() {
		return dueno;
	}
	public void setDueno(Usuario dueno) {
		this.dueno = dueno;
	}
	//public List<CampoFicha> getCampoFicha() {
	//	return ficha;
	//}
	//public void setCampoFicha(List<CampoFicha> ficha) {
	//	this.ficha = ficha;
	//}
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
