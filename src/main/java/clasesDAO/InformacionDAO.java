package clasesDAO;

import core.Informacion;

public interface InformacionDAO extends GenericDAO<Informacion> {
	
	public Informacion recuperarInformacion(int id);

}
