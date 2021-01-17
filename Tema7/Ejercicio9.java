import java.util.Scanner;
public class Ejercicio9{
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		String frase;
		System.out.println("Introduce una frase");
		frase=lector.nextLine();
		fraseImpar(frase);
	}
	static void fraseImpar(String frase){
		String fraseImpar="";
		int k=0;
		String[] palabra=frase.split(" ");
		for(int i=0;i<frase.length();i++){
			if(i==palabra[k].length()&&k<=palabra.length){
				k++;
				i=0;
				fraseImpar=fraseImpar+" ";
			}
			if(palabra.length==k){
				System.out.println(fraseImpar);
				i=frase.length();
			}
			if(i==0&&i!=frase.length()||i%2==0&&i!=1){
				fraseImpar=fraseImpar+Character.toString(palabra[k].charAt(i));
			}
		}
	}
}