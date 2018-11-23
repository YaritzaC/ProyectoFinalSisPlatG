package pe.edu.upeu.Spring01.entity;

public class OrdenCompra {

	private int idordencompra;
	private int idproveedor;
	private int idempleado;
	private String codigo;
	private String tipo;
	private String fecha;
	private String estado;
	
	public OrdenCompra() {
		super();
	}

	public OrdenCompra(int idordencompra, int idproveedor, int idempleado, String codigo, String tipo, String fecha,
			String estado) {
		super();
		this.idordencompra = idordencompra;
		this.idproveedor = idproveedor;
		this.idempleado = idempleado;
		this.codigo = codigo;
		this.tipo = tipo;
		this.fecha = fecha;
		this.estado = estado;
	}

	public int getIdordencompra() {
		return idordencompra;
	}

	public void setIdordencompra(int idordencompra) {
		this.idordencompra = idordencompra;
	}

	public int getIdproveedor() {
		return idproveedor;
	}

	public void setIdproveedor(int idproveedor) {
		this.idproveedor = idproveedor;
	}

	public int getIdempleado() {
		return idempleado;
	}

	public void setIdempleado(int idempleado) {
		this.idempleado = idempleado;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
