package empleados;
import java.util.*;
import javax.swing.JOptionPane;

public class infoEmpleados {

	public static void main(String [] agrs) {
		// TODO Auto-generated method stub
		
		empleados empleado1 =new empleados("JOSE COMENAREZ", "GERENTE OPERACIONES", 85000, 2000, 12, 17);
		empleados empleado2 =new empleados("MARIANA JIMENEZ", "GERENTE SISTEMAS", 82000, 2006, 2, 8);
		empleados empleado3 =new empleados("DAVID GONZALEZ", "ASISTENTE", 55000, 2018, 1, 27);
		
		
		empleado1.subeSueldo(10);
		empleado2.subeSueldo(15);
		empleado3.subeSueldo(5);
		
		System.out.println("Nombre: " + empleado1.damenombre()+ " Sueldo: "+ empleado1.dameSueldo()+
				" Fecha de Contrato es " + empleado1.dameFecha());
		
		System.out.println("Nombre: " + empleado2.damenombre()+ " Sueldo: "+ empleado2.dameSueldo()+
				" Fecha de Contrato es " + empleado2.dameFecha());
		
		System.out.println("Nombre: " + empleado3.damenombre()+ " Sueldo: "+ empleado3.dameSueldo()+
				" Fecha de Contrato es " + empleado3.dameFecha());
		
		
	}
	
}

class empleados{

	public empleados(String nom, String car, double sue, int agno, 
					int mes, int dia) {
		
	nombre=nom;
	cargo=car;
	sueldo=sue;
	GregorianCalendar calendario=new GregorianCalendar(agno,mes-1,dia);
	fecha_contrato=calendario.getTime();
	
	}
	
	private String nombre;
	private String cargo;
	private double sueldo;
	private double aumento;
	private Date fecha_contrato;

	// GETTER
	public String damenombre() {
		return nombre;
	}
	public String damecargo() {
		return cargo;
	}
	public double dameSueldo() {
		return sueldo;
	}
	public double dameAumento() {
		return aumento;
	}
	public Date dameFecha() {
		return fecha_contrato;
	}
	
	//SETTER
	public void subeSueldo(double porcentaje) {
		double aumento= sueldo*porcentaje/100;
		sueldo+=aumento;
		
	}
}

