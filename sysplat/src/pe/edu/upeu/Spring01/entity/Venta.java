package pe.edu.upeu.Spring01.entity;

public class Venta {
	private int idventa;
	private int idempleado;
	private int idsede;
	private int idcliente;
	private int idhojacontrato;
	private String fecha;
	private String tipopago;
	private double total;
	private double igv;
	private double subtotal;
	private String tipodocumento;
	private String numero;
	private String serie;
	private String estado;

	
	public Venta() {
		super();
	}
	
	
	public Venta(int idempleado, int idsede, int idcliente, String tipopago, double total, String tipodocumento) {
		super();
		this.idempleado = idempleado;
		this.idsede = idsede;
		this.idcliente = idcliente;
		this.tipopago = tipopago;
		this.total = total;
		this.tipodocumento = tipodocumento;
	}
	
	

	public Venta(int idempleado, int idsede, int idcliente, int idhojacontrato, String tipopago, double total) {
		super();
		this.idempleado = idempleado;
		this.idsede = idsede;
		this.idcliente = idcliente;
		this.idhojacontrato = idhojacontrato;
		this.tipopago = tipopago;
		this.total = total;
	}


	public int getIdventa() {
		return idventa;
	}

	public void setIdventa(int idventa) {
		this.idventa = idventa;
	}

	public int getIdempleado() {
		return idempleado;
	}

	public void setIdempleado(int idempleado) {
		this.idempleado = idempleado;
	}

	public int getIdsede() {
		return idsede;
	}

	public void setIdsede(int idsede) {
		this.idsede = idsede;
	}

	public int getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}

	public int getIdhojacontrato() {
		return idhojacontrato;
	}

	public void setIdhojacontrato(int idhojacontrato) {
		this.idhojacontrato = idhojacontrato;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getTipopago() {
		return tipopago;
	}

	public void setTipopago(String tipopago) {
		this.tipopago = tipopago;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getIgv() {
		return igv;
	}

	public void setIgv(double igv) {
		this.igv = igv;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	public String getTipodocumento() {
		return tipodocumento;
	}

	public void setTipodocumento(String tipodocumento) {
		this.tipodocumento = tipodocumento;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
}
