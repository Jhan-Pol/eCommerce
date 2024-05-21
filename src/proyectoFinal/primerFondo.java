package proyectoFinal;
import javax.swing.JPanel;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
public class primerFondo extends JPanel{
	private ImageIcon imagen;
	public primerFondo(String ruta) {
		imagen = new ImageIcon(ruta);
	}
	public void paint(Graphics g) {
		Dimension dim = this.getSize();
		g.drawImage(imagen.getImage(), 0, 0, dim.width, dim.height, null);
		this.setOpaque(false);
		super.paintChildren(g);
	}
}
