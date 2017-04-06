package view;
import org.uqbar.arena.layout.ColumnLayout;
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

import viewmodel.AutenticacionViewModel;
import model.Alumno;



public class DatosWindow  extends Dialog<AutenticacionViewModel>{

	public DatosWindow(WindowOwner parent, AutenticacionViewModel unVM) {
		super(parent,unVM);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void createContents(Panel mainPanel) {
		this.setTitle("Datos Alumno");
		mainPanel.setLayout(new ColumnLayout(2));
		
		new Label(mainPanel).setText("Nombre: ");
		new Label(mainPanel).bindValueToProperty("first_name");
		
		new Label(mainPanel).setText("Legajo: ");
		new Label(mainPanel).bindValueToProperty("code");
		
		new Label(mainPanel).setText("Apellido");
		new Label(mainPanel).bindValueToProperty("last_name");			
		
		new Label(mainPanel).setText("Usuario git: ");
		new Label(mainPanel).bindValueToProperty("github_user");
		
		new Button(mainPanel).setCaption("Aceptar").onClick(this::accept).setAsDefault();
		
	}
	protected void addActions(Panel actions) {
		
	}
	
	
	@Override
	protected void createFormPanel(Panel arg0) {
		// TODO Auto-generated method stub
		
	}
	

}
