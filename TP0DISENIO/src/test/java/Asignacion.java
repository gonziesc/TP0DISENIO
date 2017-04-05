import java.util.ArrayList;



public class Asignacion {
	private Integer id;
	private String title;
	private String description;
	private ArrayList<Nota> grades;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public ArrayList<Nota> getGrades() {
		return grades;
	}
	public void setGrades(ArrayList<Nota> grades) {
		this.grades = grades;
	}
	
	
	
}
