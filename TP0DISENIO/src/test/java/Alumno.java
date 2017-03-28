import java.util.List;

import javax.ws.rs.core.MediaType;

import org.uqbar.commons.utils.Observable;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;

@Observable

public class Alumno {
	private double legajo;
	private String nombre;
	private String token;
	private List<Asginacion> listaAsignaciones;
	
	public void Autenticarse(){
		 Client.create()
         .resource("http://notitas.herokuapp.com")
         .path("student")
         .header("Authorization", "Bearer ACA_VA_TU_TOKEN")
         .accept(MediaType.APPLICATION_JSON) 
         .get(ClientResponse.class);

	}

	public double getLegajo() {
		return legajo;
	}

	public void setLegajo(double legajo) {
		this.legajo = legajo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public List<Asginacion> getListaAsignaciones() {
		return listaAsignaciones;
	}

	public void setListaAsignaciones(List<Asginacion> listaAsignaciones) {
		this.listaAsignaciones = listaAsignaciones;
	}
}
