package Cola;

import Pila.NodoPila;

public class Principal {
    public static void cola(){
        ColaLista cola = new ColaLista();
        cola.insertar(1);
        cola.insertar(2);
        cola.insertar(3);
        cola.insertar(4);
        cola.insertar(5);
        cola.insertar(6);
        print(""+cola.quitar());
        print(""+cola.quitar());
        print(""+cola.quitar());
        print(""+cola.quitar());
        print(""+cola.quitar());
        print(""+cola.quitar());


    }
    public static void main(String[] args){
        cola();

    }
    public static void print(String numero){
        System.out.print(numero);
    }
}
