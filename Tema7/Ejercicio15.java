import java.util.Scanner;
public class Ejercicio15{
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		int k=1;
		int[] numeros=new int[20];
		System.out.println("A continuacion introduciras 20 valores");
		for(int i=0;i<numeros.length;i++){
			System.out.println("Introduce el valor "+k);
			numeros[i]=lector.nextInt();
			k++;
		}
		for(int i=0;i<5;i++){
			System.out.println(numeros[i]+" ");
			if(i==4){
				System.out.println();
			}
		}
		
	}
}