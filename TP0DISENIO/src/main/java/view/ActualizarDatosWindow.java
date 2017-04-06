package view;
import org.uqbar.arena.layout.ColumnLayout;
import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.NumericField;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.WindowOwner;

import model.Alumno;
import viewmodel.AsignacionesViewModel;


public class ActualizarDatosWindow extends Dialog<Alumno> {
	
	public ActualizarDatosWindow(WindowOwner owner) {
		super(owner, new Alumno());
	}

	@Override
	protected void createFormPanel(Panel mainPanel) {
		Panel form = new Panel(mainPanel);
		form.setLayout(new ColumnLayout(2));
		
		this.setTitle("Actualizacion de datos");
		
		new Label(form).setText("Nombre");
		new TextBox(form).bindValueToProperty("first_name");
	
		new Label(form).setText("Apellido");
		new TextBox(form).bindValueToProperty("last_name");

		new Label(form).setText("Github user");
		new TextBox(form).bindValueToProperty("github_user");
		
		new Button(form).setCaption("Actualizar").onClick(this::actualizarDatos);
	}
	public void actualizarDatos(){
		getModelObject().modificarDatos(getModelObject());
		this.close();
		Dialog<?> dialog = new DatosWindow(this, getModelObject());
		dialog.open();
		dialog.onAccept(() -> {});
	}
}
