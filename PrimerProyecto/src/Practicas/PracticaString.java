package Practicas;

public class PracticaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre= "Jean CarlO";
		String papellido= "Martinez";
		String sapellido="Lo Iacono";
		int suma;
		int suman, sumap, sumas;
		
		suman= nombre.length();
		sumap= papellido.length();
		sumas= sapellido.length();
		
		suma= (int) nombre.length()+papellido.length()+sapellido.length();
		
		System.out.println(" Mi nombre tiene " + nombre.length() +  " Letras");
		System.out.println(" Mi Primer Apellido tiene " + papellido.length() +  " Letras");
		System.out.println(" Mi Segundo Apellido tiene " + sapellido.length() +  " Letras");
		System.out.println("La Suma de Todas las letras seria  "+  suma + "\n"); 
		
		System.out.println(" La Primera letra de mi nombre es " + nombre.charAt(0)+ " Y la Ultima letra es: " + nombre.charAt(suman-1));
		
		System.out.println(" La Primera letra de mi Primer Apellido es " + papellido.charAt(0));
		
		System.out.println(" La Primera letra de mi Segundo Nombre es " + sapellido.charAt(0));
		
	}

}
