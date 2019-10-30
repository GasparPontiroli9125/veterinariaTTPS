import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import clasesDAO.EventoDAO;
import clasesDAO.InformacionDAO;
import clasesDAO.InformacionVeterinariaDAO;
import clasesDAO.MascotaDAO;
import clasesDAO.UsuarioDAO;
import core.CampoFicha;
import core.Evento;
import core.Informacion;
import core.InformacionVeterinaria;
import core.Mascota;
import core.Raza;
import core.TipoEvento;
import core.TipoUsuario;
import core.Usuario;
import implementacionDAO.DaoFactory;

public class TestInformacion {

	public static void main(String[] args) {
	
		EventoDAO eventoDao = DaoFactory.getEventoDAO();
		MascotaDAO mascotaDao = DaoFactory.getMascotaDAO();
		LocalDate d = LocalDate.now();
		Informacion info = new Informacion(1.1, "ibu", "golpe", "reposo");
		Mascota mascota = new Mascota(new Raza(), new Usuario(), new ArrayList<CampoFicha>(), new Usuario(),null);
		Evento evento = new Evento(mascota,new TipoEvento("consulta"),d,info);
		Evento evento2 = new Evento(mascota,new TipoEvento("Hola"),d,info);
		List<Evento> eventos = new ArrayList<Evento>();
		eventos.add(evento);
		eventos.add(evento2);
		
		mascota.setEventos(eventos);
		
		
		
		Mascota m = mascotaDao.persistir(mascota);
		
		Mascota mascota2 = new Mascota(new Raza(), new Usuario(), new ArrayList<CampoFicha>(), new Usuario(),null);

		Mascota m2 = mascotaDao.persistir(mascota2);
		
		
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		TipoUsuario tipoAdministrador = new TipoUsuario("administrador");
		TipoUsuario tipoDueno = new TipoUsuario("dueno");
		TipoUsuario tipoVeterinario = new TipoUsuario("veterinario");
		
		UsuarioDAO uDao = DaoFactory.getUsuarioDAO();
		
		List<Mascota> listaMascotas = new ArrayList<Mascota>();
		
		listaMascotas.add(mascota);
		listaMascotas.add(mascota2);
		
		Usuario adm = new Usuario("usuAdm","123","Juan", "Carlos", "1111", "prueba@prueba.com",null, tipoAdministrador,null,null);
		Usuario dueno = new Usuario("usuDue","123","Gaspar", "Pontiroli", "222", "gas@par.com", null, tipoDueno,null,null);
		Usuario vet = new Usuario("usuVet","123","El", "Ima", "333", "ima@22.com", new InformacionVeterinaria(), tipoVeterinario,null,null);
		
		dueno.setMascotasDueno(listaMascotas);
		vet.setMascotasVeterinario(listaMascotas);
		
		uDao.persistir(adm);
		uDao.persistir(dueno);
		
		
		
		InformacionVeterinaria infoVet1 = new InformacionVeterinaria("veterinaria lucho","16 y 59");
		vet.setVeterinaria(infoVet1);
		
		uDao.persistir(vet);
		
		
		System.out.print("hola");

	}
}