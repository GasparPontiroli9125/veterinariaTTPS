import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import clasesDAO.*;
import core.*;
import implementacionDAO.DaoFactory;
import implementacionDAO.UsuarioDAOHibernateJPA;

@SuppressWarnings("unused")
public class TestVeterinaria {
	
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
		
		NombreCampo campoNombre 		= new NombreCampo("Nombre");
		NombreCampo campoFecha 			= new NombreCampo("FechaNacimiento");
		NombreCampo campoSexo 			= new NombreCampo("Sexo");
//		NombreCampo campoRaza 			= new NombreCampo("Raza");
//		NombreCampo campoEspecie 		= new NombreCampo("Especie");
		NombreCampo campoColor 			= new NombreCampo("Color");
		NombreCampo campoSenia 			= new NombreCampo("Señas Particulares");
//		NombreCampo campoVeterinario 	= new NombreCampo("Veterinario");
		
		campoDao.persistir(campoNombre);
		campoDao.persistir(campoFecha);
		campoDao.persistir(campoSexo);
//		campoDao.persistir(campoRaza);
//		campoDao.persistir(campoEspecie);
		campoDao.persistir(campoColor);
		campoDao.persistir(campoSenia);
//		campoDao.persistir(campoVeterinario);
		
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
	
	@SuppressWarnings("serial")
	public static void main(String[] args) {		
		
		CargaInicial();
		
		// Test de Usuarios
		
		TipoUsuario administrador = tipoUsuarioDAO.recuperarPorNombreDescripcion(TipoUsuario.class, "descripcion", "Administrador");
		TipoUsuario duenio 		  = tipoUsuarioDAO.recuperarPorNombreDescripcion(TipoUsuario.class, "descripcion", "Dueno");
		TipoUsuario veterinario   = tipoUsuarioDAO.recuperarPorNombreDescripcion(TipoUsuario.class, "descripcion", "Veterinario");
		
		Usuario duenioDe2Mascotas 	= new Usuario("juan", "1234", "Juan", "Alvarez", "221532355", "juanalvarez@gmail.com", duenio);
		usuarioDao.persistir(duenioDe2Mascotas);
		
		Usuario duenioDe3Mascotas 	= new Usuario("luchop", "2468", "Luciano", "Luna", "42345554", "lpaga@mail.com", duenio);
		usuarioDao.persistir(duenioDe3Mascotas);
		
		Usuario veterinarioHombre 	= new Usuario("imrod", "1234", "Imanol", "Gonzalez", "223464568", "imrod@gmail.com", veterinario);
		usuarioDao.persistir(veterinarioHombre);
		
		Usuario veterinarioMujer 	= new Usuario("yane", "423555", "Yanela", "Nicola", "2144454", "nicolayane@hotmail.com", veterinario);
		usuarioDao.persistir(veterinarioMujer);
		
		Usuario unAdmin 			= new Usuario("root", "1234", "Gaspar", "Perez", "221532355", "gaspar@gmail.com", administrador);
		usuarioDao.persistir(unAdmin);
		
		
		InformacionVeterinaria vet1= new InformacionVeterinaria("la clinica el perro feliz", "calle falsa 123");
		
		InformacionVeterinaria vet2= new InformacionVeterinaria("el gato pomposo", "la feliz 405");
		
		veterinarioHombre.setVeterinaria(vet1);
		veterinarioMujer.setVeterinaria(vet2);
		
		usuarioDao.actualizar(veterinarioMujer);
		usuarioDao.actualizar(veterinarioHombre);
		
		//Test de Mascotas
				
		Raza labrador 	= razaDAO.recuperarPorNombreDescripcion(Raza.class, "descripcion", "Labrador");
		Raza mestizo 	= razaDAO.recuperarPorNombreDescripcion(Raza.class, "descripcion", "Mestizo");
		Raza canario 	= razaDAO.recuperarPorNombreDescripcion(Raza.class, "descripcion", "Canario");
		
		TipoEvento consulta 		= tipoEventoDAO.recuperarPorNombreDescripcion(TipoEvento.class, "nombre", "Visita al Veterinario");
		TipoEvento intervencion 	= tipoEventoDAO.recuperarPorNombreDescripcion(TipoEvento.class, "nombre", "Intervención Quirurgica");
		TipoEvento desparacitacion 	= tipoEventoDAO.recuperarPorNombreDescripcion(TipoEvento.class, "nombre", "Desparasitacion");
		
		LocalDate d = LocalDate.now();
		
		Mascota nuevoPerro 		= new Mascota(labrador);
		Mascota nuevoCanario 	= new Mascota(canario);
		
		nuevoPerro		= mascotaDao.persistir(nuevoPerro);
	 	nuevoCanario	= mascotaDao.persistir(nuevoCanario);
	 	
	 	//Test Ficha Mascota
	 	List<CampoFicha> fichaNuevoPerro = new ArrayList<CampoFicha>();
	 	
	 	NombreCampo campoNombre = campoDao.recuperarPorNombreDescripcion(NombreCampo.class, "nombre", "Nombre");
	 	CampoFicha campo1 		= new CampoFicha(nuevoPerro,campoNombre,true,"Firulais");
	 	fichaNuevoPerro.add(campo1);
	 	
	 	NombreCampo campoSexo 	= campoDao.recuperarPorNombreDescripcion(NombreCampo.class, "nombre", "Sexo");
	 	CampoFicha campo2 		= new CampoFicha(nuevoPerro,campoSexo,true,"Macho");
	 	fichaNuevoPerro.add(campo2);
	 	
	 	NombreCampo campoFecha 	= campoDao.recuperarPorNombreDescripcion(NombreCampo.class, "nombre", "FechaNacimiento");
	 	CampoFicha campo3 		= new CampoFicha(nuevoPerro,campoFecha,false,"25/05/1991");
	 	fichaNuevoPerro.add(campo3);
	 	
	 	NombreCampo campoColor 	= campoDao.recuperarPorNombreDescripcion(NombreCampo.class, "nombre", "Color");
	 	CampoFicha campo4 		= new CampoFicha(nuevoPerro,campoColor,true,"Negro y Blanco");
	 	fichaNuevoPerro.add(campo4);
	 	
	 	NombreCampo campoSenias = campoDao.recuperarPorNombreDescripcion(NombreCampo.class, "nombre", "Señas Particulares");
	 	CampoFicha campo5 		= new CampoFicha(nuevoPerro,campoSenias,true,"Chico con un lunar en la trompa");
	 	fichaNuevoPerro.add(campo5);
		
		
	 	nuevoPerro.setFicha(fichaNuevoPerro);
	 	
	 	//Asigno veterinario a la mascota
	 	nuevoPerro.setVeterinario(veterinarioHombre);
	 	nuevoCanario.setVeterinario(veterinarioMujer);
	 	
	 	//Asigno duenio a la mascota
	 	nuevoPerro.setDuenio(duenioDe2Mascotas);
	 	nuevoCanario.setDuenio(duenioDe2Mascotas);
		
		nuevoPerro		= mascotaDao.actualizar(nuevoPerro);
		nuevoCanario	= mascotaDao.actualizar(nuevoCanario);
		
		//Test de Eventos de Mascotas
		
		List<Evento> eventos = new ArrayList<Evento>();
		
		LocalDate hoy = LocalDate.now();
		LocalDate ayer = LocalDate.of(2019, 10, 11);
		
		Informacion info1 = new Informacion(1,"droga1","diag1","indicacion1");
		Informacion info2 = new Informacion(2,"droga2","diag2","indicacion2");
		Informacion info3 = new Informacion(3,"droga3","diag3","indicacion3");

		
		
		Evento evento 	= new Evento(nuevoPerro,consulta,hoy,info1);
		Evento evento2 	= new Evento(nuevoPerro,intervencion,ayer,info2);
		Evento evento3 	= new Evento(nuevoCanario,desparacitacion,hoy,info3);
		
		eventoDao.persistir(evento);
		eventoDao.persistir(evento2);
		eventoDao.persistir(evento3);
		
		List<Evento> eventosPerro= new ArrayList<Evento>() {
			{ add(evento); add (evento2); }
		};
		
		List<Evento> eventosCanario = new ArrayList<Evento>() {
			{ add(evento3); }
		};
		
		nuevoPerro.setEventos(eventosPerro);
		nuevoCanario.setEventos(eventosCanario);
		
		nuevoPerro	 = mascotaDao.actualizar(nuevoPerro);
		nuevoCanario = mascotaDao.actualizar(nuevoCanario);
		
		// Borrado de una Mascota
		Mascota m = mascotaDao.recuperar(nuevoPerro.getId());
		
		mascotaDao.borrar(m);
		
	
		System.out.print("FIN");

	}
}