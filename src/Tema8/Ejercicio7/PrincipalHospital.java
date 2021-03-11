package Ejercicio7;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class PrincipalHospital {
    static Scanner lector=new Scanner(System.in);
    static Paciente[] baseDatos=new Paciente[1];
    static Paciente[] aux;
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
        System.out.print("Introduzca el nombre del paciente");
        
    }
}