import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Introduce tipo de hamburguesa: ");
        String tipo= sc.nextLine();
        System.out.println("Introduce número de hamburguesas: ");
        int num= Integer.parseInt(sc.nextLine());
        System.out.println("¿Efectivo o tarjeta?: ");
        String forma= sc.nextLine();
        sc.close();

        double total=0;

        switch (tipo.toLowerCase()){

            case "sencilla":
                total=(num*5);
                break;

            case "doble":
                total=(num*8);
                break;

            case "triple":
                total=(num*12);
                break;
        }

        switch (forma){

            case "efectivo":
                System.out.println("El precio total es de: "+total+"€");
                break;

            case "tarjeta":
                total=(total*1.05);
                System.out.println("El precio total es de: "+total+"€");
                break;
        }
    }
}
