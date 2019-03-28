package encapsulacion;

public class Automovil {
	
	//Atributos
	private int precio;
	private String marca;
	
	
	//Constructor
	public Automovil(){
		
		System.out.println("Se ha creado un objeto automovil");
	}
	
	public int getPrecio(){
		return this.precio;
		
	}
	
	public String getMarca(){
		return this.marca;
	}
	
	//metodos set  
	
	public void setPrecio(int p){
		
		this.precio = p;
		
		
	}
	
	public void setMarca(String m){
		
		this.marca = m;
	}
	

}
