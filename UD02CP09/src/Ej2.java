import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String tipo;
        String turno;
        int horas;

        do{
        System.out.println("Introduce el tipo de día (festivo o laborable): ");
        tipo=sc.next().toLowerCase();
        }while(!(tipo .equals ("festivo") || tipo .equals ("laborable")));

        do{
            System.out.println("Introduce turno (diurno, nocturno): ");
            turno= sc.next();
        }while(!(turno .equalsIgnoreCase("diurno") || turno .equalsIgnoreCase ("nocturno") ));

        do{
            System.out.println("Introduce número de horas: ");
            horas= sc.nextInt();
        }while(horas<0 || horas>12);

        sc.close();

        double tarifaHoras=0;

        if(turno .equals("diurno")){
           tarifaHoras=horas*10;
           if(tipo .equals("festivo")){
               tarifaHoras=tarifaHoras*1.10;
           }
            System.out.printf("El pago correspondiente es de: %.2f€\n",tarifaHoras);
        }
        if(turno .equals("nocturno")){
            tarifaHoras=horas*13.5;
            if(tipo .equals("festivo")){
                tarifaHoras=tarifaHoras*1.15;
            }
            System.out.printf("El pago correspondiente es de: %.2f€\n",tarifaHoras);
        }





    }
}
