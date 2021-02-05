import java.util.Random;
import java.util.Scanner;
public class Ejercicio29{
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		Random alea = new Random();
		int alumnos;
		double[][] alumno=new double[alumnos][4];
		System.out.print("Introduce el numero de alumnos\nAlumnos: ");
		alumnos=lector.nextInt();
		System.out.println();
		for(int i=0;i<alumno.length;i++){
			for(int j=0;j<alumno[i].length;j++){
				alumno[i][j]=alea.nextDouble()*10;
				System.out.print(alumno[i][j]+"\t");
			}
			System.out.println();
		}
	}
}