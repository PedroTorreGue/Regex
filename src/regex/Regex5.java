package regex;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String input="";
		while(sc.hasNext())
			input +=sc.next();
		final String IPVALIDA="((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]|\\d)\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]|\\d)\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]|\\d)\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]|\\d))";
		Pattern patron= Pattern.compile(IPVALIDA);
		Matcher matcher=patron.matcher(input);
		int contador=0;
		while(matcher.find())
			contador++;
	}
	
}
