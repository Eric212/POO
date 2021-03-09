import java.util.Scanner;
import java.util.InputMismatchException;
public class Ejercicio1 {
    static Scanner lector=new Scanner(System.in);
    public static void main(String[] args) {
        int num=0;
        do{
            try{
                do{
                    System.out.print("Introduce numeros, cuando desee para introduzca un numero negativo\nNumero: ");
                    num=lector.nextInt();
                    lector.nextLine();
                    System.out.print("\u001B[H\u001B[2J");
                    System.out.print("Numero: "+num+"\n");
                }while(num>=0);
            }catch(InputMismatchException exaException){
                System.out.print("Introduce un numero");
                num=lector.nextInt();
                lector.nextLine();
            }
        }while(num>=0);
    }
}
