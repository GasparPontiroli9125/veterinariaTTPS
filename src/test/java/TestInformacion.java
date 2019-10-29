import clasesDAO.InformacionDAO;
import core.Informacion;
import implementacionDAO.DaoFactory;

public class TestInformacion {

	public static void main(String[] args) {
	
		
		InformacionDAO infoDao = DaoFactory.getInformacionDAO();

		Informacion info = new Informacion(1.1, "ibu", "golpe", "reposo");
		

		infoDao.persistir(info);
		
		boolean existe = infoDao.existe(4);
		
		if(existe)
		{
			System.out.print("La informacion existe");
		}
		else
		{
			System.out.print("La informacion no existe");
		}
		
		Informacion infoRecu = infoDao.recuperar(24);
		
		String texto = infoRecu.getDiagnostico();
		
		System.out.print(texto);

	}
}