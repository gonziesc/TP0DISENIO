import java.util.ArrayList;

import javax.swing.JOptionPane;

import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.List;
import org.uqbar.arena.widgets.NumericField;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.Selector;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.widgets.tables.Column;
import org.uqbar.arena.widgets.tables.Table;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.MainWindow;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;

@SuppressWarnings("serial")
public class AutenticacionWindow extends SimpleWindow<Alumno>{

	public AutenticacionWindow(WindowOwner parent) {
		super(parent,new Alumno());
		// TODO Auto-generated constructor stub
	}

	public void createContents(Panel mainPanel) {
		this.setTitle("Pantalla de Autenticacion de Alumnos");
		mainPanel.setLayout(new VerticalLayout());

		new Label(mainPanel).setText("Ingrese su token");
		new TextBox(mainPanel).bindValueToProperty("token");
			
		new Button(mainPanel)
			.setCaption("Loguearse")
			.onClick(this::loguearse);
		
		new Button(mainPanel)
			.setCaption("Actualizar datos")
			.onClick(this::actualizarDatos);
		
		new Button(mainPanel)
		.setCaption("Obtener asignaciones")
		.onClick(this::obtenerAsignaciones);
		
		new Label(mainPanel).setText("Asignaciones");
		Selector<Asignacion> selectorAsignacion = new Selector<Asignacion>(mainPanel).allowNull(true);
		selectorAsignacion.bindItemsToProperty("materias");
		selectorAsignacion.bindValueToProperty("unaAsignacion");
	}

	
	public void actualizarDatos(){
		Dialog<?> dialog = new ActualizarDatosWindow(this);
		dialog.open();
		dialog.onAccept(() -> {});
	}
	
	public void loguearse(){
		getModelObject().Autenticarse();
		getModelObject().asignacionesAlumno();
		JOptionPane.showMessageDialog(null, getModelObject().getFirst_name());
		Dialog<?> dialog = new DatosWindow(this,  getModelObject());
		dialog.open();
		dialog.onAccept(() -> {});
	}
	
	public void obtenerAsignaciones(){
			//List<Asignacion> assignments = (List<Asignacion>) getModelObject().asignacionesAlumno();
			//avm.setassignments((List<Asignacion>) assignments);
			//AsignacionesViewModel avm = new AsignacionesViewModel((getModelObject()));
			//Dialog<?> dialog = new ListaAsignacionesWindow(this,avm);
			//dialog.open();
			//dialog.onAccept(() -> {});
		}
		
		
	
	

	@Override
	protected void addActions(Panel arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void createFormPanel(Panel arg0) {
		// TODO Auto-generated method stub
		
	}

}
