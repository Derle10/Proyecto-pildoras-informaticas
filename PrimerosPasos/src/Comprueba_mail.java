import javax.swing.JOptionPane;


public class Comprueba_mail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arroba = 0;
		boolean punto = false;
		
		String mail = JOptionPane.showInputDialog("Ingrese un correo electronico");
		
		
		for (int i = 0; i < mail.length(); i++){
			
			if (mail.charAt(i)=='@'){
				
				arroba++;				
			}
			
			if (mail.charAt(i)=='.'){
				
				punto = true;
				
			}
			
		}
		
		if (arroba==1 && punto==true){
			
			JOptionPane.showMessageDialog(null, "Es correcto");
			
		}
		
		else{
			
			JOptionPane.showMessageDialog(null, "Es incorrecto");
			
		}
		

	}

}
