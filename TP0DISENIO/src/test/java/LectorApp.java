
import org.uqbar.arena.Application;
import org.uqbar.arena.windows.Window;




public class LectorApp extends Application{

	public static void main(String[] args) {
		new LectorApp().start();
	}
	@Override
	protected Window<?> createMainWindow() {
		return new AutenticacionWindow(this);
	}
}
