import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        System.out.println("Introduzca un valor A: ");
        int A= sc.nextInt();
        System.out.println("Introduzca un valor B: ");
        int B= sc.nextInt();
        sc.close();

        int C;

        C=A;
        A=B;
        B=C;

        System.out.println("\n\u001B[35mEl valor A = "+A+" y el valor B = "+B+"\u001B[0m");


    }
}
