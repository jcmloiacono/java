import javax.swing.*;
public class Contrase�a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String clave="Jean Carlo";
	
	String pass="";
	
	while (clave.equals(pass)==false) {
		
		pass=JOptionPane.showInputDialog("Introduce la Contrase�a por Favor");
		
		if (clave.equals(pass)==false) {
			
			System.out.println("Contrase�a incorrecta");
						
			}
		
		}
		System.out.println("Contrase�a Correcta");
	}

}
