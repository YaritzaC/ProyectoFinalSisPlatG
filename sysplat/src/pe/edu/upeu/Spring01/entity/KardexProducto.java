package pe.edu.upeu.Spring01.entity;

public class KardexProducto {

	private int idkarpro;
	private int idventa;
	private int idsede;
	private int idcmp;
	private String numdoc;
	private String fecha;
	private String movimiento;
	private int stockActual;
	private String concepto;
	private String estado;
	
	public KardexProducto() {
		super();
	}

	public KardexProducto(int idkarpro, int idventa, int idsede, int idcmp, String numdoc, String fecha,
			String movimiento, int stockActual, String concepto, String estado) {
		super();
		this.idkarpro = idkarpro;
		this.idventa = idventa;
		this.idsede = idsede;
		this.idcmp = idcmp;
		this.numdoc = numdoc;
		this.fecha = fecha;
		this.movimiento = movimiento;
		this.stockActual = stockActual;
		this.concepto = concepto;
		this.estado = estado;
	}

	public int getIdkarpro() {
		return idkarpro;
	}

	public void setIdkarpro(int idkarpro) {
		this.idkarpro = idkarpro;
	}

	public int getIdventa() {
		return idventa;
	}

	public void setIdventa(int idventa) {
		this.idventa = idventa;
	}

	public int getIdsede() {
		return idsede;
	}

	public void setIdsede(int idsede) {
		this.idsede = idsede;
	}

	public int getIdcmp() {
		return idcmp;
	}

	public void setIdcmp(int idcmp) {
		this.idcmp = idcmp;
	}

	public String getNumdoc() {
		return numdoc;
	}

	public void setNumdoc(String numdoc) {
		this.numdoc = numdoc;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getMovimiento() {
		return movimiento;
	}

	public void setMovimiento(String movimiento) {
		this.movimiento = movimiento;
	}

	public int getStockActual() {
		return stockActual;
	}

	public void setStockActual(int stockActual) {
		this.stockActual = stockActual;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}	
	
}
