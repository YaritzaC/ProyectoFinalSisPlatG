package pe.edu.upeu.Spring01.serviceImp;



import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.Spring01.daoImp.ClienteDaoImp;
import pe.edu.upeu.Spring01.entity.Cliente;
import pe.edu.upeu.Spring01.service.ClienteService;
@Service
public class ClienteServiceImp implements ClienteService {
	
	@Autowired
    private ClienteDaoImp cli;
	@Override
	public Cliente buscarCliente(String c) {
		// TODO Auto-generated method stub
		return cli.buscarCliente(c);
	}
	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return cli.readAll();
	}

}
