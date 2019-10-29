package implementacionDAO;

import clasesDAO.UsuarioDAO;
import core.Usuario;



public class UsuarioDAOHibernateJPA extends GenericDAOHibernateJPA<Usuario> implements UsuarioDAO {
	public UsuarioDAOHibernateJPA() {
		super(Usuario.class);
	}

	
	
}