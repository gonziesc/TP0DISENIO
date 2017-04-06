package view;


import javax.swing.JOptionPane;

import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;

import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.widgets.tables.Column;
import org.uqbar.arena.widgets.tables.Table;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;


import viewmodel.AutenticacionViewModel;

import model.Asignacion;

@SuppressWarnings("serial")
public class AutenticacionWindow extends SimpleWindow<AutenticacionViewModel>{
	
	public AutenticacionWindow(WindowOwner parent) {
		super(parent,new AutenticacionViewModel());
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
		
		
		new Label(mainPanel).setText("Asignaciones");
		
		Table<Asignacion> tablaEvaluaciones = new Table<>(mainPanel, Asignacion.class);
		tablaEvaluaciones.bindValueToProperty("unaAsignacion");
		tablaEvaluaciones.setNumberVisibleRows(5).bindItemsToProperty("assignments");
		
		Column<Asignacion> columnaId = new Column<Asignacion>(tablaEvaluaciones);
		columnaId.setTitle("Id").bindContentsToProperty("id");
		
		Column<Asignacion> columnaTitle = new Column<Asignacion>(tablaEvaluaciones);
		columnaTitle.setTitle("Titulo").bindContentsToProperty("title");
		
		Column<Asignacion> columnaDescripcion = new Column<Asignacion>(tablaEvaluaciones);
		columnaDescripcion.setTitle("Descripcion").bindContentsToProperty("description");
		
		Column<Asignacion> columnaGrades = new Column<Asignacion>(tablaEvaluaciones);
		columnaGrades.setTitle("Notas").bindContentsToProperty("grades");
		
		
	}
	
	public void actualizarDatos(){
		Dialog<?> dialog = new ActualizarDatosWindow(this);
		dialog.open();
		dialog.onAccept(() -> {});
	}
	
	public void loguearse(){
		getModelObject().Autenticarse();
		Dialog<?> dialog = new DatosWindow(this, getModelObject());
		dialog.open();
		dialog.onAccept(() -> {});
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
