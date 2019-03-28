
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int f=3, c=3;
		int [][] matriz = new int[f][c];
		
		
		for (int i = 0; i < 3; i++){
			for (int x = 0; x < 3; x++){
				matriz[i][x] = 5;
				System.out.print(matriz[i][x]);
				
			}
			System.out.println("\t");
			
		}
		
		/*for (int x=0; x < matriz.length; x++) {
			  System.out.print("|");
			  for (int y=0; y < matriz[x].length; y++) {
			    System.out.print (matriz[x][y]);
			    if (y!=matriz[x].length-1) System.out.print("\t");
			  }
			  System.out.println("|");
			}*/
		
	
		

	}

}
