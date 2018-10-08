import CONTROLADOR.ControladorLogin;
import VISTA.Login;

public class Main {

	public static void main(String[] args) {

		Login login = new Login();
		ControladorLogin controladorLogin = new ControladorLogin();

		login.setController(controladorLogin);
		controladorLogin.setLogin(login);

		login.setVisible(true);

	}

}
