package Ejercicio3;
import java.util.GregorianCalendar;
import java.util.Scanner;
public class Prueba{
    static int tam,opcion,i=0,comprobante,numAlum=0;
    static String decision;
    static Scanner lector=new Scanner(System.in);
    static Alumnos[] alumnos;
    static Alumnos[] auxiliar;
    static GregorianCalendar fechaNacimiento;
    public static void main(String[] args) {
        System.out.print("Cuantos alumnos vamos a Administrar\nAlumnos: ");
        tam=lector.nextInt();
        alumnos=new Alumnos[tam];
        lector.nextLine();
        menu();
    }
    public static void menu(){
        opcion=0;
        do{
            System.out.print("**********************\n**GESTIÓN DE ALUMNOS**\n**********************\n\n1.Nuevo alumno ...\n2.Baja de alumno ...\n3.Consultas ...\n-----------------------------------\n0.Salir\nOpcion: ");
            opcion=lector.nextInt();
            lector.nextLine();
            while(opcion<0||opcion>3){
                System.out.print("Opcion incorrecta introduzca una opcion entre 1 y 3\nOpcion: ");
                opcion=lector.nextInt();
                lector.nextLine();
            }
            if(opcion==0){
                System.out.println("------------------------------------------Fin de Programa------------------------------------------");
            }else{
                if(opcion==1){
                    crearAlumno();
                }else if(opcion==2){
                    bajaAlumno();
                }else{
                    visualizarAlumno();
                    opcion=5;
                }
            }
        }
        while(opcion!=0);
    }
    public static  void crearAlumno(){
        Alumnos alumno=new Alumnos(0,null, null, null, 0, null,0);
        comprobante=0;
        tam=0;
        for(int j=0;j<alumnos.length;j++){
            if(numAlum==i){
                break;
            }else if(alumnos[j]==null){
                alumnos[j]=alumnos[j+1];
                alumnos[j+1]=null;
            }else{
                numAlum++;
            }
        }
        String[] conversion;
        int[] fecha;
        if(i<alumnos.length){
            alumnos[i]=alumno;
            System.out.print("------------Datos Alumno------------\nNia del alumno: ");
            comprobante=lector.nextInt();
            lector.nextLine();
            for(int j=0;j<numAlum;j++){
                if(alumnos[j].getNia()==comprobante||alumnos[i].getNia()==alumnos[j].getNia()&&j!=i){
                    while(alumnos[j].getNia()==comprobante||alumnos[i].getNia()==alumnos[j].getNia()&&j!=i){
                        System.out.print("Introduce un NIA valido, este ya pertenece a un alumno\nNIA: ");
                        comprobante=lector.nextInt();
                        lector.nextLine();
                        alumnos[i].setNia(comprobante);
                    }
                }else if(tam+1==i){
                    break;
                }else{
                    tam++;
                }
            }
            alumnos[i].setNia(comprobante);
            System.out.print("\nNombre del alumno(Sin apellidos): ");
            alumnos[i].setNombre(lector.nextLine());
            System.out.print("\nApellidos del alumno: ");
            alumnos[i].setApellidos(lector.nextLine());
            System.out.print("\nFecha de nacimiento del alumno (dd/mm/yyyy): ");
            conversion=lector.nextLine().split("/");
            fecha=new int[conversion.length];
            for(int j=0;j<conversion.length;j++){
                fecha[j]=Integer.parseInt(conversion[j]);
            }
            fechaNacimiento=new GregorianCalendar(fecha[2],fecha[1]-1,fecha[0]);
            alumnos[i].setFechaNacimiento(fechaNacimiento);
            System.out.print("\nGrupo al que pertenece el alumno: ");
            alumnos[i].setGrupo(lector.nextLine().toUpperCase().trim());
            System.out.print("\nEdad del alumno: ");
            alumnos[i].setEdad(lector.nextInt());
            System.out.print("\nTelefono del alumno: ");
            alumnos[i].setTelefono(lector.nextInt());
            lector.nextLine();
            i++;
        }else{
            System.out.println("No puedes introducir mas alumnos, tu lista solo dispone de espacio para "+alumnos.length+" Alumnos\nDesea hacer mas grande su lista de alumnos: Si/No\nDecisión: ");
            auxiliar=new Alumnos[alumnos.length];
            if(lector.nextLine().equalsIgnoreCase("Si")){
                System.out.print("Cuantos alumnos quieres añadir\nAlumnos: ");
                tam=lector.nextInt();
                for(int j=0;j<alumnos.length;j++){
                    auxiliar[j]=alumnos[j];
                }
                alumnos=new Alumnos[auxiliar.length+tam];
                for(int j=0;j<auxiliar.length;j++){
                    alumnos[j]=auxiliar[j];
                }
            }
        }
    }
    public static void bajaAlumno(){
        comprobante=0;
        System.out.print("------------Baja Alumnos------------\nNia del alumno que se desea dar de baja: ");
        comprobante=lector.nextInt();
        lector.nextLine();
        for(int j=0;j<alumnos.length;j++){
            if(alumnos[j].getNia()==comprobante){
                System.out.print("Nia: "+alumnos[j].getNia()+"\nNombre: "+alumnos[j].getNombre()+"\nApellidos: "+alumnos[j].getApellidos()+"\nFecha de nacimiento: "+alumnos[j].getFechaNacimiento().getTime()+"\nGrupo: "+alumnos[j].getGrupo()+"\nTelefono: "+alumnos[j].getTelefono());
                System.out.println();
                System.out.print("Desea borrar este alumno: Si/No: ");
                decision=lector.nextLine();
                while(!decision.equalsIgnoreCase("si")&&!decision.equalsIgnoreCase("no")){
                    decision=lector.nextLine();
                    lector.nextLine();
                }
                if(decision.equalsIgnoreCase("Si")){
                    alumnos[j]=null;
                    i--;
                    break;
                }
            }
        }
    }
    public static void visualizarAlumno(){
 
        do{
            System.out.print("**********************\n****CONSULTAS****\n**********************\n1.Por grupo ...\n2.Por edad ...\n3.Por nia ...\nPor apellidos\n-----------------------------------\n0.Volver al menu principal\nOpcion: ");
            opcion=lector.nextInt();
            lector.nextLine();
            if(opcion==1){
                System.out.print("Eliga el grupo que desee mostrar\nGrupo: ");
                decision=lector.nextLine().trim();
                System.out.printf("%9s"+"%15s"+"%15s"+"%20s"+"%30s"+"%15s"+"%20s\n","NIA","Nombre","Apellidos","Fecha de nacimiento","Grupo","Teléfono","Edad");
                System.out.println("---------------------------------------------------------------------------------------------------------------------------");
                for(int j=0;j<alumnos.length;j++){
                    if(alumnos[j]==null){
                        break;
                    }
                    if(alumnos[j].getGrupo().equalsIgnoreCase(decision)){
                        System.out.printf("%10d"+"%13s"+"%24s"+"%21tD"+"%21s"+"%21d"+"%10d\n",alumnos[j].getNia(),alumnos[j].getNombre(),alumnos[j].getApellidos(),alumnos[j].getFechaNacimiento().getTime(),alumnos[j].getGrupo(),alumnos[j].getTelefono(),alumnos[j].getEdad());
                    }
                }
            }else if(opcion==2){
                System.out.print("Eliga la edad que desee mostrar\nEdad: ");
                comprobante=lector.nextInt();
                System.out.printf("%9s"+"%15s"+"%15s"+"%20s"+"%30s"+"%15s"+"%20s\n","NIA","Nombre","Apellidos","Fecha de nacimiento","Grupo","Teléfono","Edad");
                System.out.println("---------------------------------------------------------------------------------------------------------------");
                for(int j=0;j<alumnos.length;j++){
                    if(alumnos[j]==null){
                        break;
                    }
                    if(alumnos[j].getEdad()==comprobante){
                        System.out.printf("%10d"+"%13s"+"%24s"+"%21tD"+"%21s"+"%21d"+"%10d\n",alumnos[j].getNia(),alumnos[j].getNombre(),alumnos[j].getApellidos(),alumnos[j].getFechaNacimiento().getTime(),alumnos[j].getGrupo(),alumnos[j].getTelefono(),alumnos[j].getEdad());
                    }
                }
            }
        }
        while(opcion!=0);
    }
}