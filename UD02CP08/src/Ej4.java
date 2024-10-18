import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int presupuesto;

        do{
            System.out.println("¿Cuánto dinero tienes?");
            presupuesto= sc.nextInt();
        }while (presupuesto<0);
        sc.close();

        if (presupuesto<=10){
            System.out.println("Puedes comprar una tarjeta regalo");
        }
        else if (presupuesto<=20){
            System.out.println("Puedes comprar una tarjeta regalo o bombones");
        }
        else if (presupuesto<=50){
            System.out.println("Puedes comprar una tarjeta regalo, bombones o flores");
        }
        else {
            System.out.println("Puedes comprar una tarjeta regalo, bombones o un anillo");
        }
    }
}
