import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int alumnos;
        double costeA=0;
        double bus;

        do {
            System.out.print("Introduzca número de alumnos: ");
            alumnos= sc.nextInt();

        }while (alumnos<=0);

        if (alumnos>=100){
            costeA=costeA+65;
            bus=costeA*alumnos;

        } else if (50<=alumnos) {
            costeA=costeA+70;
            bus=costeA*alumnos;


        }else if (alumnos>=30) {
            costeA=costeA+95;
            bus=costeA*alumnos;


        }else {
            bus=3000;
            costeA=bus/alumnos;

        }
        System.out.println("El coste por alumno es de: "+costeA+"€");
        System.out.println("A pagar a la compañía de buses: "+bus+"€");

    }
}
