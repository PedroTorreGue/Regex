package Ejercicios;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PalabraLeida {
	String valor= "";
		public static int numeroDeLetras(String valor){
			int totalletras=valor.length();
			return totalletras;
		}
		public static boolean EmpiezaPorVocal(String valor){
			final String INPUT = valor.substring(0, 0);
			final String PATRON="{a ,e, i, o, u}";
		Pattern patron=Pattern.compile(PATRON);
		Matcher matcher=patron.matcher(INPUT.toLowerCase());
			return true;
		}
		public static boolean AcabaEnVocal(String valor){
			
			return true;
			
		}

}
