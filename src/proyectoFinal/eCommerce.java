package proyectoFinal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.MouseMotionAdapter;
import java.io.Closeable;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

public class eCommerce extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JTextField nombreTextField;
	private JTextField direccionTextField;
	private JTextField dineroTextField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					eCommerce frame = new eCommerce();
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the frame.
	 */
	public eCommerce() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1363, 882);
		contentPane = new primerFondo("media/Primer Fondo.jpg");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setAlignmentX(CENTER_ALIGNMENT);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel titulo = new JLabel("Bienvenido");
		titulo.setForeground(new Color(255, 255, 255));
		titulo.setFont(new Font("Vivaldi", Font.BOLD, 63));
		titulo.setBounds(214, 98, 1254, 135);
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setVerticalAlignment(SwingConstants.CENTER);
		contentPane.add(titulo);
		
		JLabel nombreLabel = new JLabel("Nombre:");
		nombreLabel.setForeground(new Color(255, 255, 255));
		nombreLabel.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		nombreLabel.setBounds(767, 244, 220, 50);
		contentPane.add(nombreLabel);
		
		JLabel direccionLabel = new JLabel("Direccion:");
		direccionLabel.setForeground(new Color(255, 255, 255));
		direccionLabel.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		direccionLabel.setBounds(767, 339, 220, 58);
		contentPane.add(direccionLabel);
		
		nombreTextField = new JTextField();
		nombreTextField.setBounds(667, 304, 390, 32);
		contentPane.add(nombreTextField);
		nombreTextField.setColumns(10);
		
		direccionTextField = new JTextField();
		direccionTextField.setBounds(667, 407, 390, 32);
		contentPane.add(direccionTextField);
		direccionTextField.setColumns(10);
		
		JButton botonRegistro = new JButton("¿Aun no estas registrado?");
		botonRegistro.setForeground(new Color(0, 0, 0));
		botonRegistro.setFont(new Font("Times New Roman", Font.ITALIC, 37));
		botonRegistro.setHorizontalAlignment(SwingConstants.CENTER);
		botonRegistro.setVerticalAlignment(SwingConstants.CENTER);
		botonRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botonRegistro.setBounds(644, 697, 450, 50);
		contentPane.add(botonRegistro);
		
		JButton botonEntrar = new JButton("Entrar");
		botonEntrar.setFont(new Font("Javanese Text", Font.PLAIN, 40));
		botonEntrar.setBounds(767, 598, 180, 60);
		botonEntrar.setHorizontalAlignment(SwingConstants.CENTER);
		botonEntrar.setVerticalAlignment(SwingConstants.CENTER);
		contentPane.add(botonEntrar);
		
		JLabel dineroLabel = new JLabel("Dinero:");
		dineroLabel.setForeground(new Color(255, 255, 255));
		dineroLabel.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		dineroLabel.setBounds(767, 442, 220, 58);
		contentPane.add(dineroLabel);
		
		dineroTextField = new JTextField();
		dineroTextField.setBounds(667, 510, 390, 32);
		contentPane.add(dineroTextField);
		dineroTextField.setColumns(10);
		
		// Evento para permitir solo numeros en el apartado de dinero
        dineroTextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume(); // Ignorar el evento si no es un dígito
                }
            }
        });
		
		
		//Inicio de Sesion
		
		
        ActionListener inicioDeSesion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombreRegistro = nombreTextField.getText();
                String direccionRegistro = direccionTextField.getText();
                String dineroRegistro = dineroTextField.getText();
                temporal p = temporal.getInstance();
                if ((nombreRegistro.equals(p.getNombre())) && (direccionRegistro.equals(p.getDireccion())) && (dineroRegistro.equals(p.getDinero()))) {
                	compras newframe = new compras();
    				newframe.setExtendedState(JFrame.MAXIMIZED_BOTH);
    				newframe.setVisible(true);
    				eCommerce.this.dispose();
                } else {
                	JOptionPane.showMessageDialog(null, "Lo siento, no esta registrado o ha introducido algun campo mal");
                }
            }
        };
		
		botonEntrar.addActionListener(inicioDeSesion);
		
		//Registro de Cliente
		
		ActionListener registroDeUsuario = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				registro newframe = new registro();
				newframe.setExtendedState(JFrame.MAXIMIZED_BOTH);
				newframe.setVisible(true);
				eCommerce.this.dispose();
			}
			
		};
		botonRegistro.addActionListener(registroDeUsuario);
	}
}



