package controllers;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import model.*;

@Named("detallePersona")
@RequestScoped
public class DetallePersonaBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Persona persona;
	private FacesContext context;
	
	@PostConstruct
	public void inicializar() {
		context = FacesContext.getCurrentInstance();	
		persona = (Persona) context.getExternalContext().getRequestMap().get("persona");
	}
	
	public Persona getPersona() {
		return persona;
	}


}
