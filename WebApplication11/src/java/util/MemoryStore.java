package util;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;

import model.Auto;
//import com.transito.model.Auto;
import model.Persona;

@SessionScoped
public class MemoryStore implements Serializable {

	private static final long serialVersionUID = 1L;

	private HashMap<String, Persona> personas;
	private HashMap<String, Auto> autos;

	@PostConstruct
	public void inicializar() {
		personas = new HashMap<>();
		autos = new HashMap<>();

	}

	public void addPersona(Persona persona) {
		String nombre = persona.getNombre();

		if (personas.containsKey(nombre)) {
			personas.remove(nombre);
		}
		personas.put(nombre, persona);
	}

	public List<Persona> getPersonas() {
		return new ArrayList<>(personas.values());
	}

	public Persona getPersona(String nombre) {
		return personas.get(nombre);
	}

	public void addAuto(Auto auto) {
		String id = auto.getCodigoAuto();
		if (autos.containsKey(id)) {
		autos.remove(id);
		}
		autos.put(id, auto);
		}

	public List<Auto> getAutos() {
		return new ArrayList<>(autos.values());
		}

	///*public void editPersona(Persona persona) {
		//String identificacion = persona.getIdentificacion();
		//if (personas.containsKey(identificacion)) {
		//	personas.put(identificacion, persona);
		//}
	//}*/

}
