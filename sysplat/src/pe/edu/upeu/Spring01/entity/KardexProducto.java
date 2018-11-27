package pe.edu.upeu.Spring01.entity;

public class KardexProducto {
	private int idkardexproducto;
	private int idventa;
	private int idsede;
	private int idcompra;
	private String fecha;
	private String movimiento;
	private String concepto;
	private String estado;

	public KardexProducto() {
		super();
	}

	public KardexProducto(int idsede, String concepto) {
		super();
		this.idsede = idsede;
		this.concepto = concepto;
	}

	public int getIdkardexproducto() {
		return idkardexproducto;
	}

	public void setIdkardexproducto(int idkardexproducto) {
		this.idkardexproducto = idkardexproducto;
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

	public int getIdcompra() {
		return idcompra;
	}

	public void setIdcompra(int idcompra) {
		this.idcompra = idcompra;
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
