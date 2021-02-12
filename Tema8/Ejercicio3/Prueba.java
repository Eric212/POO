package Ejercicio3;
import java.util.GregorianCalendar;
import java.util.Scanner;
public class Prueba {
    static Scanner lector=new Scanner(System.in);
    static Alumnos[] alumnos;
    static Alumnos alumnoPre=new Alumnos();
    static Alumnos alumno=new Alumnos(0,null, null, null, 0, null);
    static GregorianCalendar fechaNacimiento;
    public static void main(String[] args) {
        
    }
    public static void menu(){
        System.out.print("Cuantos alumnos vamos a Administrar\nAlumnos: ");
        tam=lector.nextInt();
        lector.nextLine();
        Principal.alumnos=new Alumnos[tam];
        System.out.print("**GESTIÓN DE ALUMNOS**\n**********************\n\n1.Nuevo alumno ...\n2.Baja de alumno ...\n3.Consultas ...\n-----------------------------------\n0.Salir\nOpcion: ");
            opcion=lector.nextInt();
            while(opcion<0||opcion>3){
                System.out.print("Opcion incorrecta introduzca una opcion entre 1 y 3\nOpcion: ");
                opcion=lector.nextInt();
                lector.nextLine();
            }
    } 
}
