import javax.swing.*;
public class Contraseņa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String clave="Jean Carlo";
	
	String pass="";
	
	while (clave.equals(pass)==false) {
		
		pass=JOptionPane.showInputDialog("Introduce la Contraseņa por Favor");
		
		if (clave.equals(pass)==false) {
			
			System.out.println("Contraseņa incorrecta");
						
			}
		
		}
		System.out.println("Contraseņa Correcta");
	}

}
