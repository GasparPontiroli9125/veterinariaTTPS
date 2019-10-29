package core;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TIPOUSUARIO")
public class TipoUsuario implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private int id;
	
	@Column(name = "DESCRIPCION")
	private String descripcion;
	
	
	public TipoUsuario() {
		
	}
	
	public TipoUsuario(String descripcion) {
		
		this.descripcion = descripcion;
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
}
