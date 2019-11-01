import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import clasesDAO.*;
import core.*;
import implementacionDAO.DaoFactory;
import implementacionDAO.UsuarioDAOHibernateJPA;

@SuppressWarnings("unused")
public class TestInformacion {
	
	//Inicializo los DAO's
	
	static EspecieDAO especieDAO 				= DaoFactory.getEspecieDAO();
	static RazaDAO razaDAO 						= DaoFactory.getRazaDAO();
	static TipoEventoDAO tipoEventoDAO 			= DaoFactory.getTipoEventoDAO();
	static TipoUsuarioDAO tipoUsuarioDAO 		= DaoFactory.getTipoUsuarioDAO();
	static CampoFichaDAO fichaDao 				= DaoFactory.getCampoFichaDAO();
	static NombreCampoDAO campoDao 				= DaoFactory.getNombreCampoDAO();
	static EventoDAO eventoDao 					= DaoFactory.getEventoDAO();
	static MascotaDAO mascotaDao 				= DaoFactory.getMascotaDAO();
	static UsuarioDAO usuarioDao 				= DaoFactory.getUsuarioDAO();
	static InformacionVeterinariaDAO infoVetDao = DaoFactory.getInformacionVeterinariaDAO();
	static InformacionDAO infoDao 				= DaoFactory.getInformacionDAO();
	
	static void CargaInicial() {	
		
		Especie perro 	= new Especie("Perro");
		Especie gato 	= new Especie("Gato");
		Especie ave 	= new Especie("Ave");
		
		//Guardo las Especies
		especieDAO.persistir(perro);
		especieDAO.persistir(gato);
		especieDAO.persistir(ave);
		
		List<Raza> razas = new ArrayList<Raza>();
		
		Raza perro1 = new Raza("Labrador", perro);
		razas.add(perro1);
		
		Raza perro2 = new Raza("Chihuahua",perro);
		razas.add(perro2);
		
		Raza perro3 = new Raza("Dogo",perro);
		razas.add(perro3);
		
		Raza perro4 = new Raza("Pitbull",perro);
		razas.add(perro4);
		
		Raza perro5 = new Raza("Mestizo",perro);
		razas.add(perro5);
		
		Raza gato1 = new Raza("Siames",gato);
		razas.add(gato1);
		
		Raza gato2 = new Raza("Persa",gato);
		razas.add(gato2);
		
		Raza gato3 = new Raza("Bengala",gato);
		razas.add(gato3);
				
		Raza ave1 = new Raza("Loro",ave);
		razas.add(ave1);
		
		Raza ave2 = new Raza("Papagayo",ave);
		razas.add(ave2);
		
		Raza ave3 = new Raza("Canario",ave);
		razas.add(ave3);
		
		//Guardo las razas
		for(Raza r : razas)
		{
			razaDAO.persistir(r);
		}
		
		NombreCampo campoNombre = new NombreCampo("Nombre");
		NombreCampo campoFecha = new NombreCampo("FechaNacimiento");
		NombreCampo campoSexo = new NombreCampo("Sexo");
		NombreCampo campoRaza = new NombreCampo("Raza");
		NombreCampo campoEspecie = new NombreCampo("Especie");
		NombreCampo campoColor = new NombreCampo("Color");
		NombreCampo campoSenia = new NombreCampo("Señas Particulares");
		NombreCampo campoVeterinario = new NombreCampo("Veterinario");
		
		campoDao.persistir(campoNombre);
		campoDao.persistir(campoFecha);
		campoDao.persistir(campoSexo);
		campoDao.persistir(campoRaza);
		campoDao.persistir(campoEspecie);
		campoDao.persistir(campoColor);
		campoDao.persistir(campoSenia);
		campoDao.persistir(campoVeterinario);
		
		//Guardo los Tipos de Evento
		TipoEvento tipoEvento1 = new TipoEvento("Visita al Veterinario");
		tipoEventoDAO.persistir(tipoEvento1);
		TipoEvento tipoEvento2 = new TipoEvento("Vacunacion");
		tipoEventoDAO.persistir(tipoEvento2);
		TipoEvento tipoEvento3 = new TipoEvento("Enfermedad");
		tipoEventoDAO.persistir(tipoEvento3);
		TipoEvento tipoEvento4 = new TipoEvento("Intervención Quirurgica");
		tipoEventoDAO.persistir(tipoEvento4);
		TipoEvento tipoEvento5 = new TipoEvento("Desparasitacion");
		tipoEventoDAO.persistir(tipoEvento5);
		TipoEvento tipoEvento6 = new TipoEvento("Historial Reproductivo");
		tipoEventoDAO.persistir(tipoEvento6);
		
		//Guardo los Tipos de Usuarios
		TipoUsuario tipoUsuario1 = new TipoUsuario("Administrador");
		tipoUsuarioDAO.persistir(tipoUsuario1);
		TipoUsuario tipoUsuario2 = new TipoUsuario("Veterinario");
		tipoUsuarioDAO.persistir(tipoUsuario2);
		TipoUsuario tipoUsuario3 = new TipoUsuario("Dueno");
		tipoUsuarioDAO.persistir(tipoUsuario3);		
	}
	
