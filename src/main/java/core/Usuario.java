package core;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table()
public class Usuario implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name = "UsuId")
	private int id;
	
	@Column
	private String nombreUsuario;
	
	@Column
	private String contrasena;
	
	@Column
	private String nombre;
	
	@Column
	private String apellido;
	
	@Column
	private String telefono;
	
	@Column
	private String email;
	
	@OneToOne(optional = true, cascade = CascadeType.ALL)
	private InformacionVeterinaria veterinaria;
	
	@OneToOne(optional = false,  cascade = CascadeType.ALL)
	@JoinColumn(name="tipoUsuarioId")
	private TipoUsuario tipo;
	
	@OneToMany(mappedBy = "veterinario", cascade = CascadeType.PERSIST)
	private List<Mascota> mascotasVeterinario;
	
	@OneToMany(mappedBy = "dueno", cascade = CascadeType.PERSIST)
	private List<Mascota> mascotasDueno;
	
	public Usuario() {
		
	}
	
	public Usuario(String nombreUsuario, String contrasena, String nombre, String apellido, String telefono,
			String email, InformacionVeterinaria veterinaria, TipoUsuario tipo, List<Mascota> mascotasVeterinario,
			List<Mascota> mascotasDueno) {
		this.nombreUsuario = nombreUsuario;
		this.contrasena = contrasena;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.email = email;
		this.veterinaria = veterinaria;
		this.tipo = tipo;
		this.mascotasVeterinario = mascotasVeterinario;
		this.mascotasDueno = mascotasDueno;
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
	
	public List<Mascota> getMascotasVeterinario() {
		return mascotasVeterinario;
	}

	public void setMascotasVeterinario(List<Mascota> mascotasVeterinario) {
		this.mascotasVeterinario = mascotasVeterinario;
	}
	
	public List<Mascota> getMascotasDueno() {
		return mascotasDueno;
	}

	public void setMascotasDueno(List<Mascota> mascotasDueno) {
		this.mascotasDueno = mascotasDueno;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

}
