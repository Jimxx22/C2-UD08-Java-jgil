
public class MainApp {

	public static void main(String[] args) {
		
		//Generamos losobjetos Presona, usando todos los constructores
		Persona persona1 = new Persona();
		Persona persona2 = new Persona("Jaume",21,"12345678A","hombre");
		Persona persona3 = new Persona("Anna", 21, "12345678A", "mujer", 60, 1.62);
		
		//Mostramos los objetos usando la funcion toString
		System.out.println("OBJETO PERSONA:");
		System.out.println(persona1);
		System.out.println(persona2);
		System.out.println(persona3);
		
		//Generamos los objetos Password, usando todos los constructores
		Password password1=new Password();
		Password password2=new Password(15);
		
		//Mostramos los objetos usando la funcion toString
		System.out.println("\nOBJETO PASSWORD:");
		System.out.println(password1);
		System.out.println(password2);
		
		//Generamos los objetos Electrodomestico, usando todos los constructores
		Electrodomestico electrodomestico1 = new Electrodomestico();
		Electrodomestico electrodomestico2 = new Electrodomestico(250.0,20.0);
		Electrodomestico electrodomestico3 = new Electrodomestico(150.0, "rojo", "c", 25.0);
		
		//Mostramos los objetos usando la funcion toString
		System.out.println("\nOBJETO ELECTRODOMESTICO:");
		System.out.println(electrodomestico1);
		System.out.println(electrodomestico2);
		System.out.println(electrodomestico3);
		
		//Generamos los objetos Serie, usando todos los constructores
		Serie serie1 = new Serie();
		Serie serie2 = new Serie("Doraemon", "Fujiko F. Fujio");
		Serie serie3 = new Serie("Shin-chan", 25, "comedia", "Yoshito Usui");
		
		//Mostramos los objetos usando la funcion toString
		System.out.println("\nOBJETO SERIES:");
		System.out.println(serie1);
		System.out.println(serie2);
		System.out.println(serie3);

	}
}
