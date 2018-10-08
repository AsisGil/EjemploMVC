package VISTA;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import CONTROLADOR.ControladorLogin;

public class Login extends JFrame {

	ControladorLogin controladorLogin;

	public JPanel contentPane;
	private JButton btnAbrirApp;

	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		btnAbrirApp = new JButton("abrir");

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup().addGap(155).addComponent(btnAbrirApp).addContainerGap(170, Short.MAX_VALUE)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup().addGap(97).addComponent(btnAbrirApp)
						.addContainerGap(121, Short.MAX_VALUE)));
		contentPane.setLayout(gl_contentPane);
	}

	public void setController(ControladorLogin controladorLogin) {
		this.controladorLogin = controladorLogin;
		btnAbrirApp.addActionListener(controladorLogin);

	}
}
