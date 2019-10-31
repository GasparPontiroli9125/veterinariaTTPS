import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import clasesDAO.*;
import core.*;
import implementacionDAO.DaoFactory;

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
	static UsuarioDAO uDao 						= DaoFactory.getUsuarioDAO();
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
		
		Raza perro1 = new Raza("Labrador",perro);
		razas.add(perro1);
		Raza perro2 = new Raza("Chihuahua",perro);
		razas.add(perro2);
		Raza perro3 = new Raza("Dogo",perro);
		razas.add(perro3);
		
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
		
		//Guardo las razas
		for(Raza r : razas)
		{
			razaDAO.persistir(r);
		}
		
		
		//Guardo los Tipos de Evento
		TipoEvento tipoEvento1 = new TipoEvento("Consulta");
		tipoEventoDAO.persistir(tipoEvento1);
		TipoEvento tipoEvento2 = new TipoEvento("Vacunacion");
		tipoEventoDAO.persistir(tipoEvento2);
		TipoEvento tipoEvento3 = new TipoEvento("Enfermedad");
		tipoEventoDAO.persistir(tipoEvento3);
		TipoEvento tipoEvento4 = new TipoEvento("Intervencion Quirurgica");
		tipoEventoDAO.persistir(tipoEvento4);
		TipoEvento tipoEvento5 = new TipoEvento("Desparacitacion");
		tipoEventoDAO.persistir(tipoEvento5);
		TipoEvento tipoEvento6 = new TipoEvento("Historial Reproductivo");
		tipoEventoDAO.persistir(tipoEvento6);
		
		//Guardo los Tipos de Usuarios
		TipoUsuario tipoUsuario1 = new TipoUsuario("Administrador");
		tipoUsuarioDAO.persistir(tipoUsuario1);
		TipoUsuario tipoUsuario2 = new TipoUsuario("Veterinario");
		tipoUsuarioDAO.persistir(tipoUsuario2);
		TipoUsuario tipoUsuario3 = new TipoUsuario("Dueño");
		tipoUsuarioDAO.persistir(tipoUsuario3);
		
		
	
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		
		CargaInicial();
		
		Especie esp = especieDAO.recuperarPorDescripcion("Perro");
		
		esp.setDescripcion("PERROLUCHO");
		
		especieDAO.actualizar(esp);
		
		System.out.print(esp.getDescripcion());
	
		EspecieDAO especieDAO 			= DaoFactory.getEspecieDAO();
	
		
		Especie perro 	= especieDAO.recuperar(1);
		Especie gato 	= especieDAO.recuperar(2);

		
		
		
		LocalDate d = LocalDate.now();
		
		Informacion info = new Informacion(1.1, "ibu", "golpe", "reposo");
		
		Mascota mascota = new Mascota(new Raza(), new ArrayList<CampoFicha>(), null, null);
		
		Evento evento = new Evento(mascota,new TipoEvento("consulta"),d,info);
		Evento evento2 = new Evento(mascota,new TipoEvento("Hola"),d,info);
		
		List<Evento> eventos = new ArrayList<Evento>();
		
		eventos.add(evento);
		eventos.add(evento2);
		
		mascota.setEventos(eventos);
		
		
		
		Raza raza1 = new Raza("Labrador2",perro);
		
		Raza raza2 = new Raza("Siamese2",gato);
		
		mascota.setRaza(raza1);		
		
		Mascota m = mascotaDao.persistir(mascota);
		
		Mascota mascota2 = new Mascota(new Raza(), new ArrayList<CampoFicha>(), null, null);

		mascota2.setRaza(raza2);
		
		Mascota m2 = mascotaDao.persistir(mascota2);		
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		TipoUsuario tipoAdministrador = new TipoUsuario("administrador");
		TipoUsuario tipoDueno = new TipoUsuario("dueno");
		TipoUsuario tipoVeterinario = new TipoUsuario("veterinario");
		
		
		
		List<Mascota> listaMascotas = new ArrayList<Mascota>();		
		
		Usuario adm = new Usuario("usuAdm","123","Juan", "Carlos", "1111", "prueba@prueba.com",null, tipoAdministrador, null);
		Usuario dueno = new Usuario("usuDue","123","Gaspar", "Pontiroli", "222", "gas@par.com", null, tipoDueno, null);
		Usuario vet = new Usuario("usuVet","123","El", "Ima", "333", "ima@22.com", new InformacionVeterinaria(), tipoVeterinario, null);		

		listaMascotas.add(m);
		listaMascotas.add(m2);
		
		dueno.setMascotas(listaMascotas);
		vet.setMascotas(listaMascotas);
		
		uDao.persistir(adm);
		uDao.persistir(dueno);
		
		InformacionVeterinaria infoVet1 = new InformacionVeterinaria("veterinaria lucho","16 y 59");
		vet.setVeterinaria(infoVet1);
		
		uDao.persistir(vet);
		
		Mascota mrec = mascotaDao.recuperar(m.getId());
		
		List<Usuario> usuariosDeLaMascota = mrec.getUsuarios();
		
		
		///INITIAL TESTING FICHA MASCOTA y CAMPO
		
			
		NombreCampo campoNombre = new NombreCampo("Nombre");
		
		campoDao.persistir(campoNombre);
		

		
		CampoFicha unCampoFicha = new CampoFicha();
		unCampoFicha.setCampo(campoNombre);
		unCampoFicha.setMascota(mrec);
		unCampoFicha.setVisibilidad(true);
		unCampoFicha.setValor("Firulo");
		 
		fichaDao.persistir(unCampoFicha);
		
		
		System.out.print("FIN");

	}
}