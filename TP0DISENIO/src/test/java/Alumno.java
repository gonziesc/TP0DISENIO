import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import javax.ws.rs.GET;
import javax.ws.rs.core.MediaType;
import org.uqbar.commons.utils.Observable;
import org.json.JSONObject;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.WebResource.Builder;

@Observable

public class Alumno {
	private double legajo;
	private String first_name ;
	private String last_name;
	private String github_user;
	private String token;
	private List<Asignacion> assignments;
	
	public Alumno(double id,String nombre,String apellido,String git){
		legajo = id;
		first_name= nombre;
		last_name = apellido;
		github_user = git;
	}
	public Alumno(){
		
	}
    
	public Alumno Autenticarse(){
		 Gson gson = new Gson();
		 final String json=  Client.create()
				 .resource("http://notitas.herokuapp.com")
				 .path("student")
				 .header("Authorization", token)
				 .accept(MediaType.APPLICATION_JSON) 
				 .get(String.class);
		 Alumno alumnito = gson.fromJson(json, Alumno.class);
		 return alumnito;
	}
	
	public List<Asignacion> asignacionesAlumno(){
		Gson gson = new Gson();
		final String json=  Client.create()
		         .resource("http://notitas.herokuapp.com/student")
		         .path("assignments")
		         .header("Authorization", token)
		         .accept(MediaType.APPLICATION_JSON) 
		         .get(String.class);
		Alumno alumno = gson.fromJson(json, Alumno.class);
		List<Asignacion> asignaciones = alumno.getAssignments();
		return asignaciones;
		
	}

	
	public void RealizarCambio(){
		Alumno alumnito = new Alumno(111222333,"leonel","messi" ,"pechofrio"); //<---es para probar
		Gson gson = new Gson();
		String result = gson.toJson(alumnito);
		
		final String json=  Client.create()
		         .resource("http://notitas.herokuapp.com")
		         .path("student")
		         .header("Authorization", token)
		         .accept(MediaType.APPLICATION_JSON) 
		         .put(String.class, result);     
	}

	public double getLegajo() {
		return legajo;
	}

	public void setLegajo(double legajo) {
		this.legajo = legajo;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public List<Asignacion> getAssignments() {
		return assignments;
	}

	public void setAssignments(List<Asignacion> assignments) {
		this.assignments = assignments;
	}
}
