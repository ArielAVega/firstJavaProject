package principal;

/**
 * @author ariel
 * @version 1.0
 * Esta clase permite identificar el punto de partida
 * de ejecución
 */
public class Main {
	
	/**
	 * Este método es el que usa el lenguaje como punto de partida
	 * @param args representa valores que se le pueden asignar desde
	 * el sistema de ejecució
	 */
	public static void main(String[] args) {	
		
		// primera linea de código del bootcamp
		String mensaje = "Hola Mundo JAVA";
		System.out.println(mensaje);
		
		// variables de entrada
		int primerNumero = 5;
		int segundoNumero = 6;
		
		// procesos y variable de salida
		// se requiere la suma de los numeros
		int resultadoSuma = primerNumero + segundoNumero;
		
		System.out.println("El resultado de la suma es: "+resultadoSuma);
		
		final double PI = 3.14;
		
		char caracter = 'a';
		
		boolean booleanValue = false;
		
		float valorFloat = 12.5f;
		
		System.out.println("Estoy escribiendo \n y observando\" los \t resultados");
		
		String nombre= "Ariel";
		System.out.println("Mi nombre es "+ nombre);
		
		
		
		
	}
}
