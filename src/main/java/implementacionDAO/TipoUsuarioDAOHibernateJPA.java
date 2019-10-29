package implementacionDAO;

import clasesDAO.TipoUsuarioDAO;
import core.TipoUsuario;



public class TipoUsuarioDAOHibernateJPA extends GenericDAOHibernateJPA<TipoUsuario> implements TipoUsuarioDAO {
	public TipoUsuarioDAOHibernateJPA() {
		super(TipoUsuario.class);
	}

	
	
}