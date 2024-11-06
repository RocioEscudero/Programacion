import java.util.Scanner;

public class sumaHastaN {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        int n = sc.nextInt();

        int suma=0;

        for (int i = 0; i <= n; i++) {

            suma += i;

        }

        System.out.println("La suma de los números del 1 al "+n+" es: "+suma);
    }
}
