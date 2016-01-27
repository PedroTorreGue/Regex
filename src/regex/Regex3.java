package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex3 {
	public static void main(String[] args){
		String cadena1="En Melilla, \"los bomberos se han visto desbordados\" por las llamadas de vecinos alarmados";
		String cadena2="La localidad marroquí de Alhucemas, la más afectada";
		String cadena3="El epicentro, en el Mar de Alborán; se ha producido a las 5.22 horas";
		String cadena4="\"Flipas el pedazo de terremoto\"";
		String cadena5="Se ha sentido en Málaga y buena parte de Andalucía";

		final String INPUT = cadena1+" "+cadena2+" "+cadena3+" "+cadena4+" "+cadena5;
		final String PATRON = "\\b(el|la|l[oa]s?|una?|un[ao]s?)\\b";
		Pattern patron= Pattern.compile(PATRON);
		Matcher matcher=patron.matcher(INPUT.toLowerCase());
		int contador=0;
		while (matcher.find())
			contador++;
		System.out.println("Numero de artículos "+contador);
	}
}
