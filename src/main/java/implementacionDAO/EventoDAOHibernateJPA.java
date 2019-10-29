package implementacionDAO;

import clasesDAO.EventoDAO;
import core.Evento;



public class EventoDAOHibernateJPA extends GenericDAOHibernateJPA<Evento> implements EventoDAO {
	public EventoDAOHibernateJPA() {
		super(Evento.class);
	}

	
	
}