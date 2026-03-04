package views;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
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
		
		setSize(450, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(true);
		setTitle("Registro de Paquete");
		setLocationRelativeTo(null);
	    setLayout(new BorderLayout());
	    getContentPane().setBackground(Color.WHITE);	
	    
		Toolkit tk = Toolkit.getDefaultToolkit();
		Image icono = tk.getImage("src/img/icono.png");
		setIconImage(icono);
		
		inicializarComponentes();
		
		setVisible(true);		
	}
	
	public void inicializarComponentes() {
		
		
		JLabel lblTitulo = new JLabel("Registro de Paquete");
		lblTitulo.setFont(new Font("Arial", Font.BOLD, 24));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setOpaque(true);
		lblTitulo.setBackground(new Color(33, 150, 243));
		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setBorder(BorderFactory.createEmptyBorder(20,10,20,10));
		add(lblTitulo, BorderLayout.NORTH);
		
		JPanel panelComponentes = new JPanel();
		panelComponentes.setLayout(new BoxLayout(panelComponentes, BoxLayout.Y_AXIS));
		panelComponentes.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
		panelComponentes.setBackground(Color.LIGHT_GRAY);
		
		for(int i = 1; i < 21; i++) {
			JLabel lbl = new JLabel("Paquete #" + i);
			panelComponentes.add(lbl);
			JTextField txt = new JTextField(10);
			panelComponentes.add(txt);
		}
		
		JPanel panelBoton = new JPanel();
		panelBoton.setBackground(Color.WHITE);
		javax.swing.JButton btnGuardar = new javax.swing.JButton("Guardar");
		btnGuardar.setBackground(new Color(76, 175, 80));
		btnGuardar.setForeground(Color.WHITE);
		btnGuardar.setFont(new Font("Arial", Font.BOLD, 14));
		panelBoton.add(btnGuardar);
		panelComponentes.add(panelBoton);
		JScrollPane scroll = new JScrollPane(panelComponentes);
		scroll.setHorizontalScrollBar(null);
		
		add(scroll);
	}	
}
