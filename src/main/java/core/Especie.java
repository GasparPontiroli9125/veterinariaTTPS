package core;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ESPECIE")
public class Especie implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private int id;
	
	@Column(name = "DESCRIPCION")
	private String descripcion;
	
	@Column(name = "RAZAS")
	private List<Raza> razas;
	
	
	public Especie() {
		
	}
	
	
	
	public Especie(String descripcion, List<Raza> razas) {
		
		this.descripcion = descripcion;
		this.razas = razas;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public List<Raza> getRazas() {
		return razas;
	}
	public void setRazas(List<Raza> razas) {
		this.razas = razas;
	}
}