	public static void main(String[] args) {		
		
		CargaInicial();
		
		TipoUsuario administrador = tipoUsuarioDAO.recuperarPorNombreDescripcion(TipoUsuario.class, "descripcion", "Administrador");
		TipoUsuario duenio = tipoUsuarioDAO.recuperarPorNombreDescripcion(TipoUsuario.class, "descripcion", "Dueno");
		TipoUsuario veterinario = tipoUsuarioDAO.recuperarPorNombreDescripcion(TipoUsuario.class, "descripcion", "Veterinario");
		
		Usuario duenioDe2Mascotas = new Usuario("juan", "1234", "Juan", "Alvarez", "221532355", "juanalvarez@gmail.com", duenio);
		usuarioDao.persistir(duenioDe2Mascotas);
		
		Usuario duenioDe3Mascotas = new Usuario("luchop", "2468", "Luciano", "Luna", "42345554", "lpaga@mail.com", duenio);
		usuarioDao.persistir(duenioDe3Mascotas);
		
		Usuario veterinarioHombre = new Usuario("imrod", "1234", "Imanol", "Gonzalez", "223464568", "imrod@gmail.com", veterinario);
		usuarioDao.persistir(veterinarioHombre);
		
		Usuario veterinarioMujer = new Usuario("yane", "423555", "Yanela", "Nicola", "2144454", "nicolayane@hotmail.com", veterinario);
		usuarioDao.persistir(veterinarioMujer);
		
		Usuario unAdmin = new Usuario("root", "1234", "Gaspar", "Perez", "221532355", "gaspar@gmail.com", administrador);
		usuarioDao.persistir(unAdmin);
				
		Raza labrador = razaDAO.recuperarPorNombreDescripcion(Raza.class, "descripcion", "Labrador");
		Raza mestizo = razaDAO.recuperarPorNombreDescripcion(Raza.class, "descripcion", "Mestizo");
		Raza canario = razaDAO.recuperarPorNombreDescripcion(Raza.class, "descripcion", "Canario");
		
		TipoEvento consulta = tipoEventoDAO.recuperarPorNombreDescripcion(TipoEvento.class, "nombre", "Visita al Veterinario");
		TipoEvento intervencion = tipoEventoDAO.recuperarPorNombreDescripcion(TipoEvento.class, "nombre", "Intervención Quirurgica");
		TipoEvento desparacitacion = tipoEventoDAO.recuperarPorNombreDescripcion(TipoEvento.class, "nombre", "Desparasitacion");
		
		LocalDate d = LocalDate.now();		
		
		Mascota nuevoPerro = new Mascota(labrador);
		Mascota nuevoCanario = new Mascota(canario);
		mascotaDao.persistir(nuevoPerro);
		mascotaDao.persistir(nuevoCanario);
		
		nuevoPerro.setDuenio(duenioDe2Mascotas);
		nuevoCanario.setDuenio(duenioDe2Mascotas);
		
		mascotaDao.actualizar(nuevoPerro);
		mascotaDao.actualizar(nuevoCanario);
		
		System.out.print("FIN");

	}
}