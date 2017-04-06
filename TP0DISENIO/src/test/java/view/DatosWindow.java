package view;
import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.NumericField;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.MainWindow;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;

import model.Alumno;


public class DatosWindow  extends Dialog<Alumno>{

	public DatosWindow(WindowOwner parent, Alumno unAlumno) {
		super(parent,unAlumno);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void createContents(Panel mainPanel) {
		this.setTitle("Datos Alumno");
		mainPanel.setLayout(new VerticalLayout());
		
		new Label(mainPanel).setText("nombre");
		new Label(mainPanel).bindValueToProperty("first_name");
		
		new Label(mainPanel).setText("legajo");
		new Label(mainPanel).bindValueToProperty("code");
		
		new Label(mainPanel).setText("apellido");
		new Label(mainPanel).bindValueToProperty("last_name");			
		
		new Label(mainPanel).setText("git");
		new Label(mainPanel).bindValueToProperty("github_user");
	}
	@Override
	protected void createFormPanel(Panel arg0) {
		// TODO Auto-generated method stub
		
	}
	

}
