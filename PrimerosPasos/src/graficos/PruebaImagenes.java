package graficos;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PruebaImagenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoConImagen mimarco= new MarcoConImagen();
		
		mimarco.setVisible(true);
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoConImagen extends JFrame{
	
	public MarcoConImagen(){
		
		setTitle("Marco con imagen");
		
		setBounds(750, 300, 300, 200);
		
		LaminaConImagen milamina=new LaminaConImagen();
		
		add(milamina);
	}
	
}


class LaminaConImagen extends JPanel{
	
	private Image imagen;
	
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);// Dibujar el espejo para pintar en la interface
		
		//File miimagen=new File("src/graficos/car.png");
		
		try {
			imagen=ImageIO.read(new File("src/graficos/happy.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("La imagen no se encuentra");
			
			//e.printStackTrace();
		}
		
		int anchuraI=imagen.getWidth(this);
		int alturaI=imagen.getHeight(this);
		
		g.drawImage(imagen, 0, 0, null);
		
		g.copyArea(0, 0, 15, 15, 150, 75);
		
		for (int i=0; i<300; i++){
			
			for(int j=0; j<200; j++){
			
				g.copyArea(0, 0, anchuraI, alturaI, anchuraI*i, alturaI*j);
			}
		}
		
				
	}
	
	
}
