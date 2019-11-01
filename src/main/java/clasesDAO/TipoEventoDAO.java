package clasesDAO;

import core.TipoEvento;

public interface TipoEventoDAO extends GenericDAO<TipoEvento> 
{
	TipoEvento recuperarPorDescripcion(String descripcion);
}
