package model;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.MediaType;

import org.uqbar.commons.utils.Observable;

import com.google.gson.Gson;

import com.sun.jersey.api.client.Client;


@Observable

public class Alumno {
	private double code;
	private String first_name ;
	private String last_name ;
	private String github_user;
	private String token = "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiIxMTEyMjIzMzMiLCJybmQiOiJ5SXNmZFIwN2lIR3BRRmVjYU9KT2VRPT0ifQ.9pVJGUXhrJPQ-TptNCt971l0h_1dWqWgMrHAWXJchho";
	public ArrayList<Asignacion> assignments;
	private List<Asignacion> materias;
	private Asignacion unaAsignacion;
	
	public Alumno(double id,String nombre,String apellido,String git){
		code = id;
		first_name= nombre;
		last_name = apellido;
		github_user = git;
	}

	public Alumno (){}
	
	
	
	public void modificarDatos(Alumno alumno) {
		Gson gson = new Gson();
		String result = gson.toJson(alumno);
		Client.create()
		         .resource("http://notitas.herokuapp.com")
		         .path("student")
		         .header("Authorization", alumno.getToken())
		         .accept(MediaType.APPLICATION_JSON) 
		         .put(String.class, result);
	}


	public double getCode() {
		return code;
	}

	public void setCode(double legajo) {
		this.code = legajo;
	}

	public String getFirst_name() {
		return first_name;
	}

	public String getLast_name() {
		return last_name;
	}
	
	public String getGithub_user() {
		return github_user;
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

	public ArrayList<Asignacion> getAssignments() {
		return assignments;
	}

	public void setAssignments(ArrayList<Asignacion> assignments) {
		this.assignments = assignments;
	}


	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public void setGithub_user(String github_user) {
		this.github_user = github_user;
	}

	public Asignacion getUnaAsignacion() {
		return unaAsignacion;
	}


	public void setUnaAsignacion(Asignacion unaAsignacion) {
		this.unaAsignacion = unaAsignacion;
	}


	public List<Asignacion> getMaterias() {
		return materias;
	}


	public void setMaterias(List<Asignacion> materias) {
		this.materias = materias;
	}
}
	
