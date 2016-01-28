package sbuilder;

import java.util.Scanner;

public class Ejemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ehecutamos cat log.txt
		Scanner sc= new Scanner(System.in);
		StringBuilder sBuilder =new StringBuilder();
		final String REGEXIP="((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]\\d|\\d)\\.){3}"
				+ "(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]\\d|\\d)";
		String palabra="";
		while(sc.hasNext()){
			palabra=sc.next();
			if(sc.next().matches(REGEXIP))
				sBuilder.append(palabra);
				sBuilder.append("-");
		}
		sc.close();
		System.out.println(palabra);
	}
	
}
