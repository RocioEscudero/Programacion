import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        System.out.println("Ingrese su número de cita: ");
        int cita= sc.nextInt();
        int pagoInd= 0;
        int pagoTotal=0;

        switch (cita){
            case 1, 2, 3 -> pagoInd=150;
            case 4, 5 -> pagoInd=100;
            case 6, 7, 8 -> pagoInd=90;
            default -> {
                if (cita<1){
                    System.out.println("Número de citas no permitido");

                }else{
                    pagoInd=50;
                }
            }
        }

        if (cita>0){

        if (cita >=9 ){
            for (int i = cita; i >= 9 ; i--) {
                pagoTotal=pagoTotal+50;
                cita--;
            }
        }

        if (cita >=6 && cita <= 8) {
            for (int i = cita; i >= 6 ; i--) {
                pagoTotal=pagoTotal+90;
                cita--;
            }
        }
        if (cita >=4 && cita <= 5) {
            for (int i = cita; i >= 4 ; i--) {
                pagoTotal=pagoTotal+100;
                cita--;
            }
        }
        if (cita >=1 && cita <=3) {
            for (int i = cita; i >= 1 ; i--) {
                pagoTotal=pagoTotal+150;
                cita--;
            }
        }

        System.out.println("Su pago por esta cita es de: "+pagoInd+"€");
        System.out.println("Su pago total es de: "+pagoTotal+"€");
        }


    }
}
