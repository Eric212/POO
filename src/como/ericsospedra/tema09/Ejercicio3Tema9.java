package como.ericsospedra.tema09;
import java.util.InputMismatchException;
import java.lang.NumberFormatException;
import java.util.Scanner;
public class Ejercicio3Tema9 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        boolean control=true;
        int numeros;
        int masAlto=0;
        do {
            try {
                    System.out.print("Introduce un numero entero, cuando desee para el programa introduzca una letra\nNumero: ");
                    numeros = Integer.parseInt(lector.nextLine());
                    if(masAlto<numeros) {
                        masAlto = numeros;
                    }
            }catch(NumberFormatException exNFE){
               System.out.print("Debes introducir un numero entero, o una letra en caso de querer finalizar el programa\n"
                               +"Dale a enter para continuar...");
                System.out.print("\u001B[H\u001B[2J");
                lector.nextLine();
            }catch(InputMismatchException exIME){
                lector.nextLine();
                control=false;
                System.out.print("El numero mas alto es: "+masAlto+"\n");
            }
        }
        while(control);
    }
}
