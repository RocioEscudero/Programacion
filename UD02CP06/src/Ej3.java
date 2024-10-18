import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Introduzca el número de lados: ");
        int lados=sc.nextInt();
        int cont;

        System.out.println("");

        for (int i = 1; i <=lados ; i++) {

            for(cont=1; cont<=i; cont++){
                System.out.print("\u001B[35m*\u001B[0m");
            }
            System.out.println("");

        }
    }
}
