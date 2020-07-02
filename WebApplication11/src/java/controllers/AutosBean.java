package controllers;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import util.MemoryStore;
import model.Auto;
@Named("autos")
@RequestScoped

public class AutosBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
	private MemoryStore ms;
	public List<Auto> getAutos() {
	return ms.getAutos();
	}

}