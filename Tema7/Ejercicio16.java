import java.util.Random;
import java.util.Scanner;
public class Ejercicio16{
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		//System.out.println("Introduce el numero de notas que quieres sacar");
		int notas=30;	//lector.nextInt();
		double[] calificaciones=new double[notas];
		calificaciones=secuencia(notas);
		media(calificaciones);
	}
	static double[] secuencia(int notas){
		Random aleatorio=new Random();
		double[] calificaciones=new double[notas];
		double calificacion;
		for(int i=0;i<notas;i++){
			calificaciones[i]=calificacion=aleatorio.nextDouble()*10;
		}
		return calificaciones;
	}
	static void media(double calificaciones[]){
		double mediaMayoresCinco=0;
		double mediaTotal=0;
		int k=0;
		for(int i=0;i<calificaciones.length;i++){
			if(calificaciones[i]>5){
				mediaMayoresCinco+=calificaciones[i];
				k++;
			}
			mediaTotal=mediaTotal+calificaciones[i];
			if(i==calificaciones.length-1){
				mediaMayoresCinco=mediaMayoresCinco/k;
				mediaTotal=mediaTotal/calificaciones.length;
				System.out.printf("La media de las notas que superan el 5 es: "+"%.2f%n",mediaMayoresCinco);
				System.out.printf("La media total es:"+"%.2f%n",mediaTotal);
			}
		}
	}
}