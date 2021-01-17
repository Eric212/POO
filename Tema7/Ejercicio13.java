import java.util.Scanner;
import java.util.Random;
public class Ejercicio13{
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		int tam;
		int opcion;
		int complejidad;
		System.out.println("Introduce cuantos valores quieres");
		tam=lector.nextInt()-1;
		System.out.println("Quiers valores numericos o alfabeticos\n1:Numericos\n2:Alfabeticos");
		opcion=lector.nextInt();
		while(opcion<0&&opcion>2){
			System.out.println("Introduce un valor valido\n1:Numericos\n2:Alfabetico");
			opcion=lector.nextInt();
		}
		System.out.println("Cuantos caracteres quieres por valor\n1:Un caracter\n2:Dos caracteres\n3:Aleatorios");
		complejidad=lector.nextInt();
		while(complejidad<0&&complejidad>3){
			System.out.println("Introduce un valor valido\n1:Numericos\n2:Alfabetico");
			opcion=lector.nextInt();
		}
		int[] valores=new int[tam];
	}
	static void valorizacion(int[] valores,int opcion,int complejidad){
		Random alea = new Random();
		if(opcion==1){
			if(complejidad==1){
				for(int i=0;i<valores.length;i++){
					alea=alea.nextInt(10);
					valores[i]=alea;
					if(i==valores.length-1){
						for(int k=0;k<valores.length;k++){
							System.out.print(valores[k]);
						}
					System.out.println();
					}
				}
			}else if(complejidad==2){
				for(int i=0;i<valores.length;i++){
					alea=nextInt(20)+10;
					valores[i]=alea;
				}
			}else{
				for(int i=0;i<valores.length;i++){
					alea=nextInt(alea=nextInt(1000));
					valores[i]=alea;
				}
			}
		}else{
			if(complejidad==1){
				String alfabeto="abcdefghijklmnñopqrstuvwxz";
				char[]letras=alfabeto.toCharArray();
				for(int i=0;i<valores.length;i++){
					alea=nextInt(26);
					valores[i]=letras[alea];
					if(i==valores.length-1){
						for(int k=0;k<valores.length;k++){
							System.out.print(valores[k]);
						}
					System.out.println();
					}
				}
			}else if(complejidad==2){
				String palabra;
				String alfabeto="abcdefghijklmnñopqrstuvwxz";
				char[]letras=alfabeto.toCharArray();
				for(int i=0;i<valores.length;i++){
					for(int k=0;k<2;k++){
						alea=nextInt(26);
						palabra=palabra+letras[k];
						if(i==1){
							valores[i]=palabra;
						}
					}
					if(i==valores.length-1){
						for(int k=0;k<valores.length;k++){
							System.out.print(valores[k]);
						}
					System.out.println();
					}
				}
			}else{
				String palabra;
				String alfabeto="abcdefghijklmnñopqrstuvwxz";
				char[]letras=alfabeto.toCharArray();
				for(int i=0;i<valores.length;i++){
					for(int k=0;k<alea=nextInt(1000);k++){
						alea=nextInt(26);
						palabra=palabra+letras[k];
						if(i==alea){
							valores[i]=palabra;
						}
					}
					if(i==valores.length-1){
						for(int k=0;k<valores.length;k++){
							System.out.print(valores[k]);
						}
					System.out.println();
					}
				}
			}
		}
	}
}