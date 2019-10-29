package implementacionDAO;

import clasesDAO.NombreCampoDAO;
import core.NombreCampo;



public class NombreCampoDAOHibernateJPA extends GenericDAOHibernateJPA<NombreCampo> implements NombreCampoDAO {
	public NombreCampoDAOHibernateJPA() {
		super(NombreCampo.class);
	}

	
	
}