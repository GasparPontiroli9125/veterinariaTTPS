package implementacionDAO;

import clasesDAO.EspecieDAO;
import core.Especie;



public class EspecieDAOHibernateJPA extends GenericDAOHibernateJPA<Especie> implements EspecieDAO {
	public EspecieDAOHibernateJPA() {
		super(Especie.class);
	}

	
	
}