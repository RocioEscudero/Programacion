import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        System.out.println("Introduzca cantidad: ");
        int dinero=sc.nextInt();
        int contador=0;


        while (dinero>=500){
            contador++;
            dinero=dinero-500;
        }
        if (dinero>=200){
            contador++;
            dinero=dinero-200;

        }
        if (dinero>=100){
            contador++;
            dinero=dinero-100;
        }
        if (dinero>=50){
            contador++;
            dinero=dinero-50;
        }
        if (dinero>=20){
            contador++;
            dinero=dinero-20;

        }
        if (dinero>=10){
            contador++;
            dinero=dinero-10;

        }
        if (dinero>=2){
            contador++;
            dinero=dinero-2;

        }
        if (dinero>=1){
            contador++;
            dinero=dinero-1;
        }

    }
}
