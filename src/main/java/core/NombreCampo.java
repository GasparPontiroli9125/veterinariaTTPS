package core;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "NOMBRECAMPO")
public class NombreCampo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name = "CAMPO_ID")
	private int id;
	
	@Column(name = "NOMBRE")
	private String nombre;
	
	public NombreCampo() {}
	
	@OneToMany(mappedBy = "campo", cascade = CascadeType.ALL)
    private List<CampoFicha> ficha;
	
	public NombreCampo(String nombre) {		
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
