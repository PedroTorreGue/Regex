package sbuilder;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EjemploDistintasIPs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ehecutamos cat log.txt
		Scanner sc= new Scanner(System.in);
		Set<String> conjuntoIPDiferentes = new HashSet<String>();
		final String REGEXIP="((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]\\d|\\d)\\.){3}"
				+ "(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]\\d|\\d)";
		String palabra="";
		int contador=0;
		while(sc.hasNext()){
			palabra=sc.next();
			
			if(palabra.matches(REGEXIP)){
				sBuilder.append(palabra);
				sBuilder.append("-");
				contador++;
			}
		}
		sBuilder.reverse();
		sBuilder.delete(0, 1);
		sBuilder.reverse();
		sc.close();
		System.out.println(palabra);
		System.out.println("El número de IPs es: "+contador);
	}
	
}