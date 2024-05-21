package proyectoFinal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class compras extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public int dineroAInt;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					compras frame = new compras();
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
	public compras() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1603, 882);
		contentPane = new fondoComercio("media/fondo-comercio.jpg");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel marca = new JLabel("Clothing.es");
		marca.setFont(new Font("Times New Roman", Font.PLAIN, 43));
		marca.setBounds(10, 10, 243, 51);
		marca.setHorizontalAlignment(SwingConstants.CENTER);
		marca.setVerticalAlignment(SwingConstants.CENTER);
		contentPane.add(marca);
		
		JLabel info = new JLabel("Envio Internacional Gratuito Para Pedidos Grandes");
		info.setFont(new Font("Tw Cen MT", Font.PLAIN, 31));
		info.setBounds(884, 10, 656, 42);
		contentPane.add(info);
		
		JButton buttonComprar = new JButton("Comprar Ahora");
		buttonComprar.setBorder(null);
		buttonComprar.setFont(new Font("Monotype Corsiva", Font.PLAIN, 40));
		buttonComprar.setBounds(176, 138, 1200, 51);
		contentPane.add(buttonComprar);
		
		JLabel referencia1 = new JLabel("");
		ImageIcon imagenIcon = new ImageIcon("media/referencia.jpg");
        Image imagen = imagenIcon.getImage(); 
        Image imagenEscalada = imagen.getScaledInstance(500, 600, Image.SCALE_SMOOTH); 
        ImageIcon imagenIconEscalada = new ImageIcon(imagenEscalada);
        referencia1.setIcon(imagenIconEscalada);
		referencia1.setBounds(79, 245, 611, 529);
		contentPane.add(referencia1);
		
		JLabel referencia2 = new JLabel("");
		ImageIcon imagenIcon2 = new ImageIcon("media/referenciax.jpg");
        Image imagen2 = imagenIcon2.getImage(); 
        Image imagenEscalada2 = imagen2.getScaledInstance(500, 700, Image.SCALE_SMOOTH); 
        ImageIcon imagenIconEscalada2 = new ImageIcon(imagenEscalada2);
        referencia2.setIcon(imagenIconEscalada2);
		referencia2.setBounds(960, 245, 639, 529);
		
		contentPane.add(referencia2);
		
		JLabel primerEnunciado = new JLabel("GOOD AT\r\n");
		primerEnunciado.setFont(new Font("Times New Roman", Font.PLAIN, 75));
		primerEnunciado.setBounds(599, 284, 337, 185);
		contentPane.add(primerEnunciado);
		
		JLabel SegundoEnunciado = new JLabel("GUESTING");
		SegundoEnunciado.setFont(new Font("Times New Roman", Font.PLAIN, 75));
		SegundoEnunciado.setBounds(579, 390, 385, 139);
		contentPane.add(SegundoEnunciado);
		
		JLabel tercerEnunciado = new JLabel("Now trending: being the chicest at every wedding");
		tercerEnunciado.setFont(new Font("Sitka Text", Font.PLAIN, 16));
		tercerEnunciado.setBounds(579, 520, 385, 31);
		contentPane.add(tercerEnunciado);
		
		JLabel cuartoEnunciado = new JLabel("SHOP NOW");
		cuartoEnunciado.setFont(new Font("Modern No. 20", Font.ITALIC, 47));
		cuartoEnunciado.setBounds(635, 595, 265, 67);
		contentPane.add(cuartoEnunciado);
		
		JLabel blusaOne = new JLabel("");
		blusaOne.setVisible(false);
		ImageIcon imagenIcon3 = new ImageIcon("media/blusaOne.jpg");
        Image imagen3 = imagenIcon3.getImage(); 
        Image imagenEscalada3 = imagen3.getScaledInstance(200, 200, Image.SCALE_SMOOTH); 
        ImageIcon imagenIconEscalada3 = new ImageIcon(imagenEscalada3);
        blusaOne.setIcon(imagenIconEscalada3);
		blusaOne.setBounds(210, 245, 200, 200);
		contentPane.add(blusaOne);
		
		JLabel blusaTwo = new JLabel("New label");
		blusaTwo.setVisible(false);
		ImageIcon imagenIcon4 = new ImageIcon("media/blusaTwo.jpg");
        Image imagen4 = imagenIcon4.getImage(); 
        Image imagenEscalada4 = imagen4.getScaledInstance(200, 200, Image.SCALE_SMOOTH); 
        ImageIcon imagenIconEscalada4 = new ImageIcon(imagenEscalada4);
        blusaTwo.setIcon(imagenIconEscalada4);
		blusaTwo.setBounds(510, 245, 200, 200);
		contentPane.add(blusaTwo);
		
		JLabel camisaOne = new JLabel("New label");
		camisaOne.setVisible(false);
		ImageIcon imagenIcon5 = new ImageIcon("media/camisaOne.jpg");
        Image imagen5 = imagenIcon5.getImage(); 
        Image imagenEscalada5 = imagen5.getScaledInstance(200, 200, Image.SCALE_SMOOTH); 
        ImageIcon imagenIconEscalada5 = new ImageIcon(imagenEscalada5);
        camisaOne.setIcon(imagenIconEscalada5);
		camisaOne.setBounds(810, 245, 200, 200);
		contentPane.add(camisaOne);
		
		JLabel camisaTwo = new JLabel("New label");
		camisaTwo.setVisible(false);
		ImageIcon imagenIcon6 = new ImageIcon("media/camisaTwo.jpg");
        Image imagen6 = imagenIcon6.getImage(); 
        Image imagenEscalada6 = imagen6.getScaledInstance(200, 200, Image.SCALE_SMOOTH); 
        ImageIcon imagenIconEscalada6 = new ImageIcon(imagenEscalada6);
        camisaTwo.setIcon(imagenIconEscalada6);
		camisaTwo.setBounds(1110, 245, 200, 200);
		contentPane.add(camisaTwo);
		
		JButton precioOne = new JButton("500");
		precioOne.setVisible(false);
		precioOne.setFont(new Font("Monotype Corsiva", Font.PLAIN, 35));
		precioOne.setBounds(250, 460, 100, 30);
		contentPane.add(precioOne);
		
		JButton precioTwo = new JButton("200");
		precioTwo.setVisible(false);
		precioTwo.setFont(new Font("Monotype Corsiva", Font.PLAIN, 35));
		precioTwo.setBounds(550, 460, 100, 30);
		contentPane.add(precioTwo);
		
		JButton precioThree = new JButton("180");
		precioThree.setVisible(false);
		precioThree.setFont(new Font("Monotype Corsiva", Font.PLAIN, 35));
		precioThree.setBounds(850, 460, 100, 30);
		contentPane.add(precioThree);
		
		JButton precioFour = new JButton("200");
		precioFour.setVisible(false);
		precioFour.setFont(new Font("Monotype Corsiva", Font.PLAIN, 35));
		precioFour.setBounds(1150, 460, 100, 30);
		contentPane.add(precioFour);
		
		JLabel zapatosOne = new JLabel("New label");
		zapatosOne.setVisible(false);
		ImageIcon imagenIcon7 = new ImageIcon("media/zapatosOne.jpg");
        Image imagen7 = imagenIcon7.getImage(); 
        Image imagenEscalada7 = imagen7.getScaledInstance(200, 200, Image.SCALE_SMOOTH); 
        ImageIcon imagenIconEscalada7 = new ImageIcon(imagenEscalada7);
        zapatosOne.setIcon(imagenIconEscalada7);
		zapatosOne.setBounds(210, 520, 200, 200);
		contentPane.add(zapatosOne);
		
		JLabel blusaThree = new JLabel("New label");
		blusaThree.setVisible(false);
		ImageIcon imagenIcon8 = new ImageIcon("media/blusaThree.jpg");
        Image imagen8 = imagenIcon8.getImage(); 
        Image imagenEscalada8 = imagen8.getScaledInstance(200, 200, Image.SCALE_SMOOTH); 
        ImageIcon imagenIconEscalada8 = new ImageIcon(imagenEscalada8);
        blusaThree.setIcon(imagenIconEscalada8);
		blusaThree.setBounds(510, 520, 200, 200);
		contentPane.add(blusaThree);
		
		JLabel pantalonOne = new JLabel("New label");
		pantalonOne.setVisible(false);
		ImageIcon imagenIcon9 = new ImageIcon("media/pantalonOne.jpg");
        Image imagen9 = imagenIcon9.getImage(); 
        Image imagenEscalada9 = imagen9.getScaledInstance(200, 200, Image.SCALE_SMOOTH); 
        ImageIcon imagenIconEscalada9 = new ImageIcon(imagenEscalada9);
        pantalonOne.setIcon(imagenIconEscalada9);
		pantalonOne.setBounds(810, 520, 200, 200);
		contentPane.add(pantalonOne);
		
		JLabel pantalonTwo = new JLabel("New label");
		pantalonTwo.setVisible(false);
		ImageIcon imagenIcon10 = new ImageIcon("media/pantalonTwo.jpg");
        Image imagen10 = imagenIcon10.getImage(); 
        Image imagenEscalada10 = imagen10.getScaledInstance(200, 200, Image.SCALE_SMOOTH); 
        ImageIcon imagenIconEscalada10 = new ImageIcon(imagenEscalada10);
        pantalonTwo.setIcon(imagenIconEscalada10);
		pantalonTwo.setBounds(1110, 520, 200, 200);
		contentPane.add(pantalonTwo);
		
		JButton precioFive = new JButton("300");
		precioFive.setVisible(false);
		precioFive.setFont(new Font("Monotype Corsiva", Font.PLAIN, 35));
		precioFive.setBounds(250, 735, 100, 30);
		contentPane.add(precioFive);
		
		JButton precioSix = new JButton("290");
		precioSix.setVisible(false);
		precioSix.setFont(new Font("Monotype Corsiva", Font.PLAIN, 35));
		precioSix.setBounds(550, 735, 100, 30);
		contentPane.add(precioSix);
		
		JButton precioSeven = new JButton("500");
		precioSeven.setVisible(false);
		precioSeven.setFont(new Font("Monotype Corsiva", Font.PLAIN, 35));
		precioSeven.setBounds(850, 735, 100, 30);
		contentPane.add(precioSeven);
		
		JButton precioEight = new JButton("300");
		precioEight.setVisible(false);
		precioEight.setFont(new Font("Monotype Corsiva", Font.PLAIN, 35));
		precioEight.setBounds(1150, 735, 100, 30);
		contentPane.add(precioEight);
		
		JButton volverAhora = new JButton("Volver a Inicio");
		volverAhora.setVisible(false);
		volverAhora.setFont(new Font("Monotype Corsiva", Font.PLAIN, 40));
		volverAhora.setBounds(176, 138, 1200, 51);
		contentPane.add(volverAhora);
		temporal x = temporal.getInstance();
		productos s = new productos();
		JButton buttonCarrito = new JButton("");
		buttonCarrito.setText(x.getDinero());
		buttonCarrito.setBorder(null);
		buttonCarrito.setFont(new Font("Monotype Corsiva", Font.PLAIN, 40));
		buttonCarrito.setBounds(573, 80, 404, 48);
		contentPane.add(buttonCarrito);
		
		
		dineroAInt = Integer.parseInt(x.getDinero());
		ActionListener verCarrito = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
                JOptionPane.showMessageDialog(null, "Dinero actual");
            }
		};
		
		buttonCarrito.addActionListener(verCarrito);
		
		s.calculo(precioOne, buttonCarrito, dineroAInt);
		s.calculo(precioTwo, buttonCarrito, dineroAInt);
	    s.calculo(precioThree, buttonCarrito, dineroAInt);
		s.calculo(precioFour, buttonCarrito, dineroAInt);
		s.calculo(precioFive, buttonCarrito, dineroAInt);
		s.calculo(precioSix, buttonCarrito, dineroAInt);
		s.calculo(precioSeven, buttonCarrito, dineroAInt);
		s.calculo(precioEight, buttonCarrito, dineroAInt);
		
		
		ActionListener comprarAhora = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	referencia1.setVisible(false);
            	referencia2.setVisible(false);
            	primerEnunciado.setVisible(false);
            	SegundoEnunciado.setVisible(false);
            	tercerEnunciado.setVisible(false);
            	cuartoEnunciado.setVisible(false);
            	blusaOne.setVisible(true);
            	blusaTwo.setVisible(true);
            	blusaThree.setVisible(true);
            	camisaOne.setVisible(true);
            	camisaTwo.setVisible(true);
            	zapatosOne.setVisible(true);
            	pantalonOne.setVisible(true);
            	pantalonTwo.setVisible(true);
            	precioOne.setVisible(true);
            	precioTwo.setVisible(true);
            	precioThree.setVisible(true);
            	precioFour.setVisible(true);
            	precioFive.setVisible(true);
            	precioSix.setVisible(true);
            	precioSeven.setVisible(true);
            	precioEight.setVisible(true);
            	buttonComprar.setVisible(false);
            	volverAhora.setVisible(true);
            }
	};
	buttonComprar.addActionListener(comprarAhora);
	
	ActionListener devolverse = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        	referencia1.setVisible(true);
        	referencia2.setVisible(true);
        	primerEnunciado.setVisible(true);
        	SegundoEnunciado.setVisible(true);
        	tercerEnunciado.setVisible(true);
        	cuartoEnunciado.setVisible(true);
        	blusaOne.setVisible(false);
        	blusaTwo.setVisible(false);
        	blusaThree.setVisible(false);
        	camisaOne.setVisible(false);
        	camisaTwo.setVisible(false);
        	zapatosOne.setVisible(false);
        	pantalonOne.setVisible(false);
        	pantalonTwo.setVisible(false);
        	precioOne.setVisible(false);
        	precioTwo.setVisible(false);
        	precioThree.setVisible(false);
        	precioFour.setVisible(false);
        	precioFive.setVisible(false);
        	precioSix.setVisible(false);
        	precioSeven.setVisible(false);
        	precioEight.setVisible(false);
        	volverAhora.setVisible(true);
        	buttonComprar.setVisible(true);
        }
};
	volverAhora.addActionListener(devolverse);
}
}
