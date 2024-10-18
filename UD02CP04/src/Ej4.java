import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        int n;
        double suma=0;

        int cont5;
        int division=0;

        int base;
        int multiplicacion=3;

        System.out.println("Introduce un valor: ");
        int valor1=sc.nextInt();
        System.out.println("Introduce otro valor: ");
        int valor2=sc.nextInt();

        if (valor1>valor2){
            for (n=100; n<=1000; n++){
                if ((n*(n+1)/5)%5==0){
                    suma=suma+n;
                    System.out.println(n);
                }
            }System.out.println("Respuesta: "+suma);

        }else if (valor1==valor2){
            for (cont5=1; cont5<=45; cont5=cont5+4){
                division=(cont5/valor1);
                suma=division+suma;
            }System.out.println("Respuesta: "+suma);

        }else {
            for(base=2; base<=20; base=base+2){

                suma = suma + ((valor2 - valor1) * (Math.pow(base, multiplicacion)));
                multiplicacion=multiplicacion+3;

            } System.out.println(suma);
        }

        }

    }

