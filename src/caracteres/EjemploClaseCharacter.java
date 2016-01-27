package caracteres;

import java.util.Scanner;

public class EjemploClaseCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creamos el escaner
		Scanner in= new Scanner(System.in);
		String input="";
		while(in.hasNextLine())
			input+=in.nextLine();
		//convertimos el String a un array de char
		char[] arrayChar = input.toCharArray();
		int contadorletras=0;
		int contadornumeros=0;
		int contadorsimbolos=0;
		for (char c : arrayChar) {
			if (Character.isDigit(c))
				contadornumeros++;
			else if (Character.isLetter(c))
				contadorletras++;
			else 
				contadorsimbolos++;
			
			
		}
		System.out.printf("%s %d %s %d %s %d%n","EL numero de letras es: ",contadorletras,
				"El numero de numeros es de: ",contadornumeros,
				"El numero de símbolos es de: ", contadorsimbolos);
	}

}
