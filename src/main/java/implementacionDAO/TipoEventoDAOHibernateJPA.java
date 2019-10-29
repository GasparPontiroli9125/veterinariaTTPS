package implementacionDAO;

import clasesDAO.TipoEventoDAO;
import core.TipoEvento;



public class TipoEventoDAOHibernateJPA extends GenericDAOHibernateJPA<TipoEvento> implements TipoEventoDAO {
	public TipoEventoDAOHibernateJPA() {
		super(TipoEvento.class);
	}

	
	
}