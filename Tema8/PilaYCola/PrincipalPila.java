package Pila;
import java.util.Scanner;
public class Principal {
    public static void pila(){
        PilaLista pila = new PilaLista();
        pila.insertar(1);
        pila.insertar(2);
        pila.insertar(3);
        pila.insertar(4);
        pila.insertar(5);
        pila.insertar(6);
        print(""+pila.quitar());
        print(""+pila.quitar());
        print(""+pila.quitar());
        print(""+pila.quitar());
        print(""+pila.quitar());
        print(""+pila.quitar());

    }
    public static void main(String[] args){
        pila();

    }
    public static void print(String numero){
        System.out.print(numero);
    }
}
