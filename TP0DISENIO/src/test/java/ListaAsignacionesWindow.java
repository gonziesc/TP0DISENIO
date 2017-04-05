import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.List;
import org.uqbar.arena.widgets.NumericField;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.Selector;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.MainWindow;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;
import org.uqbar.commons.utils.Observable;
import org.uqbar.arena.widgets.tables.Column;
import org.uqbar.arena.widgets.tables.Table;

public class ListaAsignacionesWindow extends Dialog<AsignacionesViewModel>
{
	// el problema de que no aparezcan asignaciones es si aca se pone el new asignacionesViewm
	public ListaAsignacionesWindow(WindowOwner owner, AsignacionesViewModel avm ) {
		super(owner,avm);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void createFormPanel(Panel mainPanel) {
		// TODO Auto-generated method stub
		
		this.setTitle("Lista de asignaciones");
		mainPanel.setLayout(new VerticalLayout());
		
		
		new Label(mainPanel).setText("Asignaciones");
		Selector<Asignacion> selectorAsignacion = new Selector<Asignacion>(mainPanel).allowNull(true);
		selectorAsignacion.bindItemsToProperty("assignments");
		selectorAsignacion.bindValueToProperty("unaAsignacion");
		 
		
	
		
	}
}
