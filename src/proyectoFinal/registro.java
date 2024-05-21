package proyectoFinal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;

public class registro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JTextField nombreTextField2;
	private JTextField direccionTextField;
	private JTextField dineroTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registro frame = new registro();
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
	public registro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1363, 882);
		contentPane = new fondoRegistro("media/fondo de registro.jpg");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel tituloRegistro = new JLabel("Registro");
		tituloRegistro.setForeground(new Color(255, 255, 255));
		tituloRegistro.setFont(new Font("Monotype Corsiva", Font.PLAIN, 70));
		tituloRegistro.setBounds(693, 80, 231, 66);
		tituloRegistro.setHorizontalAlignment(SwingConstants.CENTER);
		tituloRegistro.setVerticalAlignment(SwingConstants.CENTER);
		contentPane.add(tituloRegistro);
		
		JLabel nombreRegistro = new JLabel("Nombre:");
		nombreRegistro.setForeground(new Color(255, 255, 255));
		nombreRegistro.setFont(new Font("Times New Roman", Font.BOLD, 40));
		nombreRegistro.setBounds(740, 200, 160, 60);
		contentPane.add(nombreRegistro);
		nombreRegistro.setHorizontalAlignment(SwingConstants.CENTER);
		nombreRegistro.setVerticalAlignment(SwingConstants.CENTER);
		
		nombreTextField2 = new JTextField();
		nombreTextField2.setBounds(657, 271, 333, 36);
		contentPane.add(nombreTextField2);
		nombreTextField2.setColumns(10);
		
		JLabel direccionRegistro = new JLabel("Direccion:");
		direccionRegistro.setForeground(new Color(255, 255, 255));
		direccionRegistro.setFont(new Font("Times New Roman", Font.BOLD, 40));
		direccionRegistro.setBounds(740, 333, 184, 60);
		contentPane.add(direccionRegistro);
		
		direccionTextField = new JTextField();
		direccionTextField.setBounds(657, 403, 333, 36);
		contentPane.add(direccionTextField);
		direccionTextField.setColumns(10);
		
		JLabel dineroRegistro = new JLabel("Dinero:");
		dineroRegistro.setForeground(new Color(255, 255, 255));
		dineroRegistro.setFont(new Font("Times New Roman", Font.BOLD, 40));
		dineroRegistro.setBounds(740, 450, 160, 60);
		dineroRegistro.setHorizontalAlignment(SwingConstants.CENTER);
		dineroRegistro.setVerticalAlignment(SwingConstants.CENTER);
		contentPane.add(dineroRegistro);
		
		dineroTextField = new JTextField();
		dineroTextField.setBounds(657, 520, 333, 36);
		contentPane.add(dineroTextField);
		dineroTextField.setColumns(10);
		
		JButton botonTerminarRegistro = new JButton("Terminar Registro");
		botonTerminarRegistro.setFont(new Font("Javanese Text", Font.PLAIN, 40));
		botonTerminarRegistro.setBounds(653, 610, 350, 60);
		botonTerminarRegistro.setHorizontalAlignment(SwingConstants.CENTER);
		botonTerminarRegistro.setVerticalAlignment(SwingConstants.CENTER);
		contentPane.add(botonTerminarRegistro);
		
		//Solo tomar numeros en el dinero
		
		dineroTextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume(); // Ignorar el evento si no es un dígito
                }
            }
        });
		
		//Dar por finalizado el registro
		
		ActionListener terminarRegistro = new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        temporal tm = temporal.getInstance();
		        tm.setNombre(nombreTextField2.getText());
		        tm.setDireccion(direccionTextField.getText());
		        tm.setDinero(dineroTextField.getText());
		        eCommerce frame = new eCommerce();
		        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		        frame.setVisible(true);
		        registro.this.dispose();
		    }
		};
		botonTerminarRegistro.addActionListener(terminarRegistro);
	}
}
