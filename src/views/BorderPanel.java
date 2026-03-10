package views;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;


public class BorderPanel extends JPanel {
	
	LoginWindow window;
	Font fuente;
	Image backgroundImage;
	
	public BorderPanel(LoginWindow window) {
		this.window = window;
		setLayout(new BorderLayout());
		Border emptyBorder = BorderFactory.createEmptyBorder(20,10,20,10);
		setBorder(emptyBorder);
		
		
		loadImage();
		crearPanelCentro();
		
	}
	
	public void crearPanelCentro() {
		
		JPanel panelCentro = new JPanel(new BorderLayout());
		panelCentro.setOpaque(false);
		
		JPanel panelCentroSur = new JPanel(new FlowLayout(FlowLayout.CENTER));
		panelCentro.add(panelCentroSur, BorderLayout.SOUTH);
		panelCentroSur.setOpaque(false);
		
		JButton btnInicio = new JButton("Iniciar sesión/Registrarse");
		btnInicio.setToolTipText("Aquí inicia sesión con tu cuenta, y si no tienes una, puedes crearla");
		panelCentroSur.add(btnInicio);
		btnInicio.setOpaque(false);
		
		btnInicio.addActionListener(e-> handleLogin());
		
		JButton btnInvitado = new JButton("Entrar como Invitado");
		btnInvitado.setToolTipText("Entra sin necesidad de crear cuenta");
		panelCentroSur.add(btnInvitado);
		btnInvitado.setOpaque(false);

		btnInvitado.addActionListener(e-> handleGuest());
		
		add(panelCentro, BorderLayout.CENTER);
	
	}
	

	private void handleLogin() {

		new LoginView();
		window.dispose();
	}

	private void handleGuest() {
		new FormularioRegistro();
		window.dispose();
	}
	
	
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		
		g2.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), null);
				
	}
	
	public void loadImage() {
		try {
			backgroundImage = ImageIO.read(new File("src/img/fondo.jpg"));
		} catch (IOException ex) {
			System.out.println("La imagen no existe");
		}
	}
	
}