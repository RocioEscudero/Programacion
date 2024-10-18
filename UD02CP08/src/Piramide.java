import java.util.Scanner;

public class Piramide {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        System.out.println("Introduce altura del triángulo: ");
        int altura= sc.nextInt();

        for (int i = 0; i <=altura ; i++) {
            for (int j = 0; j <altura-i ; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }
            System.out.println();

        }

    }
}
