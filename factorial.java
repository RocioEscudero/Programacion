import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un número entero: ");
        int n = sc.nextInt();
        int factorial=1;


        for (int i = 1; i <= n; i++) {

            factorial=factorial*i;

        }
        System.out.println("El factorial de"+n+" es: "+factorial);
    }
}
