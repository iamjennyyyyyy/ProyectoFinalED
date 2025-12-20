package Logica;

import java.util.List;

public class Enfermedad {

	private String nombre;
	private List<String> sintomasClave;
	private boolean requiereContactos;
	private boolean requiereViajes;
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public List<String> getSintomasClave() {
		return sintomasClave;
	}
	
	public void setSintomasClave(List<String> sintomasClave) {
		this.sintomasClave = sintomasClave;
	}
	
	public boolean isRequiereContactos() {
		return requiereContactos;
	}
	
	public void setRequiereContactos(boolean requiereContactos) {
		this.requiereContactos = requiereContactos;
	}
	
	public boolean isRequiereViajes() {
		return requiereViajes;
	}
	
	public void setRequiereViajes(boolean requiereViajes) {
		this.requiereViajes = requiereViajes;
	}

}
