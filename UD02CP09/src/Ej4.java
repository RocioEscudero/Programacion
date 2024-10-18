import java.util.Random;
import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        Random r = new Random();

        System.out.println("Introduce número de intentos: ");
        int numInt= sc.nextInt();
        System.out.println("Introduce número máximo: ");
        int max= sc.nextInt();
        int clave=0;

        boolean condicion=true;

        int aleatorio = r.nextInt(max)+1;

        System.out.println("Empezamos!!");

        do{
            System.out.println("Introduce número: ");
            clave= sc.nextInt();

            if(clave<aleatorio){
                System.out.println("El número que buscamos es mayor");
            }
            else if (clave>aleatorio) {
                System.out.println("El número que buscamos es menor");
            }
            else{
                System.out.println("Has acertado!!");
                condicion=false;

            }
            numInt--;

        }while(condicion && numInt>0);
    }
}
