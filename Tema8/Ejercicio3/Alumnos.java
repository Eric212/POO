package Ejercicio3;
import java.util.GregorianCalendar;
public class Alumnos {
    private int nia;
    private int telefono;
    private String nombre;
    private String apellidos;
    private String grupo;
    private GregorianCalendar fechaNacimiento;
    public Alumnos(){
        this.nia=12345;
        this.nombre="Eric";
        this.apellidos="Sospedra Salort";
        this.fechaNacimiento=new GregorianCalendar(1996,03,15);
        this.telefono=644196907;
        this.grupo="1 DAW";
    }
    public Alumnos(int nia,String nombre,String primerApellido1,String segundoApellido,int telefono,String grupo){
        this.nia=nia;
        this.nombre=nombre;
        this.apellidos=primerApellido1+" "+segundoApellido;
        this.fechaNacimiento=new GregorianCalendar();
        this.telefono=telefono;
        this.grupo=grupo;
    }
    public int getNia() {
        return this.nia;
    }

    public void setNia(int nia) {
        this.nia = nia;
    }

    public int getTelefono() {
        return this.telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getGrupo() {
        return this.grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public GregorianCalendar getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(GregorianCalendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
