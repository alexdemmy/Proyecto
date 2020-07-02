package controllers;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import util.MemoryStore;
import model.Auto;
import model.Persona;

@Named("auto")
@RequestScoped

public class AutoBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String codigoAuto;
	private String marca;
	private String año;
	private String placa;
	private Persona dueño;

	@Inject
	private MemoryStore ms;

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

	public MemoryStore getMs() {
		return ms;
	}

	public void setMs(MemoryStore ms) {
		this.ms = ms;
	}

	private List<String> años;

	public List<String> getAños() {
		return años;
	}

	@PostConstruct
	public void inicializar() {
		años = new ArrayList<>();
		Calendar actual = GregorianCalendar.getInstance();
		int anioActual = actual.get(Calendar.YEAR);
		int anioInicial = anioActual - 20;
		int anioFinal = anioActual;
		for (int anio = anioFinal; anio >= anioInicial; anio--) {
			años.add(String.valueOf(anio));
		}
	}

	public String registrar(String identificacion) {
		Auto auto = new Auto();
		Persona dueño = ms.getPersona(identificacion);
		auto.setCodigoAuto(codigoAuto);
		auto.setPlaca(placa);
		auto.setMarca(marca);
		auto.setAño(año);
		auto.setDueño(dueño);
		ms.addAuto(auto);
		return "registroauto";
	}

}

	

   

  



