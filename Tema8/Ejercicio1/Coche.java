package Ejercicio1;
public class Coche {
    private String modelo,color,matricula,tipoCoche,aFabricacion,modSeguro;
    private boolean metalizado;

    public Coche(){
        modelo="Focus";
        color="Negro";
        metalizado=true;
        matricula="DHJ3639";
        tipoCoche="Deportivo";
        aFabricacion="15/03/2005";
        modSeguro="Terceros";
    }
    public Coche(String modelo,String color,String matricula,String tipoCoche,String aFabricacion,String modSeguro,boolean metalizado){
        this.modelo=modelo;
        this.color=color;
        this.metalizado=metalizado;
        this.matricula=matricula;
        this.tipoCoche=tipoCoche;
        this.aFabricacion=aFabricacion;
        this.modSeguro=modSeguro;
    }
    public String setModelo(String modelo){
        return this.modelo=modelo;
    }
    public String getModelo(){
        return this.modelo;
    }
    public String setColor(String color){
        return this.color=color;
    }
    public String getColor(){
        return this.color;
    }
    public boolean setMetalizado(boolean metalizado){
        return this.metalizado=metalizado;
    }
    public boolean getMetalizadoo(){
        return metalizado;
    }
    public String setMatricula(String matricula){
        return this.matricula=matricula;
    }
    public String getMatricula(){
        return this.matricula;
    }
    public String setTipoCoche(String tipoCoche){
        return this.tipoCoche=tipoCoche;
    }
    public String getTipoCoche(){
        return this.tipoCoche;
    }
    public String setAFabricacion(String aFabricacion){
        return this.aFabricacion=aFabricacion;
    }
    public String getAFabricacion(){
        return this.aFabricacion;
    }
    public String setModSeguro(String modSeguro){
        return this.modSeguro=modSeguro;
    }
    public String getModSeguro(){
        return this.modSeguro;
    }
    public String imprimirCoche(){
        return "Modelo: "+this.modelo+"\nColor: "+this.color;
    }
}