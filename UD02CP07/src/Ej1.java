import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        System.out.println("Introduzca la altura del triángulo: ");
        int altura = sc.nextInt();
        sc.close();
        int cont;

        for (int fila = 1; fila <= altura; fila++) {

            //pintar espacios

            for (int i = 1; i <= (altura-fila) ; i++) {
                System.out.print(" ");
            }

            //pintar asteriscos

            for (cont=1; cont<=fila; cont++){
                System.out.print("* ");

            }
            System.out.println();
        }

    }
}
