import java.util.*;
public class Condicionales {

	private static Scanner entrada;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		entrada = new Scanner(System.in);
		
		System.out.println("Introduce tu Edad:");
		
		int edad=entrada.nextInt();
		
		if(edad<18) {
			
			System.out.println("Eres un Adolescente");
		}
		
		else if(edad<40) {
			
			System.out.println("Eres un Joven");
		}
		
		else if(edad<65) {
			System.out.println("Eres Maduro");
			
		}
		
		else {
			System.out.println("estas viejito");
		}
	}
	
}