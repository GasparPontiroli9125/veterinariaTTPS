import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import clasesDAO.EventoDAO;
import clasesDAO.InformacionDAO;
import clasesDAO.MascotaDAO;
import core.CampoFicha;
import core.Evento;
import core.Informacion;
import core.Mascota;
import core.Raza;
import core.TipoEvento;
import core.Usuario;
import implementacionDAO.DaoFactory;

public class TestInformacion {

	public static void main(String[] args) {
	
		
		EventoDAO eventoDao = DaoFactory.getEventoDAO();
		MascotaDAO mascotaDao = DaoFactory.getMascotaDAO();
		
		LocalDate d = LocalDate.now();

		
		Informacion info = new Informacion(1.1, "ibu", "golpe", "reposo");
		
		Mascota mascota = new Mascota(new Raza(), new Usuario(), new ArrayList<CampoFicha>(), new Usuario(),null);
		
		Mascota m = mascotaDao.persistir(mascota);
		
		Evento evento = new Evento(m,new TipoEvento("consulta"),d,info);
		Evento evento2 = new Evento(m,new TipoEvento("Hola"),d,info);
		List<Evento> eventos = new ArrayList<Evento>();
		eventos.add(evento);
		eventos.add(evento2);
		
		
		
		
		Evento e = eventoDao.persistir(evento);
		
		
		System.out.print("hola");

	}
}