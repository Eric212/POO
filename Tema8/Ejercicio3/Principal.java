package Ejercicio3;
import java.util.GregorianCalendar;
import java.util.Scanner;
public class Principal {
    static Scanner lector=new Scanner(System.in);
    static Alumnos[] alumnos;
    static Alumnos alumnoPre=new Alumnos();
    static Alumnos alumno=new Alumnos(0,null, null, null, 0, null);
    static GregorianCalendar fechaNacimiento;
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        int opcion,tam,i=0,comprobante;
        String decision;
        String[] conversion;
        int[] fecha;
        System.out.print("Cuantos alumnos vamos a Administrar\nAlumnos: ");
        tam=lector.nextInt();
        lector.nextLine();
        Principal.alumnos=new Alumnos[tam];
        do{
            System.out.print("**GESTIÓN DE ALUMNOS**\n**********************\n\n1.Nuevo alumno ...\n2.Baja de alumno ...\n3.Consultas ...\n-----------------------------------\n0.Salir\nOpcion: ");
            opcion=lector.nextInt();
            while(opcion<0||opcion>3){
                System.out.print("Opcion incorrecta introduzca una opcion entre 1 y 3\nOpcion: ");
                opcion=lector.nextInt();
                lector.nextLine();
            }
            if(opcion==1){
                if(i<alumnos.length){
                    alumnos[i]=alumno;
                    System.out.print("------------Datos Alumno------------\nNia del alumno: ");
                    comprobante=lector.nextInt();
                    lector.nextLine();
                    while(alumnos[i].getNia()==comprobante){
                        System.out.print("Introduce un NIA valido, este ya pertenece a un alumno\nNIA: ");
                        alumnos[i].setNia(lector.nextInt());
                        lector.nextLine();
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
                    alumnos[i]=alumno;
                    System.out.print("\nGrupo al que pertenece el alumno: ");
                    alumnos[i].setGrupo(lector.nextLine().toUpperCase().trim());
                    System.out.print("\nTelefono del alumno: ");
                    alumnos[i].setTelefono(lector.nextInt());
                    lector.nextLine();
                    i++;
                }else{
                    System.out.println("No puedes introducir mas alumnos, tu lista solo dispone de espacio para "+alumnos.length+" Alumnos\nDesea hacer mas grande su lista de alumnos: SI/No");
                    

                }
            }else if(opcion==2){
                System.out.print("------------Baja Alumnos------------\nNia del alumno que se desea dar de baja: ");
                comprobante=lector.nextInt();
                lector.nextLine();
                for(int j=0;j<alumnos.length;j++){
                    if(alumnos[j].getNia()==comprobante){
                        System.out.print("Nia: "+alumnos[j].getNia()+"\nNombre: "+alumnos[j].getNombre()+"\nApellidos: "+alumnos[j].getApellidos()+"\nFecha de nacimiento: "+alumnos[j].getFechaNacimiento().getTime()+"\nGrupo: "+alumnos[j].getGrupo()+"\nTelefono: "+alumnos[j].getTelefono());
                        System.out.println();
                        System.out.print("Desea borrar este alumno: Si/No: ");
                        decision=lector.nextLine();
                        lector.nextLine();
                        while(!decision.equalsIgnoreCase("si")&&!decision.equalsIgnoreCase("no")){
                            decision=lector.nextLine();
                            lector.nextLine();
                            if(decision.equalsIgnoreCase("Si")){
                                alumnos[j]=null;
                            }
                        }
                        break;
                    }
                }
            }else if(opcion==3){
                System.out.print("**********************\n****CONSULTAS****\n**********************\n1.Por grupo ...\n2.Por edad ...\n3.Por nia ...\nPor apellidos\n-----------------------------------\n0.Volver al menu principal\nOpcion: ");
                opcion=lector.nextInt();
                lector.nextLine();
                if(opcion==1){
                    System.out.print("Eliga el grupo que desee mostrar\nGrupo: ");
                    decision=lector.nextLine().trim();
                    System.out.printf("%9s"+"%15s"+"%20s"+"%30s"+"%15s"+"%20s\n","NIA","Nombre","Apellidos","Fecha de nacimiento","Grupo","Teléfono");
                    System.out.println("---------------------------------------------------------------------------------------------------------------");
                    for(int j=0;j<alumnos.length;j++){
                        if(alumnos[j].getGrupo().equalsIgnoreCase(decision)){
                            System.out.printf("%10d"+"%13s"+"%24s"+"%21tD"+"%21s"+"%21d\n",alumnos[j].getNia(),alumnos[j].getNombre(),alumnos[j].getApellidos(),alumnos[j].getFechaNacimiento().getTime(),alumnos[j].getGrupo(),alumnos[j].getTelefono());
                            System.out.println();
                        }
                    }
                }
            }
        }
        while(opcion!=0);
    }
}