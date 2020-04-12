
public class Practica_String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String frase="hoy es un estupendo dia para aprender a programar en Java";
		
		String Frase_resumen=frase.substring(4, 23);
		
			System.out.println(" La Frase tiene " + frase.length() + " Letras");
			System.out.println(" La letra 4 de la frase es: " + frase.charAt(4) + " Pero la Letra Numero 23 es: " + frase.charAt(22));
			System.out.println(Frase_resumen);
			
		
	}
	

}
