package graficos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.SystemColor;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TrabajandoColores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoConColor mimarco= new MarcoConColor();
		
		mimarco.setVisible(true);
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoConColor extends JFrame{
	
	public MarcoConColor(){
		
		setTitle("Prueba de Colores");
		
		setSize(400, 400);
		
		LaminaConColor milamina=new LaminaConColor();
		
		add(milamina);
		
		milamina.setBackground(SystemColor.window);// COLOR POR DEFECTO DEL SISTEMA
	}
	
}

class LaminaConColor extends JPanel{
	
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);// Dibujar el espejo para pintar en la interface
		
		//g.drawRect(50, 50, 200, 200);
		//g.drawLine(100, 100, 200, 300);
		//g.drawArc(50, 100, 100, 200, 120,150 );
		
		Color micolor=new Color(125, 189, 200);
		
		Graphics2D g2=(Graphics2D) g;
		
		Rectangle2D rectangulo=new Rectangle2D.Double(100,100,200,150);
		
		g2.setPaint(Color.RED);
		
		g2.fill(rectangulo);
		
		g2.draw(rectangulo);
		
		Ellipse2D elipse=new Ellipse2D.Double();
		
		elipse.setFrame(rectangulo);
		
		g2.draw(elipse);
		
		g2.setPaint(micolor);
		
		g2.fill(elipse);
		
		
	}
	
}
