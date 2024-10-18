import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        System.out.println("Introduzca número a convertir: ");
        int num= sc.nextInt();
        int modulo;
        int convertido=0;
        int contCero=0;

        System.out.println("Introduzca a qué quiere convertir el número: ");
        String conversor= sc.nextLine();

        switch (conversor){

            case "binario":
                while(num%2==0){
                    contCero++;
                    num=num/2;
                }

                while (num>0){
                    modulo=(num%2);
                    convertido=(convertido*10)+modulo;
                    num=num/2;

                }
                System.out.print("El número en binario es: "+convertido);

                for (int i = 0; i < contCero; i++) {
                    System.out.print("0");
                }

            case "octal":
                while(num%8==0){
                    contCero++;
                    num=num/2;
                }

                while (num>0){
                    modulo=(num%8);
                    convertido=(convertido*10)+modulo;
                    num=num/8;

                }
                System.out.print("El número en binario es: "+convertido);

                for (int i = 0; i < contCero; i++) {
                    System.out.print("0");
                }

            case "hexadecimal":
                while(num%16==0){
                    contCero++;
                    num=num/2;
                }

                while (num>0){
                    modulo=(num%16);
                    convertido=(convertido*10)+modulo;
                    num=num/16;

                }
                System.out.print("El número en binario es: "+convertido);

                for (int i = 0; i < contCero; i++) {
                    System.out.print("0");
                }
        }

    }
}
