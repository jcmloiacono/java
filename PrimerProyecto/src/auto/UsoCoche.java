package auto;
import javax.swing.*;

public class UsoCoche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Coche micoche=new Coche();
		
		micoche.establece_color(JOptionPane.showInputDialog("Introduzca el Color del Auto"));
		micoche.dime_motor();
		micoche.establece_asientos(JOptionPane.showInputDialog("El Auto Tiene Asientos de Cuero SI/NO"));
		micoche.establece_climatizador(JOptionPane.showInputDialog("El Auto Esta Equipado Con CLimatizador SI/NO"));
		micoche.dime_pesototal();
		micoche.dime_precio();
	
		
		
		System.out.println(micoche.datos_generales());
		System.out.println(micoche.dime_color());
		System.out.println(micoche.dime_motor());
		System.out.println(micoche.dime_asientos());
		System.out.println(micoche.dime_climatizador());
		System.out.println(micoche.dime_pesototal());
		System.out.println(micoche.dime_precio());
	}

}
