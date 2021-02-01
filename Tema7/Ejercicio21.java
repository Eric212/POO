import java.util.Scanner;
import java.util.Random;
public class Ejercicio21 {
    public static void main(String[] args){
		int[] numeros=menu();
    }
    public static int[] menu(){
		Scanner lector = new Scanner(System.in);
		Random alea = new Random();
		int opcion=5;
		int comodin=alea.nextInt(51);
		int[] numeros=new int[comodin];
		while(opcion!=0){
			boolean comprobante=false;
			System.out.print("MENÚ PRINCIPAL\n==============\n1.-Rellenar array.\n2.-Visualizar contenido del array\n3.-Visualizar contenido par.\n4.-Visualizar contenido múltiplo de 3\n0.-Salir del menú.\nSelecciona una opción: ");
			opcion=lector.nextInt();
			System.out.println();
			if(opcion==1&&comprobante==true){
				comprobante=false;
			}
			if(opcion==1&&comprobante==false){
				comodin=alea.nextInt(51);
				crearArray(numeros);
				comprobante=true;
				return numeros;
			}else if(opcion>1&&comprobante==true){
				control(opcion,numeros);
			}else if(opcion>1&&comprobante==false){
				System.out.println("La array no esta llena, primero rellene la array");
			}else{
				System.out.println("-------------FIN DEL PROGRAMA--------------");
			}
		}
		return numeros;
	}
    public static void control(int opcion,int[] numeros){
    	switch(opcion){
    		case 2:
    			visualizarArray(numeros);
    		break;
    		case 3:
    			visualizarParell(numeros);
    		break;
    		case 4:
    			visualizarMultiple3(numeros);
    		break;
    	}
    }
    public static void crearArray(int[] vector){//rellena el array con números aleatorios del 0 al 50.
    	Random alea = new Random();
    	int comodin=alea.nextInt(51);
    	for(int i=0;i<vector.length;i++){
	    	comodin=alea.nextInt();
	    	vector[i]=comodin;
		}
    }
	public static void visualizarArray(int[] vector){//visualiza todo el contenido del array.
		for(int i=0;i<vector.length;i++){
			System.out.print(vector[i]+"\t");
		}
		System.out.println();
	}
	public static void visualizarParell(int[] vector){//muestra la posición y el contenido de los elementos que tienen valor par.
		for(int i=0;i<vector.length;i=i+2){
			System.out.print("Posicion "+i+" "+vector[i]+"\t");
		}
		System.out.println();
	}
	public static void visualizarMultiple3(int[] vector){//muestra la posición y el contenido de los elementos que son múltiplo de 3.
		for(int i=0;i<vector.length;i++){
			if(vector[i]%3==0){
				System.out.print("Posicion "+i+" "+vector[i]+"\t");
			}
		}
		System.out.println();
	}
}
