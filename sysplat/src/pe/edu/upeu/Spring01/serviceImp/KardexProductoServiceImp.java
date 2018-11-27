package pe.edu.upeu.Spring01.serviceImp;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.Spring01.daoImp.KardexProductoDaoImp;
import pe.edu.upeu.Spring01.entity.KardexProducto;
import pe.edu.upeu.Spring01.service.KardexProductoService;
@Service
public class KardexProductoServiceImp implements KardexProductoService {
	
	@Autowired
	private KardexProductoDaoImp karpro;
	@Override
	public int crearKardexProducto(KardexProducto kardexproducto) throws SQLException {
		// TODO Auto-generated method stub
		return karpro.crearKardexProducto(kardexproducto);
	}

}
