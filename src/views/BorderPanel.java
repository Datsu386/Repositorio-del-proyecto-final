package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

import javax.imageio.*;
import java.io.*;

public class BorderPanel extends JPanel {
	
	public BorderPanel() {
		setLayout(new BorderLayout());
		//setBackground(Color.BLUE);
		Border emptyBorder = BorderFactory.createEmptyBorder(20,10,20,10);
		setBorder(emptyBorder);
		
		crearPanelCentro();
		
	}
	
	public void crearPanelCentro() {
		
		JLabel lblSaludo = new JLabel("Bienvenido!");
		lblSaludo.setBounds(200,100,100,150);
		add(lblSaludo);

		
		JPanel panelCentro = new JPanel(new BorderLayout());
		//panelCentro.setBackground(Color.RED);
		
		JPanel panelCentroSur = new JPanel(new FlowLayout(FlowLayout.CENTER));
		panelCentro.add(panelCentroSur, BorderLayout.SOUTH);
		//panelCentroSur.setBackground(Color.ORANGE);
		
		JButton btnInicio = new JButton("Iniciar sesión");
		panelCentroSur.add(btnInicio);
		
		JButton btnCancelar = new JButton("Crear Cuenta");
		panelCentroSur.add(btnCancelar);
		
		add(panelCentro, BorderLayout.CENTER);
	
	}
	
	public void cargarFondo(Graphics g) {
		
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		
		Image fondo = null;
		
		try {
			fondo = ImageIO.read(new File("src/img/fondo.jpg"));
			g2.drawImage(fondo, 0, 0, getWidth(), getHeight(), null);
		} catch (IOException ex) {
			System.out.println("La imagen no existe");
		}
		
	}
	
}