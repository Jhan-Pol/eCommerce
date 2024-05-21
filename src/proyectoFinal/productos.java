package proyectoFinal;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class productos {
    public int transformar(JButton precioOne) {
        // Obtener el texto del JButton
        String texto = precioOne.getText();
        
        // Intentar convertir el texto a un número entero
        try {
            return Integer.parseInt(texto);
        } catch (NumberFormatException e) {
            // Manejar el caso en que el texto no sea un número válido
            System.out.println("El texto del botón no es un número válido.");
            return -1; // Puedes devolver algún valor por defecto o lanzar una excepción
        }
    }

    public void calculoFinal(JButton precioOne, JButton precioPropio, int dineroAInt) {
        productos s = new productos();
        temporal x = temporal.getInstance();
        int precioProducto = s.transformar(precioOne);
        int dineroPropio = s.transformar(precioPropio);
        dineroAInt = dineroAInt - precioProducto;
        int x1 = dineroPropio - precioProducto;
        if(x1 >= 0) {
        	String x2 = String.valueOf(x1);
            precioPropio.setText(x2);
            JOptionPane.showMessageDialog(null, "Precio del producto: " + precioProducto + " Muchas gracias por su compra :)");
            
        } else {
        	JOptionPane.showMessageDialog(null, "No tiene dinero o no le alcanza...");
        	
        }
        
    }

    public int calculo(JButton precioOne, JButton precioPropio, int dineroAInt) {
        precioOne.addActionListener(e -> calculoFinal(precioOne, precioPropio, dineroAInt));
        return dineroAInt;
    }
}
