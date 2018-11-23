package pe.edu.upeu.Spring01.serviceImp;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.Spring01.daoImp.HojaContratoDaoImp;
import pe.edu.upeu.Spring01.entity.HojaContrato;
import pe.edu.upeu.Spring01.service.HojaContratoService;

@Service
public class HojaContratoServiceImp implements HojaContratoService{
	@Autowired
	private HojaContratoDaoImp hojacontrato;
	@Override
	public List<Map<String, Object>> hojaContrato(int codigopedido) {
		return hojacontrato.hojaContrato(codigopedido);
	}
	@Override
	public int crearHojaContrato(HojaContrato hoja) throws SQLException {
		return hojacontrato.crearHojaContrato(hoja);
	}
	@Override
	public List<Map<String, Object>> listar_hoja_contrato() {
		return hojacontrato.listar_hoja_contrato();
	}
}
