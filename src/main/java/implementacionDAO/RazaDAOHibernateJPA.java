package implementacionDAO;

import clasesDAO.RazaDAO;
import core.Raza;



public class RazaDAOHibernateJPA extends GenericDAOHibernateJPA<Raza> implements RazaDAO {
	public RazaDAOHibernateJPA() {
		super(Raza.class);
	}

	
	
}