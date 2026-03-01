package views;

import java.awt.BorderLayout;
import java.awt.Dimension;
//import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import utils.AppFont;

public class FormularioRegistro extends JFrame{
	
	public FormularioRegistro() {
		
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(true);
		setTitle("Amazon");
		setLocationRelativeTo(null);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		Image icono = tk.getImage("src/img/icono.png");
		setIconImage(icono);
		
		inicializarComponentes();
		
		setVisible(true);		
	}
	
	public void inicializarComponentes() {
		
		JLabel lblTitulo = new JLabel("Iniciar Sesion/Registrarse");
		lblTitulo.setFont(AppFont.title());
		add(lblTitulo, BorderLayout.NORTH);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panelComponentes = new JPanel();
		panelComponentes.setLayout(new BoxLayout(panelComponentes, BoxLayout.Y_AXIS));
		panelComponentes.setBorder(BorderFactory.createEmptyBorder(35,35,35,35));
		panelComponentes.setPreferredSize(new Dimension(50,50));
		
		for(int i = 0; i < 1; i++) {
			JLabel lblCorreo = new JLabel("Correo Electronico");
			panelComponentes.add(lblCorreo);
			JTextField txt = new JTextField(1);
			panelComponentes.setBorder(BorderFactory.createEmptyBorder(35,35,35,35));
			panelComponentes.getPreferredSize();
			panelComponentes.add(txt);
		}
		
		for(int i = 0; i < 1; i++) {
			JLabel lblContrasena = new JLabel("Contraseña");
			panelComponentes.add(lblContrasena);
			JTextField txt = new JTextField(1);
			panelComponentes.getPreferredSize();
			panelComponentes.add(txt);
		}
		
		JScrollPane scroll = new JScrollPane(panelComponentes);
		scroll.setHorizontalScrollBar(null);
		
		add(scroll);
	}	
}