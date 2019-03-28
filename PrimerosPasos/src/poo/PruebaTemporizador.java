package poo;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.*;

public class PruebaTemporizador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DamelaHora oyente=new DamelaHora();
		
		Timer mitemporizador=new Timer(5000, oyente);
		
		mitemporizador.start();
		
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para deteners");
		
		System.exit(0);

	}

}

class DamelaHora implements ActionListener{
	
	public void actionPerformed(ActionEvent e) {
		
		Date ahora=new Date();
		
		System.out.println("Te pongo la hora cada 5sg: " + ahora);
		
		Toolkit.getDefaultToolkit().beep(); //GENERA UN SONIDO EN EL SISTEMA CADA 5 SEGUNDOS
		
	}
	
}