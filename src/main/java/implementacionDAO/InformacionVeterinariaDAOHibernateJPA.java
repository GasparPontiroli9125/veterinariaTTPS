package implementacionDAO;

import clasesDAO.InformacionVeterinariaDAO;
import core.InformacionVeterinaria;



public class InformacionVeterinariaDAOHibernateJPA extends GenericDAOHibernateJPA<InformacionVeterinaria> implements InformacionVeterinariaDAO {
	public InformacionVeterinariaDAOHibernateJPA() {
		super(InformacionVeterinaria.class);
	}

	
	
}