import java.util.*;
import javax.swing.*;
public class PesoIdeal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String genero;
		
		do {
			genero=JOptionPane.showInputDialog("Introduce tu Genero (H / M )");
			
		}while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);
		
		int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce Altura en cm "));
		
		int pesoideal=0;
		
		if(genero.equalsIgnoreCase("H")) {
			
			pesoideal=altura-110;
		}
		
		else if (genero.equalsIgnoreCase("M")) {
			
			pesoideal=altura-120;
		}
		
		System.out.println("Su Peso Ideal debe ser: " + pesoideal + "Kg");
		
		
	}

}
