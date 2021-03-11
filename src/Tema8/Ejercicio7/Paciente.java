package Tema8.Ejercicio7;

import java.util.GregorianCalendar;
public class Paciente extends Persona {
    private GregorianCalendar fecha;
    private String sintomatologia;
    private float temperatura;
    private float tenSis;
    private float tenDias;
    private int pulsaciones;
    public Paciente(int sip,String nombre,char sexo,GregorianCalendar edad,GregorianCalendar fechaAlta,String sintomatologia,float temperatura,float tenSis,float tenDias,int pulsaciones){
        super(sip,nombre,sexo,edad);
        this.fecha=fechaAlta;
        this.sintomatologia=sintomatologia;
        this.temperatura=temperatura;
        this.tenSis=tenSis;
        this.tenDias=tenDias;
        this.pulsaciones=pulsaciones;

    }
    public GregorianCalendar getFecha() {
        return this.fecha;
    }
    public void setFecha(GregorianCalendar fecha) {
        this.fecha = fecha;
    }
    public String getSintomatologia() {
        return this.sintomatologia;
    }
    public void setSintomatologia(String sintomatologia) {
        this.sintomatologia = sintomatologia;
    }
    public float getTemperatura() {
        return this.temperatura;
    }
    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }
    public float getTenSis() {
        return this.tenSis;
    }
    public void setTenSis(float tenSis) {
        this.tenSis = tenSis;
    }
    public float getTenDias() {
        return this.tenDias;
    }
    public void setTenDias(float tenDias) {
        this.tenDias = tenDias;
    }
    public int getPulsaciones() {
        return this.pulsaciones;
    }
    public void setPulsaciones(int pulsaciones) {
        this.pulsaciones = pulsaciones;
    }
}
