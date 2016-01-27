package regex;

public class regex1 {

	public static void main(String[] args) {
		//usamos las cadenas dentro del string
		String cadenaPrueba1="hola\"mundo\"";
		System.out.println(cadenaPrueba1);
		String cadenaPrueba2="La policía no solo detectó trazas de "
				+ "Polonio 210 en la tetera y en la taza usada por "
				+ "Litvinenko, también en los servicios del hotel "
				+ "visitados por sus dos \"envenenadores\", Dimitru "
						+ "Kovtun y Andrei Lugovoi, en las habitaciones "
						+ "de ambos, en la mesa del restaurante Pescatori,"
						+ " en la barra del bar Dar Marrakesh y hasta en los"
						+ " asientos usados por Lugovoi y su familia en el "
						+ "Estadio Emirates del Arsenal, donde presenciaron "
						+ "el encuentro entre "
				+ "los \"Gunnners\" y el CSK de Moscú.";
		if (cadenaPrueba2.matches(".*\\d{2}[A-Za-z]*.*"))
			System.out.println("La cadena tiene digitos");
		else System.out.println("La cadena NO tiene dígitos");
		
		
	}

}
