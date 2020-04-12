import java.util.*;

public class PrimerJuego {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int aleatorio=(int)(Math.random()*10);
		
		Scanner entrada=new Scanner(System.in);
		
		int numero=0;
		int intento=0;
		
		while(numero!=aleatorio) {
			System.out.println("Introduce un Numero del 1 al 10 Por Favor: ");	
			intento++;
			numero=entrada.nextInt();
		
			if (aleatorio<numero) {
				
				System.out.println(" Mas Bajo ");
				//intento=intento+1;
			
			}
			
			else if (aleatorio>numero) {
				System.out.println("Mas Alto");
				//intento=intento+1;
			}
		}
				System.out.println(" Correcto ");
				System.out.println(" el numero de intentos es: " + intento);
		
		
	}

}
