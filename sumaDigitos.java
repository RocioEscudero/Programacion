import java.util.Scanner;

public class sumaDigitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int num = sc.nextInt();
        int digito;
        int suma=0;

        do{
            digito=num%10;
            suma=digito+suma;
            num=num/10;

        }while(num>0);

        System.out.println("La suma de los dígitos es: "+suma);

    }
}
