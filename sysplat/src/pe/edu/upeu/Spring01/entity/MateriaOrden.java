package pe.edu.upeu.Spring01.entity;

public class MateriaOrden {
	
	private int idmateriaorden;
	private int idodt;
	private int idmtp;
	private String estado;
	
	public MateriaOrden(int idmtp) {
		super();
		this.idmtp = idmtp;
	}

	public MateriaOrden() {
		super();
	}

	
	public int getIdmateriaorden() {
		return idmateriaorden;
	}

	public void setIdmateriaorden(int idmateriaorden) {
		this.idmateriaorden = idmateriaorden;
	}

	public int getIdodt() {
		return idodt;
	}

	public void setIdodt(int idodt) {
		this.idodt = idodt;
	}

	public int getIdmtp() {
		return idmtp;
	}

	public void setIdmtp(int idmtp) {
		this.idmtp = idmtp;
	}
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
}
