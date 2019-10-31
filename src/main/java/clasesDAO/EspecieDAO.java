package clasesDAO;

import core.Especie;

public interface EspecieDAO extends GenericDAO<Especie> 
{
	Especie recuperarPorDescripcion(String descripcion);
}
