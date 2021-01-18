import java.util.Scanner;
public class Ejercicio14{
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		char[] caracteres=new char[10];
		int k=1;
		System.out.println("A continuacion introduciras 10 valores");
		for(int i=0;i<caracteres.length;i++){
			System.out.println("Introduce el valor "+k);
			caracteres[i]=lector.next().charAt(0);
			if(k%2==0){
				System.out.println();
				System.out.println("Valor "+k+": "+caracteres[i]+" es par");
				System.out.println();
			}else{
				System.out.println();
				System.out.println("Valor "+k+": "+caracteres[i]+" es impar");
				System.out.println();
			}
			k++;
		}
	}
}