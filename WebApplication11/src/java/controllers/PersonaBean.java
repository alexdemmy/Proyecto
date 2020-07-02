package controllers;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import util.MemoryStore;
import model.Persona;

@Named("persona")
@RequestScoped
public class PersonaBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String codigo;
	private String nombre;
	private int edad;
	private String direccion;
	private String correo;
	private String telefono;
	private String estadoCivil;

	@Inject
	private MemoryStore ms;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

	
        
        
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	

	public String registrar() {
		Persona nuevaPersona = new Persona();
		nuevaPersona.setNombre(nombre);
		nuevaPersona.setEdad(edad);
		nuevaPersona.setDireccion(direccion);
		nuevaPersona.setCorreo(correo);
		nuevaPersona.setEstadoCivil(estadoCivil);
		nuevaPersona.setTelefono(telefono);
		ms.addPersona(nuevaPersona);
		return "registrado";
	}

	
}
