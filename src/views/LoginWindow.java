package views;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class LoginWindow extends JFrame { 
	
	public LoginWindow() {
		
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(100,100);
		setBounds(100,100,500,500);
		setResizable(false);
		setTitle("Amazon");
		setLocationRelativeTo(null);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		Image icono = tk.getImage("src/img/icono.png");
		setIconImage(icono);
			
		//LoginView panelito = new LoginView();
		BorderPanel panelito = new BorderPanel();
		add(panelito);
	
		setVisible(true);
	}
}

