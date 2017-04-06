package viewmodel;
import java.util.ArrayList;

import javax.ws.rs.core.MediaType;

import java.util.List;

import org.uqbar.commons.utils.Observable;

import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;

import model.Alumno;
import model.Asignacion;


@Observable

	public class AsignacionesViewModel {
		private List<Asignacion> assignments;
		private Asignacion unaAsignacion ;

		public AsignacionesViewModel(Alumno unAlumno){
			Gson gson = new Gson();
			final String json=  Client.create()
					.resource("http://notitas.herokuapp.com/student")
			         .path("assignments")
			         .header("Authorization", unAlumno.getToken())
			         .accept(MediaType.APPLICATION_JSON) 
			         .get(String.class);
			Alumno alumno = gson.fromJson(json, Alumno.class);
			for (Asignacion item : alumno.getAssignments()) {   
			    System.out.println(item.getTitle() + " " + item.getDescription());
			}
			this.assignments = alumno.getAssignments();
			
		}
		
		public void setassignments(List<Asignacion> assignments){
			this.assignments = assignments;
		}
		public Asignacion getunaAsignacion() {
			return unaAsignacion;
		}

		public void setunaAsignacion(Asignacion unaAsignacion) {
			this.unaAsignacion = unaAsignacion;
		}

		public List<Asignacion> getAsignacion() {
			return assignments;
		}
		
	}
