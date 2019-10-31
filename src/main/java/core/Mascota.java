package core;
import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
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
	
	@OneToOne(optional = true, cascade = CascadeType.ALL)
	@JoinColumn(nullable = false)
	private Raza raza;
	
	@ManyToMany(mappedBy = "mascotas")
	private List<Usuario> usuarios;
	
	@OneToMany(mappedBy = "mascota", cascade = CascadeType.ALL)
	private List<Evento> eventos;	
	
	@OneToMany(mappedBy = "mascota", cascade = CascadeType.ALL)
    private List<CampoFicha> ficha;
	
	public Mascota() {}
	
	public Mascota(Raza raza, List<CampoFicha> ficha, List<Evento> eventos,List<Usuario>usuarios) {
		
		this.raza = raza;
		this.ficha = ficha;
		this.eventos = eventos;
		this.usuarios = usuarios;
	}
	
	public Mascota(List<Usuario>usuarios) {
		this.usuarios = usuarios;
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

	public List<CampoFicha> getCampoFicha() {
		return ficha;
	}
	
	public void setCampoFicha(List<CampoFicha> ficha) {
		this.ficha = ficha;
	}
	
	public List<Evento> getEventos() {
		return eventos;
	}
	
	public void setEventos(List<Evento> eventos) {
		this.eventos = eventos;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
}
