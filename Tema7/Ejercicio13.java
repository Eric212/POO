import java.util.Scanner;
import java.util.Random;
public class Ejercicio13{
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		int k=1;
		int[] numeros=new int[10];
		System.out.println("A continuacion introduciras 10 valores");
		for(int i=0;i<numeros.length;i++){
			System.out.println("Introduce el valor "+k);
			numeros[i]=lector.nextInt();
			for(int j=0;j<1;j++){
				System.out.println("Valor "+k+": "+numeros[i]);
				System.out.println();
			}
			k++;
		}
	}
}