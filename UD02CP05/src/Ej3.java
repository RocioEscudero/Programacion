import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        int cont=0;
        int num;
        int cuadrado;
        int cubo;

        for (cont=1; cont<=5; cont++){

            System.out.println("\u001B[31mIntroduzca un número: \u001B[0m");
            num= sc.nextInt();

            cuadrado=num*num;
            cubo=num*num*num;

            System.out.println("\u001B[36mEl cuadrado de "+num+" = "+cuadrado+"\u001B[0m");
            System.out.println("\u001B[33mEl cubo de "+num+" = "+cubo+"\u001B[0m");
        }


    }
}
