import java.util.Scanner;
public class Ejercicio10{
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		String palabra;
		boolean palindromo;
		System.out.println("Introduce una palabra");
		palabra=lector.nextLine();
		palindromo=palindromo(palabra);
		if(palindromo){
			System.out.println("La palabra es un palindromo");
		}else{
			System.out.println("La palabra no es un palindromo");
		}
	}
	static boolean palindromo(String palabra){
		StringBuilder sB=new StringBuilder(palabra);
		boolean palindromo;
		if(sB.reverse().equals(palabra)){
			palindromo=true;
			return palindromo;
		}else{
			palindromo=false;
			return palindromo;
		}
	}
}