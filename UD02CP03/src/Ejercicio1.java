import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Introduzca su año de nacimiento: ");
        int añoNac= sc.nextInt();
        System.out.println("Introduzca año actual: ");
        int añoAct= sc.nextInt();
        sc.close();

        System.out.println("Tu edad es: "+(añoAct-añoNac)+" años.");
    }
}
