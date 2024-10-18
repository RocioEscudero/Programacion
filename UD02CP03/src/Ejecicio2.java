import java.util.Scanner;

public class Ejecicio2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Introduzca el neto de su factura: ");
        double neto= sc.nextDouble();
        double iva= neto*0.21;
        sc.close();


        System.out.println("Su factura total con el 21% de I.V.A es: "+ iva+neto);
    }
}
