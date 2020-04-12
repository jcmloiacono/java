package Practicas;

import javax.swing.JOptionPane;

public class MostrandoLetras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Crea una clase con un método main que pida una entrada de teclado y 
		 usando un bucle while, el método length de la clase String y el método 
		 substring de la clase String, muestre cada una de las letras que componen
		 la entrada. Por ejemplo si se introduce “ave” debe mostrar:*/

		String palabra;
		int contador;
		int invertir;
		
		
		palabra= JOptionPane.showInputDialog("Ingrese una Palabra");
		contador= palabra.length();
		invertir= 0;
		
			System.out.println (" La Palabra " + palabra + " esta compuesta por ");
		
		while (true) {
			contador=contador-1; 
			
				System.out.println(palabra.charAt(invertir));
				invertir++;
		
		if (contador==0) { break;}
		
		}
		
	}

}
