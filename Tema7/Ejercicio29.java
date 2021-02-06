import java.util.Random;
import java.util.Scanner;
public class Ejercicio29{
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		Random alea = new Random();
		int comp=-1;
		int alumnos;
		float media=0;
		System.out.print("Introduce el numero de alumnos\nAlumnos: ");
		alumnos=lector.nextInt();
		float[][] alumno=new float[alumnos+2][4];
		System.out.println();
		System.out.printf("%19s\t","Mod1");
		System.out.printf("%10s\t","Mod2");
		System.out.printf("%10s\t","Mod3");
		System.out.printf("%10s\n","Media");
		System.out.println("------------------------------------------------------------------");
		for(int i=0;i<alumno.length;i++){
			for(int j=0;j<alumno[i].length;j++){
				if(j==alumno[i].length-1){
					media/=alumno[i].length-1;
					alumno[i][j]=media;
					media=0;
				}else{
					alumno[i][j]=alea.nextFloat()*10;
					media+=alumno[i][j];	
				}
				if(comp!=i){
					if(i<9&&alumno.length>10){
						System.out.printf("Alumno 0"+(i+1)+"%10.2f\t",alumno[i][j]);
					}else if(i==alumno.length-2&&i>alumno.length-3){
						System.out.printf("Nota maxima "+(i+1)+"%10.2f\t",alumno[i][j]);
					}else if(i==alumno.length-1&&i>alumno.length-3){
						System.out.printf("Media Modulo "+(i+1)+"%10.2f\t",alumno[i][j]);
					}else{
						System.out.printf("Alumno "+(i+1)+"%10.2f\t",alumno[i][j]);
					}
				}else{
					System.out.printf("%10.2f\t",alumno[i][j]);
				}
				comp=i;
			}
			System.out.println();
		}
	}
	public static float mayor(float[][] alumno){
		float[][] reves=new float[alumno[0].length][alumno.length];
		float maximo=0;
		for(int i=0;i<reves.length;i++){
			for(int j=0;j<reves[i].length;j++){
				reves[i][j]=alumno[j][i];
			}
		}
		return maximo;
	}
}