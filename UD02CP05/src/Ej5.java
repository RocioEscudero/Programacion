import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        System.out.println("Ingrese número de niños: ");
        int ninos= sc.nextInt();
        System.out.println("Ingrese número de niñas");
        int ninas= sc.nextInt();
        sc.close();

        int total=ninos+ninas;
        double porNinos;
        double porNinas;

        porNinos= (double) ((ninos*100)/total);
        porNinas= (double) ((ninas*100)/total);

        System.out.println("\n\u001B[34mHay un porcentaje de niños del "+porNinos+"% " +
                "y un porcentaje de " +
                "niñas del "+porNinas+"%\u001B[0m");
    }
}
