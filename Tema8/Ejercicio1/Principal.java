package Ejercicio1;
import java.util.Scanner;
public class Principal{
    static Scanner lector=new Scanner(System.in);
    static Coche coche1=new Coche();
    static Coche coche2;
    static Coche coche3;
    static Coche coche4;
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        int opcion;
        do{
            System.out.print("----------------------Diseñador de coches---------------------\n1:Coche de Ejemplo\n2:Crear Coche de Venta\n3:Crear coche de concesionario\nOpcion: ");
            opcion=lector.nextInt();
            lector.nextLine();
            if(opcion==1){
                System.out.print("Modelo "+coche1.getModelo()+"\n");
            }
        }
        
    }
}