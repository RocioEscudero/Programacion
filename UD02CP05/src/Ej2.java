import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Introduzca un día de la semana: ");
        String dia= sc.nextLine();
        sc.close();

        switch (dia.toLowerCase()){
            case "lunes", "martes", "miércoles", "miercoles", "jueves", "viernes" -> System.out.println("Día laborable");

            case "sábado", "sabado", "domingo" -> System.out.println("Día no laborable");

            default -> System.out.println("No es un día válido.");

        }

    }
}
