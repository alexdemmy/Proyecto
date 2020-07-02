package model;

public class Auto {
	
	private String codigo;
	private String codigoAuto;
	private String marca;
	private String año;
	private String placa;
	private Persona dueño;
	
	
	public String getCodigoAuto() {
		return codigoAuto;
	}
	public void setCodigoAuto(String codigoAuto) {
		this.codigoAuto = codigoAuto;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getAño() {
		return año;
	}
	public void setAño(String año) {
		this.año = año;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public Persona getDueño() {
		return dueño;
	}
	public void setDueño(Persona dueño) {
		this.dueño = dueño;
	}
	public String toString() {
		return "Nombres Completos: "+ this.getDueño().getNombre()+", Placa: "+ this.getPlaca() +" Año: "+ this.getAño();
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
}
