package Ejercicios;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.text.AbstractDocument.LeafElement;

public class PalabraLeida {
	String valor= "";
		public static int numeroDeLetras(String valor){
			int totalletras=valor.length();
			return totalletras;
		}
		public static boolean EmpiezaPorVocal(String valor){
			final String INPUTEV = valor.substring(0, 0);
			final String PATRONEV="{a ,e, i, o, u}";
		Pattern patron=Pattern.compile(PATRONEV);
		Matcher matcher=patron.matcher(INPUTEV.toLowerCase());
			return true;
		}
		public static boolean AcabaEnVocal(String valor){
			final String INPUTAV = valor.substring(valor.length()-2), valor.Length()-1);
			final String PATRONAV="{a ,e, i, o, u}";
		Pattern patron=Pattern.compile(PATRONAV);
		Matcher matcher=patron.matcher(INPUTAV.toLowerCase());
			return true;
			
		}
		public static int NumerodeVocales(String valor){
			int totalVocales=0;
			while(valor.hasNext())
			final String PATRONNV="{a ,e, i, o, u}";
			Pattern patron= Pattern.compile(PATRONNV);
			Matcher matcher=patron.matcher(valor);
			while(matcher.find())
				totalVocales++;
			return totalVocales;
		}
		

}
