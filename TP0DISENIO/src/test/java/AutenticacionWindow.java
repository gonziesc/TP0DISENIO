


import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.NumericField;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.MainWindow;


@SuppressWarnings("serial")
public class AutenticacionWindow extends MainWindow<Alumno>{

	public AutenticacionWindow() {
		super(new Alumno());
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createContents(Panel mainPanel) {
		this.setTitle("Pantalla de Autenticacion de Alumnos");
		mainPanel.setLayout(new VerticalLayout());

		new Label(mainPanel).setText("Ingrese su token");

		new TextBox(mainPanel).bindValueToProperty("token");
		
		new Label(mainPanel).setText("Ingrese su nombre");

		new TextBox(mainPanel).bindValueToProperty("nombre");
		
		new Label(mainPanel).setText("Ingrese su legajo");

		new NumericField(mainPanel).bindValueToProperty("legajo");

		new Button(mainPanel)
			.setCaption("Loguearse")
			.onClick(()-> this.getModelObject().Autenticarse());

	}

	public static void main(String[] args) {
		new AutenticacionWindow().startApplication();
	}

}
