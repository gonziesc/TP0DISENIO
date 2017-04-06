package view;
import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.WindowOwner;

import model.Alumno;


public class ActualizarDatosWindow extends Dialog<Alumno> {
	
	public ActualizarDatosWindow(WindowOwner owner) {
		super(owner, new Alumno());
	}
	// Estaba probando la otra pantalla que tiraba para hacer el PUT no esta hecha..
	@Override
	protected void createFormPanel(Panel mainPanel) {
		Panel form = new Panel(mainPanel);
		form.setLayout(new VerticalLayout());
		this.setTitle("Actualizacion de datos");
		
		new Label(form).setText("Nuevas asignaciones");
		/*new TextBox(mainPanel).bindValueToProperty("");
	
		new Label(form).setText("Notas");
		new TextBox(mainPanel).bindValueToProperty("");*/
	}
}
