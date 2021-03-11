package como.ericsospedra.tema9;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        boolean control=true;
        int cont=0;
        float[] numeros = new float[10];
        float masAlto=0;
        do {
            try {
                for (int i = 0; i < numeros.length; i++) {
                    System.out.print("Introduce un numero\nNumero: ");
                    numeros[i] = lector.nextInt();
                    if(masAlto<numeros[i]){
                        masAlto=numeros[i];
                    }
                }
                System.out.print("El numero mas alto es: "+masAlto+" han avido "+cont+" errores durante la ejecucion\n");
                control=false;
            }catch(InputMismatchException ex){
                lector.nextLine();
                cont++;
            }
        }
        while(control);
    }
}