import java.util.Scanner;
public class Ejercicio12{
	public static void main(String[] args) {
		Scanner lector=new Scanner(Sistem.in);
		String frase;
		String remplazada;
		System.out.println("Introduce una frase");
		frase=lector.nextLine();
		remplazada=remplazarLetras(frase);
		System.out.println(remplazada);
		remplazada=remplazarNumeros(frase);
		System.out.println(remplazada);
	}
	static String remplazarLetras(String frase){
		remplazada=frase.replaceAll("es", "no por");
		return remplazada;
	}
	static String remplazarNumeros(String frase){
		remplazada=frase.replaceAll(\\d, "*");
		return remplazada;
	}
}