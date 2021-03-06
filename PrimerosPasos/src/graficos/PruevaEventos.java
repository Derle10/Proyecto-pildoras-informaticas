package graficos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PruevaEventos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoBotones mimarco= new MarcoBotones();
		
		mimarco.setVisible(true);
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoBotones extends JFrame{
	
	public MarcoBotones(){
		
		setTitle("Botones y Eventos");
		
		setBounds(700, 300, 500, 300);
		
		LaminaBotones milamina=new LaminaBotones();
		
		add(milamina);
	}
	
}

class LaminaBotones extends JPanel implements ActionListener{
	
	JButton botonazul = new JButton("Azul");
	JButton botonamarelo = new JButton("Amarillo");
	JButton botonrojo = new JButton("rojo");
	
	
	public LaminaBotones(){
		
		add(botonazul);
		add(botonamarelo);
		add(botonrojo);
		
		botonazul.addActionListener(this);
		botonamarelo.addActionListener(this);
		botonrojo.addActionListener(this);
		
		
	}
	
	public void actionPerformed(ActionEvent e){
		
		Object botonpulsado=e.getSource();
		
		if(botonpulsado==botonazul){
			
			setBackground(Color.blue);
			
		}
		
		else if(botonpulsado==botonamarelo){
			
			setBackground(Color.yellow);			
			
		}
		
		else{
			
			setBackground(Color.red);			
			
		}
		
		
		
		
	}
}
