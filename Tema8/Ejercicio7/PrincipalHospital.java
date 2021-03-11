package Ejercicio7;
import java.util.Scanner;
public class PrincipalHospital {
    static Scanner lector=new Scanner(System.in);
    static Paciente[] baseDatos=new Paciente[1];
    static Paciente[] aux;
    static Paciente paciente;
    static int i=0;
    public static void main(String[] args) {
        menu();
    }
    public static void menu() {
        System.out.print("********************\n**      URGENCIAS     **\n********************\n1. Nuevo paciente ...\n2. Atender paciente ...\n3. Consultas  ...\n4. Alta médica ...\n-----------------------------\n0. Salir\nOpcion: ");
        switch(lector.nextInt()){
            case 1:
                nuevoPaciente();
            break;
        }
    }
    public static void nuevoPaciente() {
        baseDatos[i]=paciente=new Paciente(0,"", ' ', null, null, null, 0f, 0f, 0f, 0);
        System.out.print("Introduzca el nombre del nuevo paciente");
        baseDatos[i].setNombre(lector.nextLine());
        while(comprobarNombre()){
            System.out.print("Este paciente ya existe, introduce un nuevo Paciente");
            baseDatos[i].setNombre(lector.nextLine());
        }
    }
}