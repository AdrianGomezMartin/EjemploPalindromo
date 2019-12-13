package paquete;

import java.util.Scanner;

public class Principal {
	private static String pedirPalabra(String enunciado) {
		System.out.println(enunciado);
		return dameScanner().nextLine();
	}

	private static Scanner dameScanner() {
		return new Scanner(System.in);
	}

	public static void main(String[] args) {
		String palabra = pedirPalabra("Introduce una palabra para saber si es palindromo");
		esPalindromo(palabra);

	}

	private static void esPalindromo(String palabraUsuario) {
		// Primero hay que saber si el numero de caracteres es par
		String primeraParte = "";
		String segundaParte = "";
		if (palabraUsuario.length() % 2 == 0) {// Es Par
			for (int i = 0; i < palabraUsuario.length() / 2; i++) {//Recorro lo caracteres de la palabra introducida hasta la mitad
				primeraParte += palabraUsuario.charAt(i); //Los meto en una cadena
			}
			for (int i = palabraUsuario.length() / 2 - 1; i >= 0; i--) {//Recorro la mitad de la palabra introducida pero al reves
				segundaParte += palabraUsuario.charAt(i);
			}
			String palabraCreada = primeraParte + segundaParte;// Creo una palabra a partir de la primera y segunda parte
			if (palabraCreada.equalsIgnoreCase(palabraUsuario))//Si la palabra que ha introducido es igual a la que he compuesto 
				System.out.println("Es palindromo");
			else
				System.out.println("No es palindromo");
		} else {// Es impar
			for (int i = 0; i < palabraUsuario.length() / 2 + 1; i++) {//Recorro lo caracteres de la palabra introducida un caracter mas de la mitad
				primeraParte += palabraUsuario.charAt(i); // Los meto en una cadena
			}
			for (int i = primeraParte.length() - 2; i >= 0; i--) {//Le doy  i el valor de la longitud de la primera parte -2 porque es impar 
				segundaParte += primeraParte.charAt(i);
			}
			String palabraComprobar = primeraParte + segundaParte;
			if (palabraUsuario.equalsIgnoreCase(palabraComprobar)) {//Igual que antes
				System.out.println("Es un palindromo");
			} else {
				System.out.println("No es un palindromo");
			}
		}

	}

}
