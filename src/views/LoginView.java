package views;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginView extends JPanel{
	
	Font fuente;
	
	public LoginView() {
		
		fuente = new Font("Arial", Font.PLAIN, 14);
		setLayout(null);
		
		inicializarComponentes();
	}
	
	private void inicializarComponentes() {
		crearBotones();
		crearLogo();
		crearFormulario();
	}
	
	private void crearBotones() {
		
		JButton boton = new JButton("Iniciar sesión");
		boton.setBounds(250,320,120,30);
		boton.setToolTipText("Haz click aquí");
		boton.setFont(fuente);
				
		add(boton);
		
	}
	
	private void crearLogo() {
		JLabel lblLogo = new JLabel();
		lblLogo.setBounds(0, 0, 215, 100);
		lblLogo.setIcon(cargarIcono("../img/logo.png", 215, 100));
		add(lblLogo);
	}
	
	private void crearFormulario() {
		
		int lblX = 10, y = 170, txtX = 150;
		
		JLabel lblEmail = new JLabel("Email: ");
		lblEmail.setFont(fuente);
		lblEmail.setBounds(lblX,y,200,40);
		add(lblEmail);
		
		JTextField txtEmail = new JTextField();
		txtEmail.setFont(fuente);
		txtEmail.setBounds(txtX,y,200,40);
		add(txtEmail);
		
		JLabel lblEmailRequerido = new JLabel("El email es requerido.");
		lblEmailRequerido.setBounds(txtX, y+35, 200, 30);
		lblEmailRequerido.setFont(new Font("Arial", Font.BOLD, 10));
		lblEmailRequerido.setForeground(Color.RED);
		add(lblEmailRequerido);
		
		y += 70;
		
		JLabel lblContrasena = new JLabel("Contraseña: ");
		lblContrasena.setFont(fuente);
		lblContrasena.setBounds(lblX,y,200,40);
		add(lblContrasena);
		
		JPasswordField contrasena = new JPasswordField();
		contrasena.setFont(fuente);
		contrasena.setBounds(txtX,y,200,40);
		add(contrasena);
		
		JLabel errorInicial = new JLabel("No existe ese correo");
		errorInicial.setBounds(txtX,y,300,15);
		errorInicial.setForeground(Color.RED);
		errorInicial.setFont(fuente);
		add(errorInicial);
		
		JLabel errorSegundo = new JLabel("Contrasenia erronea");
		errorSegundo.setBounds(txtX,y,300,15);
		errorSegundo.setForeground(Color.RED);
		errorSegundo.setFont(fuente);
		add(errorSegundo);
	}
	
	private ImageIcon cargarIcono(String ruta, int w, int h) {

		try {
			Image icono = ImageIO.read(getClass().getResource(ruta));
			icono = icono.getScaledInstance(w, h, Image.SCALE_SMOOTH);
			return new ImageIcon(icono);
		}catch(Exception ex) {
			System.out.println("No está la imagen del ícono");
		}
		
		return null;
	}
}