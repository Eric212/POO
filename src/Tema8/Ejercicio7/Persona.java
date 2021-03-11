package Ejercicio7;
import java.util.GregorianCalendar;
public class Persona {
    private int sip;
    private String nombre;
    private char sexo;
    private GregorianCalendar edad;
    public Persona(int sip,String nombre,char sexo,GregorianCalendar edad){
        this.sip=sip;
        this.nombre=nombre;
        this.sexo=sexo;
        this.edad=edad;
    }
    public int getSip(){
        return this.sip;
    }
    public void setSip(int sip){
        this.sip = sip;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public char getSexo(){
        return this.sexo;
    }
    public void setSexo(char sexo){
        this.sexo = sexo;
    }
    public GregorianCalendar getEdad(){
        return this.edad;
    }
    public void setEdad(GregorianCalendar edad){
        this.edad = edad;
    }
}
