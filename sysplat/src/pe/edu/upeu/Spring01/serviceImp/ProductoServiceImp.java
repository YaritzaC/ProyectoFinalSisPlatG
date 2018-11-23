package pe.edu.upeu.Spring01.serviceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.Spring01.daoImp.ProductoDaoImp;
import pe.edu.upeu.Spring01.entity.Producto;
import pe.edu.upeu.Spring01.service.ProductoService;
@Service
public class ProductoServiceImp implements ProductoService {
	@Autowired
	private ProductoDaoImp pro;
	@Override
	public Producto buscarProducto(String p) {
		// TODO Auto-generated method stub
		return pro.buscarProducto(p);
	}
	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return pro.readAll();
	}

}
