package poo;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;




public class PruebaTemporizador2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Reloj mireloj=new Reloj();
		
		mireloj.enMarcha(3000, true);
		
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para terminar");
		
		System.exit(0);

	}

}


class Reloj{
	
	private int intervalo;
	
	private boolean sonido;
	
	
	public void enMarcha(int intervalo, final boolean sonido){
		
		class DameLaHora2 implements ActionListener{
			
			public void actionPerformed(ActionEvent event){
				
				Date ahora = new Date();
				
				System.out.println("Te pongo la hora cada 3 sg " + ahora);
				
				if (sonido){
					
					Toolkit.getDefaultToolkit().beep();
				}
				
				
				
			}
		}
		
		ActionListener oyente=new DameLaHora2();
		
		Timer mitemporizador=new Timer(intervalo, oyente);
		
		mitemporizador.start();
		
		
	}
	
	
	
}
