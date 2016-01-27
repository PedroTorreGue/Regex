package regex;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Regex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//leemos por scanner posibles direcciones IP
		//las direcciones IP pueden ser:
		//127.0.0.1 255.255.255.255 192.168.0.1
		//no son válidas127.0.1 ni 256.255.255.255
		System.out.println("Introduce IPs válidas:");
		Scanner in =new Scanner(System.in);
		String posibleIP= in.next();
		List<String> listaIPs= new ArrayList<String>();
		while(validarIP(posibleIP)){
			listaIPs.add(posibleIP);
			posibleIP=in.next();
			//creamos una colección
		}
		in.close();
		System.out.println(listaIPs);
	}
	//metodo que nos valida la dirección IP
	public static boolean validarIP(String ip){
		//return ip.matches("\\d{3}\\.\\d{3}\\.\\d{3}\\.\\d{3}");
		//return ip.matches("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}");
		//acepta cualquier dígito entre 0 y 999
		return ip.matches("(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]|\\d)\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]|\\d)\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]|\\d)\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]|\\d)");
		//return ip.matches("\\d[1 2]?\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}");
		
	}

}
