import java.util.Scanner;

public class Practica_Importacion {

	private static Scanner entrada;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	entrada = new Scanner(System.in);
		System.out.println("introduce tu nombre, Por Favor" );
		
		String nombre_usuario=entrada.nextLine();
		
		System.out.println(" Introduce Edad");
		
		int edad=entrada.nextInt();
	
		System.out.println("hola " + nombre_usuario + " el año que viene tendras " + (edad+1)+ " años");
		
	}

}
