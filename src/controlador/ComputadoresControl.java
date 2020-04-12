package controlador;

import java.util.List;

import datos.ComputadorDAO;
import datos.IDAO;
import modelo.Computador;

public class ComputadoresControl implements IDAO{

	private ComputadorDAO dao;
	
	public ComputadoresControl() {
		dao = new ComputadorDAO();
	}
	
	@Override
	public List<Computador> listar(String condicion) {
		
		return dao.listar(condicion);
	}

	@Override
	public void insertar(Object obj) {
		
		dao.insertar(obj);
		
	}

	@Override
	public void modificar(Object obj) {
		dao.modificar(obj);
		
	}

	@Override
	public void eliminar(Object obj) {
		dao.eliminar(obj);
	}

}