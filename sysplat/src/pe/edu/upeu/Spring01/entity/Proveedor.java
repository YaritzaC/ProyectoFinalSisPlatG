package pe.edu.upeu.Spring01.entity;

public class Proveedor {

	private int idproveedor;
	private String RUC;
	private String razonSocial;
	private String direccion;
	private String telefono;
	private String representante;
	private String estado;
	
	public Proveedor() {
		super();
	}

	public Proveedor(int idproveedor, String rUC, String razonSocial, String direccion, String telefono,
			String representante, String estado) {
		super();
		this.idproveedor = idproveedor;
		RUC = rUC;
		this.razonSocial = razonSocial;
		this.direccion = direccion;
		this.telefono = telefono;
		this.representante = representante;
		this.estado = estado;
	}

	public int getIdproveedor() {
		return idproveedor;
	}

	public void setIdproveedor(int idproveedor) {
		this.idproveedor = idproveedor;
	}

	public String getRUC() {
		return RUC;
	}

	public void setRUC(String rUC) {
		RUC = rUC;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getRepresentante() {
		return representante;
	}

	public void setRepresentante(String representante) {
		this.representante = representante;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
