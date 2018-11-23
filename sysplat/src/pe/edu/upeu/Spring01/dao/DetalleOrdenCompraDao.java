package pe.edu.upeu.Spring01.dao;

import java.sql.SQLException;
import java.util.List;


public interface DetalleOrdenCompraDao {
	public int create(DetalleOrdenCompraDao detalleordcom) throws SQLException;

	public int update(DetalleOrdenCompraDao detalleordcom);

	public int delete(int id);

	public DetalleOrdenCompraDao read(int id);

	public List<DetalleOrdenCompraDao> readAll();

}
