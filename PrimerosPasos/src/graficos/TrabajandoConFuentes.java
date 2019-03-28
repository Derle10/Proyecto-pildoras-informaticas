package graficos;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.SystemColor;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TrabajandoConFuentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoConfuente mimarco= new MarcoConfuente();
		
		mimarco.setVisible(true);
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	}

}

class MarcoConfuente extends JFrame{
	
	public MarcoConfuente(){
		
		setTitle("Prueba de Colores");
		
		setSize(400, 400);
		
		LaminaConFuente milamina=new LaminaConFuente();
		
		add(milamina);
		
		milamina.setForeground(Color.BLUE);
		
		
	}
	
}

class LaminaConFuente extends JPanel{
	
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);// Dibujar el espejo para pintar en la interface
			
		Graphics2D g2=(Graphics2D) g;
		
		Font mifuente=new Font("Arial", Font.BOLD, 26);
		
		g2.setFont(mifuente);
		
		g2.setColor(Color.BLUE);
				
		g2.drawString("Derlevin", 100, 100);
		
		g2.setFont(new Font("Arial", Font.ITALIC, 24));
		
		g2.setColor(Color.BLUE);
				
		g2.drawString("Curso de java", 100, 300);
		
		
		
	}
	
}
