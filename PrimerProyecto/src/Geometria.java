import java.util.*;
import javax.swing.*;
public class Geometria {

	private static Scanner entrada;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		entrada = new Scanner(System.in);
		
		System.out.println("Elige una Opcion:  \n1: Cuadrado \n2: Rectangulo \n3: Triangulo \n4: Circulo");
	
		int figura=entrada.nextInt();
		
		switch (figura) {
		
		case 1:
			int lado=Integer.parseInt(JOptionPane.showInputDialog("Introduce el Lado"));
			
			System.out.println("El Area del Cuadrado es: " + Math.pow(lado, 2));
		break;
		
		
		case 2:
			int base=Integer.parseInt(JOptionPane.showInputDialog("Intruduce la Base"));
			int altura=Integer.parseInt(JOptionPane.showInputDialog("Intoduce la Altura"));
			
			System.out.println("El Area del Rectangulo es " + base*altura);
			
			break;
		
		case 3:
			base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la Base"));
			altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la Altura"));
			
			System.out.println("El area del Triangulo es " + base*altura/2);
			
		case 4:
			double pi=3.1416;
			int radio=Integer.parseInt(JOptionPane.showInputDialog("Introduce el Radio del Circulo"));
			
			 System.out.println("El Area del Circulo es:" + pi*(radio*radio)); //otra opcion
			
			System.out.print("El Area del Circulo es ");
			System.out.printf("%1.2f", Math.PI*(Math.pow(radio, 2)));
			
			break;
		
		default:
			System.out.println("La Opcion Seleccionada no es Correcta");
		}
	}

}
