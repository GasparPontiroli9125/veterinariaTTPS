package core;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="CAMPOFICHA")

public class CampoFicha implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue
    @Column(name = "CAMPOFICHA_ID")
	private long id;

	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "MascotaId")
	private Mascota mascota;

	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "CAMPO_ID")
	private NombreCampo campo;	
	
	@Column(name = "VISIBILIDAD")
	private Boolean visibilidad;
	
	@Column(name = "VALOR")
	private String valor;
	
	public Mascota getMascota() {
		return mascota;
	}
	
    public long getId() {
        return id;
    }
    
	public void setId(long id) {
		this.id = id;
	}
    
	public NombreCampo getCampo() {
		return campo;
	}

	public void setCampo(NombreCampo campo) {
		this.campo = campo;
	}

	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}
	
	public Boolean getVisibilidad() {
		return visibilidad;
	}
	
	public void setVisibilidad(Boolean visibilidad) {
		this.visibilidad = visibilidad;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}
}
