package implementacionDAO;
import javax.persistence.Query;

import clasesDAO.TipoEventoDAO;
import core.Especie;
import core.TipoEvento;

public class TipoEventoDAOHibernateJPA extends GenericDAOHibernateJPA<TipoEvento> implements TipoEventoDAO {
	public TipoEventoDAOHibernateJPA() {
		super(TipoEvento.class);
	}
	
	public TipoEvento recuperarPorDescripcion(String descripcion) {
		Query consulta= EMF.getEMF().createEntityManager().createQuery
				("SELECT e FROM " +  getPersistentClass().getName() +" e WHERE e.descripcion='"+ descripcion+"'" );	
		
		@SuppressWarnings("unchecked")
		TipoEvento resultado = (TipoEvento) consulta.getSingleResult();
		return resultado;
	}	
}