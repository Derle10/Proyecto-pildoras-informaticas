import javax.swing.JOptionPane;


public class Uso_for_each {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numeros[] = new int[150];
		
		for (int i = 0 ; i < numeros.length ; i++){
			
			numeros[i] = (int)Math.round(Math.random()*100);	
			
			
		}
		
		for (int elemento:numeros){
			
			System.out.print(elemento + " ");
			
			
			
		}
		
		/*String paises[] = { "ESPA�A" , "COLOMBIA" , "CHILE" , "ARGENTINA" , "MEXICO" , "ECUADOR" , "VENEZUELA" };
		
		for (int i = 0 ; i < paises.length ; i++){
		
		System.out.println(" Pa�s " + (i+1) + " " + paises[i]);
		
		}
		int c=0;
		for(String elemento:paises){
			
			c=c+1;		
			System.out.println(c+elemento+paises[c-1]);
			
		}
		
		String pais[] = new String[8];
		
		for (int i=0 ; i<pais.length ; i++){
			
			pais[i]=JOptionPane.showInputDialog("Introduce el pais : " + (i+1));
			
		}
		for(String elemento:pais){
			
			c=c+1;		
			System.out.println(c+elemento);
			
		}*/

	}

}
