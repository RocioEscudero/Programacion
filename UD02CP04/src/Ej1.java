import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        System.out.println("Introduzca primer número: ");
        int n1= sc.nextInt();
        System.out.println("Introduzca segundo número: ");
        int n2= sc.nextInt();
        sc.close();

        if (n1==n2){
            System.out.println(n1+ " x "+n2+ " = "+ (n1*n2));
        } else if (n1>n2) {
            System.out.println(n1+ " - "+n2+ " = "+ (n1-n2));
        }else{
            System.out.println(n1+ " + "+n2+ " = "+ (n1+n2));
        }
    }
}
