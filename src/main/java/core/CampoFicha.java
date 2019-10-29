package core;
import java.io.Serializable;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CAMPOFICHA")
public class CampoFicha implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private int id;
	
	@Column(name = "DATOSPUBLICOS")
	private List<String> datosPublicos;
	
	@Column(name = "VALOR")
	private String valor;
	
	@Column(name = "MASCOTA")
	private Mascota mascota;
	
	@Column(name = "VISIBILIDAD")
	private Boolean visibilidad;
	
	@Column(name = "NOMBRECAMPO")
	private NombreCampo nombreCampo;
	
	
	public CampoFicha() {
	
	}
	
	public CampoFicha(List<String> datosPublicos, String valor, Mascota mascota, Boolean visibilidad,
			NombreCampo nombreCampo) {
		
		this.datosPublicos = datosPublicos;
		this.valor = valor;
		this.mascota = mascota;
		this.visibilidad = visibilidad;
		this.nombreCampo = nombreCampo;
	}

	public NombreCampo getNombreCampo() {
		return nombreCampo;
	}
	public void setNombreCampo(NombreCampo nombreCampo) {
		this.nombreCampo = nombreCampo;
	}
	public Boolean getVisibilidad() {
		return visibilidad;
	}
	public void setVisibilidad(Boolean visibilidad) {
		this.visibilidad = visibilidad;
	}
	public List<String> getDatosPublicos() {
		return datosPublicos;
	}
	public void setDatosPublicos(List<String> datosPublicos) {
		this.datosPublicos = datosPublicos;
	}
	public String getvalor() {
		return valor;
	}
	public void setvalor(String valor) {
		this.valor = valor;
	}
	public Mascota getMascota() {
		return mascota;
	}
	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
