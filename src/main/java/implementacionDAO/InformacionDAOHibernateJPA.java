package implementacionDAO;

import clasesDAO.InformacionDAO;
import core.Informacion;



public class InformacionDAOHibernateJPA extends GenericDAOHibernateJPA<Informacion> implements InformacionDAO {
	public InformacionDAOHibernateJPA() {
		super(Informacion.class);
	}

	
	@Override
	public Informacion recuperarInformacion(int id) 
	{
		return this.recuperar(id);
	}
}