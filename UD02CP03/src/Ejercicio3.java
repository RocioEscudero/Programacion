import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);

        System.out.print("\nIntroduzca su nombre: ");
        String nombre= sc.nextLine();
        System.out.print("Hola, "+nombre+", introduce tu Sueldo Base: ");
        double base= sc.nextDouble();

        sc.close();

        System.out.print("Tu sueldo líquido es: "+(base*0.80)+"€\n");
    }
}
