package Ejercicio7;
import java.util.Random;
import java.util.Scanner;
public class PrincipalHospital {
    Random alea=new Random();
    static Scanner lector=new Scanner(System.in);
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