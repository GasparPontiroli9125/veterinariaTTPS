package implementacionDAO;

import java.io.Serializable;

import javax.persistence.Query;

import clasesDAO.EspecieDAO;
import core.Especie;

public class EspecieDAOHibernateJPA extends GenericDAOHibernateJPA<Especie> implements EspecieDAO {
	public EspecieDAOHibernateJPA() {
		super(Especie.class);
	}
	
	public Especie recuperarPorDescripcion(String descripcion) {
		Query consulta= EMF.getEMF().createEntityManager().createQuery
				("SELECT e FROM " +  getPersistentClass().getName() +" e WHERE e.descripcion='"+ descripcion+"'" );
	
		
		@SuppressWarnings("unchecked")
		Especie resultado = (Especie) consulta.getSingleResult();
		return resultado;
	}	
}