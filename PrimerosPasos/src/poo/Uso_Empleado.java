package poo;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.JOptionPane;
import javax.xml.crypto.Data;

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Empleado empleado1=new Empleado("Derlevin Bedoya", 85000, 2019, 03, 12);
		Empleado empleado2=new Empleado("Andres Gaviria", 95000, 2018, 06, 16);
		Empleado empleado3=new Empleado("Gloria ramirez", 105000, 2019, 05, 01);
		
		empleado1.subeSueldo(5);
		empleado2.subeSueldo(5);
		empleado3.subeSueldo(5);
		
		System.out.println("Nombre: " + empleado1.dameNombre() + "\nSueldo: " + empleado1.dameSuledo() 
				+ "\nFecha de alta: " + empleado1.dameFechaContrato());
		
		System.out.println("Nombre: " + empleado2.dameNombre() + "\nSueldo: " + empleado2.dameSuledo() 
				+ "\nFecha de alta: " + empleado2.dameFechaContrato());
		
		System.out.println("Nombre: " + empleado3.dameNombre() + "\nSueldo: " + empleado3.dameSuledo() 
				+ "\nFecha de alta: " + empleado3.dameFechaContrato());*/
		
		Jefatura jefe_RRHH = new Jefatura("Derle", 5000, 2019, 03, 16);
		jefe_RRHH.estableceIncentivo(700);
		
		Empleado misEmpleados[] = new Empleado[6];
		
		/*for(int i=0; i<misEmpleados.length; i++){
			
			String nombreEmpleado= JOptionPane.showInputDialog("Ingresar el nombre del empleado: ");
			int sueldoEmpleado= Integer.parseInt(JOptionPane.showInputDialog("Ingresar el sueldo del empleado: "));
			int agnoEmpleado= Integer.parseInt(JOptionPane.showInputDialog("Año de alta: "));
			int mesEmpleado= Integer.parseInt(JOptionPane.showInputDialog("Mes de alta: "));
			int diaEmpleado= Integer.parseInt(JOptionPane.showInputDialog("Dia de alta: "));
			misEmpleados[i] = new Empleado(nombreEmpleado, sueldoEmpleado, agnoEmpleado, mesEmpleado, diaEmpleado);
			System.out.println("Nombre del empleado numero " + (i+1) + " es: "  + misEmpleados[i].dameNombre() + 
					" Sueldo: " + misEmpleados[i].dameSueldo() + " Fecha de alta: " + 
					misEmpleados[i].dameFechaContrato());
		}*/
		
		misEmpleados[0]=new Empleado("Ana", 30000, 2000, 07, 07);
		misEmpleados[1]=new Empleado("Carlos", 30000, 2000, 07, 07);
		misEmpleados[2]=new Empleado("Pedro", 20000, 3000, 07, 07);
		misEmpleados[3]=new Empleado("Antonio", 10000, 1000, 07, 07);
		misEmpleados[4]=jefe_RRHH;// POLIMORFISMO PRINCIPIO DE SUSTITUCION
		misEmpleados[5]=new Jefatura("Maria", 5000, 2016, 03, 03);
		
		Jefatura jefe_finanzas = (Jefatura) misEmpleados[5];
		jefe_finanzas.estableceIncentivo(700);
		
		Empleado director_comercial= new Jefatura("Alan", 4500, 2019, 03,8);
		Comparable ejemplo= new Empleado("Gero", 1500, 2019, 02, 01);
		System.out.println(jefe_finanzas.tomar_decisiones("Dar mas días de vacaciones a los empleados"));
		System.out.println("El jefe " + jefe_finanzas.dameNombre() + " Tiene un bonus de: "
				+ jefe_finanzas.establece_bonus(500));
		System.out.println(misEmpleados[3].dameNombre() + " Tiene un bonos de: " + 
				misEmpleados[3].establece_bonus(200));
		
		
		if (director_comercial instanceof Empleado){
			
			System.out.println("Es de tipo jefatura");
			
		}
		
		if (ejemplo instanceof Comparable){
			
			System.out.println("Implementa la interface comparable");
			
		}		
		
		
		for (Empleado e: misEmpleados){ // FOR MEJORADO
			
			e.subeSueldo(5);
		}
		
		Arrays.sort(misEmpleados);
		
		for (Empleado e:misEmpleados){
			
			System.out.println("Nombre: " + e.dameNombre() + " Sueldo: " + e.dameSueldo() + 
					" Fecha de alta: " + e.dameFechaContrato());
			
		}
		

	}

}

class Empleado implements Comparable,Trabajadores{
	
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	private int id;
	private static int idSiguiente=1; //INDICA QUE ES LA VARIABLE DE LA CLASE 
	
	public int compareTo(Object miObjeto){
		
		Empleado otroempleado = (Empleado) miObjeto;
		
		if (this.id<otroempleado.id){
			
			return -1;
			
		}
		if (this.id>otroempleado.id){
			
			return 1;
			
		}
		
		return 0;
		
	}
	
	public Empleado(String nom, double sue, int agno, int mes, int dia){
		
		nombre=nom;
		sueldo=sue;
		GregorianCalendar calendario=new GregorianCalendar(agno, mes-1, dia);
		altaContrato=calendario.getTime();
		id=idSiguiente;
		idSiguiente++;
		
		
		
	}
	
	public Empleado(String nom){// SOBRE CARGA DE CONSTRUCTOR CON EL THIS GENERA UN PARAMETRO DEL OTRO CONSTRUCTOR
	
		
		this(nom,500,2019,02,02);
		
	}
	
	public String dameNombre(){//GETTER
		
		return nombre + " id: " + id;
		
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

	@Override
	public double establece_bonus(double gratificacion) {
		
		return Trabajadores.bonus_base+gratificacion;
	}
	
}


class Jefatura extends Empleado implements Jefes{
	
	private double incentivo;
	
	public String tomar_decisiones(String decision){
		
		return "Un miembro de la direccion a tomado la decisión de: " + decision;
		
	}	
	
	public Jefatura(String nom, double sue, int agno, int mes, int dia){
		
		//COMO YA TENIAMOS ESTOS PARAMETROS EN LA CLASE EMPLEADOS NO ES NECESARIO 
		//CREARLOS, EN CASO DE QUE USEMOS UNO NUEVO SI HAY QUE DECLARARLO.
		
		super(nom, sue, agno, mes, dia);// ENVIA LOS PARAMATROS AL CONSTRUCTOR EMPLEADO
		
		
	}
	
	public void estableceIncentivo(double b){
		
		incentivo=b;
		
	}
	
	public double dameSueldo(){
		
		double sueldoJefe=super.dameSueldo();
		
		return sueldoJefe+incentivo;
		
	}

	@Override
	public double establece_bonus(double gratificacion) {
		
		double prima=2000;
		
		return Trabajadores.bonus_base+gratificacion+prima;
	}

	
		
	
}


class Director extends Jefatura {
	
	
	public Director(String nom, double sue, int agno, int mes, int dia){
		
		super(nom, sue, agno, mes, dia);
		
	}
	
	
}


