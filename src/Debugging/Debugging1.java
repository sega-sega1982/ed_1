package Debugging;

import java.util.Scanner;

/*
 * Mediante puntos de interrupcion e inspeccion de variables encuentra
 * donde esta el fallo del programa. 
 * 
 * Ademas de indicar el error debes subir un par de capturas de pantalla 
 * en las que se vea que estas empleando el debugger para inspeccionar las variables
 * 
 */
public class Debugging1 {
	public static void main(String[] args) {

		double s, a, b, S;
		Scanner cin = new Scanner(System.in);
		s = 0;
		
		System.out.print("Introduce 1 valor: ");
		a = cin.nextDouble();
		System.out.print("Introduce otro valor: ");
		b = cin.nextDouble();
		S = a + b;
		System.out.println("La suma es: " + s);
	}
}
