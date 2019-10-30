package core;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
//@Table(name = "USUARIO")
public class Usuario implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	//@Id
	//@GeneratedValue
	//@Column(name = "ID")
	private int id;
	
	//@Column(name = "NOMBRE")
	private String nombre;
	
	//@Column(name = "APELLIDO")
	private String apellido;
	
	//@Column(name = "TELEFONO")
	private String telefono;
	
	//@Column(name = "EMAIL")
	private String email;
	
	//@Column(name = "VETERINARIA")
	private InformacionVeterinaria veterinaria;
	
	//@Column(name = "TIPO")
	private TipoUsuario tipo;
	
	
	public Usuario() {
		
	}
	
	
	
	public Usuario(String nombre, String apellido, String telefono, String email, InformacionVeterinaria veterinaria,
			TipoUsuario tipo) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.email = email;
		this.veterinaria = veterinaria;
		this.tipo = tipo;
	}



	public TipoUsuario getTipo() {
		return tipo;
	}
	public void setTipo(TipoUsuario tipo) {
		this.tipo = tipo;
	}
	
	public InformacionVeterinaria getVeterinaria() {
		return veterinaria;
	}
	public void setVeterinaria(InformacionVeterinaria veterinaria) {
		this.veterinaria = veterinaria;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
