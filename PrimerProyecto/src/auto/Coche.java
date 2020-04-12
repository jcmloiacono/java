package auto;

public class Coche {
//* DATOS COMUNES
	private int ruedas;
	private int largo;
	private int ancho;
	private int peso_plataforma;
	
//* DATOS INGRESADOS POR EL USUARIO	
	private String color;
	private int motor;
	private int peso_total;
	private boolean asientos_cuero, climatizador;
	private int peso_climatizador;
	private int peso_asientos;
	private int precio_climatizador;
	private int precio_asientos;
	private int precio;
	private int precio_total;
	
public Coche() {

	ruedas=4;
	largo=2000;
	ancho=300;
	motor=2000;
	peso_plataforma = 600;
	precio=2000;
	
		
	
}

public String datos_generales() { //GETTER
	return "La Plataforma del Vehiculo tiene: " + ruedas + " ruedas" + ". Mide " + largo/1000 + " Metros con un Ancho de "
			+ ancho + " Cm y un peso de Plataforma de " + peso_plataforma + "Kg";
}

public void establece_color(String color_coche) { //SETTER
	color=color_coche;
}
public String dime_color() {
	return "El Color del auto es: " + color;
}

public void establece_motor(int tipo_motor) {
	motor=tipo_motor;
}

public String dime_motor() {
	return "El Motor del Auto es: " + motor + "cc";
}

public void establece_asientos(String cuero) {
	if(cuero.equalsIgnoreCase("si")) {
		asientos_cuero=true;
		peso_asientos+=100;
		precio_asientos+=500;
	}else
		asientos_cuero=false;
}

public String dime_asientos() {
	if (asientos_cuero==true) {
		return "El Coche tiene asientos de Cuero";
	}else
		return "El Coche tiene asientos de Tela";
}

public void establece_climatizador(String aire) {
	if(aire.equalsIgnoreCase("si")) {
		climatizador=true;
		peso_climatizador+=50;
		precio_climatizador+=250;
	}else
		climatizador=false;
}

public String dime_climatizador() {
	if (climatizador==true) {
		return "El Coche tiene Climatizador";
	}else
		return "El Coche NO tiene Climatizador";
}

public String dime_pesototal() {
	if (climatizador==true && asientos_cuero==true) {
		peso_total=peso_plataforma+peso_climatizador+peso_asientos;
		return "El Peso Total del Coche es: " + peso_total + " Kg";
	}
	if (climatizador==true && asientos_cuero==false) {
		peso_total=peso_plataforma+peso_climatizador+peso_asientos;
		return "el Peso total del Coches es: " + peso_total + " Kg";
	}else
		peso_total=peso_plataforma+peso_climatizador+peso_asientos;
		return "El peso Total del Coches es: " + peso_total + " Kg";
}

public String dime_precio() {
	if (asientos_cuero==true && climatizador==true) {
		precio_total=precio+precio_asientos+precio_climatizador;
		return "El Precio Total del Auto Full Equipo es: " + precio_total + " Dolares";
	}if (asientos_cuero==true && climatizador==false) {
		precio_total=precio+precio_asientos+precio_climatizador;
		return "El Precio Total del Auto Semi-Full es: " + precio_total + " Dolares";
	}else
		precio_total=precio+precio_asientos+precio_climatizador;
		return "El Precio del Auto Economico es: " +precio_total + " Dolares";
}

}



