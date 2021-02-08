import java.util.Scanner;
import java.util.Random;
public class EjercicioPiedraPapelTijeras {
    public static int puntuacionJugador=0;
    public static int puntuacionCpu=0;
    public static int empate;
    public static Scanner lector=new Scanner(System.in);
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        int opcion;
        char intro;
        do{
            System.out.println("==========================================");
            System.out.println("\tPIEDRA,  PAPEL O TIJERAS");
            System.out.println("==========================================");
            System.out.println("1. Nueva Parrtida...");
            System.out.println("2.Mostrar puntuacion...");
            System.out.println("------------------------------------------");
            System.out.println("0.Salir");
            System.out.print("Elige una opcion: ");
            opcion=lector.nextInt();
            while(opcion<0||opcion>2){
                System.out.print("Elige una opcion valida entre 0 y 2: ");
                opcion=lector.nextInt();
            }
            if(opcion==1){
                partida();
            }else if(opcion==2){
                puntuacion();
            }
        }
        while(opcion!=0);        
    }
    public static void partida(){
        Random alea=new Random();
        int opcion,jugador,cpu,resultado;
        System.out.print("***********\n*  ELIGE  *\n***********\n1. Piedra\n2. Papel\n3. Tijeras\nIndica tú elección: ");
        opcion=lector.nextInt();
        jugador=opcion;
        if(jugador==1){
            System.out.println("Jugador elige Piedra");
        }else if(jugador==2){
            System.out.println("Jugador elige Papel");
        }else{
            System.out.println("Jugador elige Tijeras");
        }
        cpu=alea.nextInt(3-0+1)+1;
        if(cpu==1){
            System.out.println("Jugador elige Piedra");
        }else if(cpu==2){
            System.out.println("Jugador elige Papel");
        }else{
            System.out.println("Jugador elige Tijeras");
        }
        if(cpu==jugador){
            System.out.println("Habeis Empatado");
            EjercicioPiedraPapelTijeras.empate++;
        }else{
            if(jugador>cpu&&cpu!=1){
                System.out.println("¡¡Has Ganado!!");
                EjercicioPiedraPapelTijeras.puntuacionJugador++;
            }else if(jugador>cpu&&cpu==1){
                System.out.println("Has Perdido");
                EjercicioPiedraPapelTijeras.puntuacionCpu++;;
            }else if(cpu>jugador&&jugador!=1){
                System.out.println("Has Perdido");
                EjercicioPiedraPapelTijeras.puntuacionCpu++;
            }else if(cpu>jugador&&jugador==1){
                System.out.println("¡¡Has Ganado!!");
                EjercicioPiedraPapelTijeras.puntuacionJugador++;
            }           
        }
        System.out.print("Pulsa INTRO para continuar...");
        intro=lector.next().charAt(0);
        while(opcion!='\n'){
            System.out.print("Pulsa INTRO para continuar...");
            opcion=lector.next().charAt(0);
        }
}
    public static void puntuacion(){
        System.out.printf("La puntuacion del jugador es: "+"%d\n"+"La puntuacion de la Cpu es: "+"%d\n"+"Y han habido "+"%d"+" empates\n",EjercicioPiedraPapelTijeras.puntuacionJugador,EjercicioPiedraPapelTijeras.puntuacionCpu,EjercicioPiedraPapelTijeras.empate);
    }
}