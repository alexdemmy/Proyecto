package controllers;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import model.*;
import util.MemoryStore;

@Named("personasController")
@RequestScoped
public class PersonasBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
	private MemoryStore ms;
		
	public List<Persona> getPersonas() {
		return ms.getPersonas();
	}
}
