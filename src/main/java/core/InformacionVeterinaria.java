package core;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
//@Table(name = "INFORMACIONVETERINARIA")
public class InformacionVeterinaria implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	//@Id
	//@GeneratedValue
	//@Column(name = "ID")
	private int id;
	
	//@Column(name = "NOMBRECLINICA")
	private String nombreClinica;
	
	//@Column(name = "DOMICILIOCLINICA")
	private String domicilioClinica;
	
	
	
	public InformacionVeterinaria() {
		
	}
	
	public InformacionVeterinaria(String nombreClinica, String domicilioClinica) {
		
		this.nombreClinica = nombreClinica;
		this.domicilioClinica = domicilioClinica;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	

	public String getNombreClinica() {
		return nombreClinica;
	}
	public void setNombreClinica(String nombreClinica) {
		this.nombreClinica = nombreClinica;
	}
	public String getDomicilioClinica() {
		return domicilioClinica;
	}
	public void setDomicilioClinica(String domicilioClinica) {
		this.domicilioClinica = domicilioClinica;
	}

}
