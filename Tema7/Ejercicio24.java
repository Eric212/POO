import java.util.Random;
public class Ejercicio24 {
    public static void main(String[] args) {
        Random alea=new Random();
        int[] v=new int[50];
        for(int i=0;i<v.length;i++){
            v[i]=alea.nextInt(20-0+1);
        }
    }
    static void encadenado(int[] v){
        int[] p=new int[v.length];
        for(int i=0;i<p.length;i++){
            p[i]=v[i];
        }
    }
}
