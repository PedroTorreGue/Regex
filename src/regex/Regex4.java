package regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class Regex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String input="";
		while(sc.hasNext())
			input +=sc.next();
		final String PATRON_MOZILLA_SAFARI="(Mozilla)|(Safari)";
		Pattern patron= Pattern.compile(PATRON_MOZILLA_SAFARI);
		Matcher matcher=patron.matcher(input);
		int contador=0;
		while(matcher.find())
			contador++;
		System.out.println("Nº de ocurrencias de Mozilla "+contador);
		
	}

}
