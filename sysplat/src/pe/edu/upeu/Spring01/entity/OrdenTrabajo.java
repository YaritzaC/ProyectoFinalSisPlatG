package pe.edu.upeu.Spring01.entity;

public class OrdenTrabajo {
private int idordentrabajo;
private int idempleado;
private int idpedido;
private String fechainicio;
private String fechafin;
private String codigo;
private String fechaactualizada;
private String estado;


public OrdenTrabajo(int idempleado, int idpedido) {
	super();
	this.idempleado = idempleado;
	this.idpedido = idpedido;
}
public OrdenTrabajo() {
	super();
}
public OrdenTrabajo(int idordentrabajo, int idempleado, String fechainicio, String fechafin, String codigo,
		String fechaactualizada, String estado) {
	super();
	this.idordentrabajo = idordentrabajo;
	this.idempleado = idempleado;
	this.fechainicio = fechainicio;
	this.fechafin = fechafin;
	this.codigo = codigo;
	this.fechaactualizada = fechaactualizada;
	this.estado = estado;
}




public int getIdpedido() {
	return idpedido;
}
public void setIdpedido(int idpedido) {
	this.idpedido = idpedido;
}
public int getIdordentrabajo() {
	return idordentrabajo;
}
public void setIdordentrabajo(int idordentrabajo) {
	this.idordentrabajo = idordentrabajo;
}
public int getIdempleado() {
	return idempleado;
}
public void setIdempleado(int idempleado) {
	this.idempleado = idempleado;
}
public String getFechainicio() {
	return fechainicio;
}
public void setFechainicio(String fechainicio) {
	this.fechainicio = fechainicio;
}
public String getFechafin() {
	return fechafin;
}
public void setFechafin(String fechafin) {
	this.fechafin = fechafin;
}
public String getCodigo() {
	return codigo;
}
public void setCodigo(String codigo) {
	this.codigo = codigo;
}
public String getFechaactualizada() {
	return fechaactualizada;
}
public void setFechaactualizada(String fechaactualizada) {
	this.fechaactualizada = fechaactualizada;
}
public String getEstado() {
	return estado;
}
public void setEstado(String estado) {
	this.estado = estado;
}
}
