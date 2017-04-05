import org.uqbar.arena.widgets.List;
import org.uqbar.commons.utils.Observable;


@Observable

	public class AsignacionesViewModel {
		private List<Asignacion> assignments;
		private Asignacion unaAsignacion;
		
		
		public AsignacionesViewModel(List<Asignacion> assignments){
			this.assignments = assignments;
			
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
