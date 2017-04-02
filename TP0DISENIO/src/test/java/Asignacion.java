import java.util.List;


public class Asignacion {
	private Tarea unaTarea;
	private List<Nota> notas;
	private String title;
	
	
	public Tarea getUnaTarea() {
		return unaTarea;
	}
	public void setUnaTarea(Tarea unaTarea) {
		this.unaTarea = unaTarea;
	}
	public List<Nota> getNotas() {
		return notas;
	}
	public void setNotas(List<Nota> notas) {
		this.notas = notas;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
}
