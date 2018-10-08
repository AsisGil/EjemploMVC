package CONTROLADOR;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import VISTA.Login;
import VISTA.VentanaPrincipal;

public class ControladorLogin implements ActionListener {

	private Login login;

	public void setLogin(Login login) {
		this.login = login;

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		login.setVisible(false);
		System.out.println("iniciar sesion se ha pulsado");
		VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
		ControladorVentanaPrincipal controladorVentanaPrincipal = new ControladorVentanaPrincipal();

		ventanaPrincipal.setController(controladorVentanaPrincipal);
		controladorVentanaPrincipal.setVentanaPrincipal(ventanaPrincipal);

		ventanaPrincipal.setVisible(true);

	}

}
