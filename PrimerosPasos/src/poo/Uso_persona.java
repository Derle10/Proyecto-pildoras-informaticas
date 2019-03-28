package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona lasPersonas[]=new Persona[2];
		
		lasPersonas[0]=new Empleado2("Derle", 20, 2019, 03, 03);
		lasPersonas[1]=new Alumno("Fader", "Biologia");
		
		for(Persona p:lasPersonas){
			
			System.out.println(p.dameNombre() + "," +p.dameDescripcion());
		}
	}

}
abstract class Persona{
	
	private String nombre;
	
	public Persona(String nom){
		
		nombre=nom;
		
	}
	
	public String dameNombre(){
		
		return nombre;
		
	}
	
	public abstract String dameDescripcion();
		
		
		
}


class Empleado2 extends Persona{
	

	private double sueldo;
	private Date altaContrato;
	private int id;
	private static int idSiguiente=1; //INDICA QUE ES LA VARIABLE DE LA CLASE 
	
	public Empleado2(String nom, double sue, int agno, int mes, int dia){
		
		super(nom);
		sueldo=sue;
		GregorianCalendar calendario=new GregorianCalendar(agno, mes-1, dia);
		altaContrato=calendario.getTime();
		id=idSiguiente;
		idSiguiente++;	
		
	}
	
	public String dameDescripcion(){
		
		return "Este emepleado tiene un Id=" + id + " con un sueldo= " + sueldo;
		
		
	}

	public double dameSueldo(){//GETTER
		
		return sueldo;
		
	}
	
	public Date dameFechaContrato(){//GETTER
		
		return altaContrato;
		
	}
	
	public void subeSueldo(double porcentaje){
		
		double aumento=sueldo*porcentaje/100;
		
		sueldo+=aumento;
		
	}
	
}


class Alumno extends Persona{
	
	private String carrera;
	
	public Alumno(String nom, String car){
		
		super (nom);
		this.carrera=car;		
	}
	
	public String dameDescripcion(){
		
		return "Esta estudiando la carrera de " + carrera;
		
		
	}
	
}