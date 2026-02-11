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
		
		fuente = new Font("Arial", Font.ITALIC, 20);
		setBackground(Color.GRAY);
		setLayout(null);
		
		inicializarComponentes();
		//setBackground(new Color(210,165,35));
	}
	
	private void inicializarComponentes() {
		crearBotones();
		crearFormulario();
	}
	
	private void crearBotones() {
		
		JButton botonIniciarSesion = new JButton("Iniciar Sesion");
		botonIniciarSesion.setBounds(150,315,200,25);
		botonIniciarSesion.setBackground(Color.LIGHT_GRAY);
		botonIniciarSesion.setForeground(Color.BLUE);
		botonIniciarSesion.setToolTipText("Inicia sesion si ya tienes cuenta.");
		botonIniciarSesion.setFont(fuente);
		
		colocarIcono(botonIniciarSesion, "../img/icono.png");
		
		add(botonIniciarSesion);
		
		JButton botonRegistrarse = new JButton("Registrarse");
		botonRegistrarse.setBounds(150,350,200,25);
		botonRegistrarse.setBackground(Color.LIGHT_GRAY);
		botonRegistrarse.setForeground(Color.BLUE);
		botonRegistrarse.setToolTipText("Registrate si aun no has creado una cuenta");
		botonRegistrarse.setFont(fuente);
		
		colocarIcono(botonRegistrarse, "../img/icono.png");
		
		add(botonRegistrarse);
		
	}
	
	private void crearFormulario() {
		JLabel lblLogo = new JLabel("Amazon Inc.");
		lblLogo.setForeground(Color.CYAN);
		lblLogo.setFont(fuente);
		lblLogo.setBounds(190,0,200,40);
		add(lblLogo);
		
		JLabel lblCorreo = new JLabel("Correo: ");
		lblCorreo.setForeground(Color.WHITE);
		lblCorreo.setFont(fuente);
		lblCorreo.setBounds(10,100,200,40);
		add(lblCorreo);
		
		JTextField texto = new JTextField();
		texto.setForeground(Color.BLUE);
		texto.setFont(fuente);
		texto.setBounds(150,100,200,40);
		add(texto);
		
		JLabel lblContrasena = new JLabel("Contraseña: ");
		lblContrasena.setForeground(Color.WHITE);
		lblContrasena.setFont(fuente);
		lblContrasena.setBounds(10,150,200,40);
		add(lblContrasena);
		
		JPasswordField contrasena = new JPasswordField();
		contrasena.setForeground(Color.BLUE);
		contrasena.setFont(fuente);
		contrasena.setBounds(150,150,200,40);
		add(contrasena);
	}
	
	private void colocarIcono(JButton boton, String ruta) {
		try {
			Image icono = ImageIO.read(getClass().getResource(ruta));
			icono = icono.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
			boton.setIcon(new ImageIcon(icono));			
		}catch(Exception ex) {
			System.out.println("No está la imagen del ícono");
		}
	}
}