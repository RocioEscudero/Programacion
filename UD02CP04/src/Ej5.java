import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        int num;
        int mayor=0;

        do {
            System.out.println("Ingrese un número: ");
            num= sc.nextInt();

            if (num<0){
                System.out.println("los números negativos NO son válidos: ");

            }
            if (num>mayor){
                mayor=num;
            }

        } while (num!=0);
        sc.close();

        System.out.println("El mayor es: "+mayor);


    }
}
