import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        System.out.println("Introduzca número de alumnos: ");
        int numA= sc.nextInt();
        int contA;
        double suma=0;

        for(contA=1; contA<=numA; contA++){
            System.out.println("Introduzca las notas: ");
            double nota= sc.nextDouble();

            suma=suma+nota;
        }
        sc.close();
        System.out.println("El promedio de calificaciones es: "+(suma/numA));

    }
}
