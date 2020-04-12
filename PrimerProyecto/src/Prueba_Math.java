
public class Prueba_Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double na = 9.99;
		
		float numero=9.74F;
		
		double potencia=Math.pow(na, numero);
		double raiz=Math.sqrt(na);
		//sqrt Raiz Cuadrada de Numero (x)
		
		int resultado=(int)Math.round(numero);

// practica con String
		
			String nombre="Jean Carlo";
			int ultima;
			char primera;
			primera=nombre.charAt(0);
			ultima=nombre.length();
		
		System.out.println(resultado); //impresion del metodo Round (Redondeo)
		System.out.println(raiz); // Impresion de metodo Math con Raiz cuadrada
		System.out.println("el Valor de la pontencia de " + na + " elevado a: " + numero + " es igual a " + potencia);

		System.out.println("tu nombre es:" + nombre); // impresion de la Clase String
		System.out.println(" Mi Nombre tiene " + nombre.length() + " Letras ");
		System.out.println(" Cuarta letra de " + nombre + " es: " + nombre.charAt(3));
		System.out.println("Y la ultima letra es la " + nombre.charAt(ultima-1));
		System.out.println(" la Primera letra del Nombre " + nombre + " es " + primera);
		
		
	}

}
