package implementacionDAO;

import clasesDAO.CampoFichaDAO;
import core.CampoFicha;



public class CampoFichaDAOHibernateJPA extends GenericDAOHibernateJPA<CampoFicha> implements CampoFichaDAO {
	public CampoFichaDAOHibernateJPA() {
		super(CampoFicha.class);
	}

	
	
}