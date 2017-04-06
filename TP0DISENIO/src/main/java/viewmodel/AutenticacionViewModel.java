package viewmodel;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.MediaType;

import org.uqbar.commons.utils.Observable;

import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;

import model.Alumno;
import model.Asignacion;
@Observable

public class AutenticacionViewModel {
	private double code;
	private String first_name ;
	private String last_name ;
	private String github_user;
	public String token = "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiIxMTEyMjIzMzMiLCJybmQiOiJ5SXNmZFIwN2lIR3BRRmVjYU9KT2VRPT0ifQ.9pVJGUXhrJPQ-TptNCt971l0h_1dWqWgMrHAWXJchho";
	public ArrayList<Asignacion> assignments;
	private List<Asignacion> materias;
	private Asignacion unaAsignacion;
	public void Autenticarse() {
		Alumno alumnito = this.obtenerDatos(token, "student");
		setCode(alumnito.getCode());
		setFirst_name(alumnito.getFirst_name());
		setLast_name(alumnito.getLast_name());
		setGithub_user(alumnito.getGithub_user());
		Alumno alumno = this.obtenerDatos(token, "student/assignments");
		materias = alumno.getAssignments();
		assignments = alumno.getAssignments();
		for (Asignacion item : assignments) {   
		    System.out.println(item.getTitle() + " " + item.getDescription());
		}
		
	}
	private Alumno obtenerDatos(String token, String _path) {
		Gson gson = new Gson();
		 final String json=  Client.create()
				 .resource("http://notitas.herokuapp.com")
				 .path(_path)
				 .header("Authorization", token)
				 .accept(MediaType.APPLICATION_JSON) 
				 .get(String.class);
		 return gson.fromJson(json, Alumno.class);
	}
	public double getCode() {
		return code;
	}
	public void setCode(double code) {
		this.code = code;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getGithub_user() {
		return github_user;
	}
	public void setGithub_user(String github_user) {
		this.github_user = github_user;
	}
	public List<Asignacion> getMaterias() {
		return materias;
	}
	public void setMaterias(List<Asignacion> materias) {
		this.materias = materias;
	}
	
	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	public Asignacion getUnaAsignacion() {
		return unaAsignacion;
	}
	public void setUnaAsignacion(Asignacion unaAsignacion) {
		this.unaAsignacion = unaAsignacion;
	}
	
	public ArrayList<Asignacion> getAssignments() {
		return assignments;
	}

	public void setAssignments(ArrayList<Asignacion> assignments) {
		this.assignments = assignments;
	}
	
	
}
