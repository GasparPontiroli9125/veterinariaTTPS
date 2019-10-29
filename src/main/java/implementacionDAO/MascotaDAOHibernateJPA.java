package implementacionDAO;

import clasesDAO.MascotaDAO;
import core.Mascota;



public class MascotaDAOHibernateJPA extends GenericDAOHibernateJPA<Mascota> implements MascotaDAO {
	public MascotaDAOHibernateJPA() {
		super(Mascota.class);
	}

	
	
}