import javax.swing.*;
public class Contraseña {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String clave="Jean Carlo";
	
	String pass="";
	
	while (clave.equals(pass)==false) {
		
		pass=JOptionPane.showInputDialog("Introduce la Contraseña por Favor");
		
		if (clave.equals(pass)==false) {
			
			System.out.println("Contraseña incorrecta");
						
			}
		
		}
		System.out.println("Contraseña Correcta");
	}

}
