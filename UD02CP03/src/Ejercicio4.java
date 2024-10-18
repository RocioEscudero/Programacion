public class Ejercicio4 {
    public static void main(String[] args) {

        int max;
        int suma=0;

        for (max = 50; max >= 20; max= max-2) {
            suma=suma+max;
        }
        System.out.println("Resultado: "+suma);

    }
}
