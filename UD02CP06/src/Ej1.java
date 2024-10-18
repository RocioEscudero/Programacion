import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        int num;

        do{
        System.out.println("Introduzca número de valores a introducir (mayor que 0): ");
        num= sc.nextInt();
        } while(num<=0);

        int x;
        int valor;

        double compa=0;
        double pares=0;
        double media;

        System.out.println("Introduce un número: ");
        valor= sc.nextInt();
        int mayor=valor;
        int menor=valor;

        if (valor%2==0 && valor!=0){
            compa=valor+compa;
            pares++;
        }

        for (x=2; x<=num; x++){
            System.out.println("Introduce un número: ");
            valor= sc.nextInt();

            if (valor%2==0 && valor!=0){
                compa=valor+compa;
                pares++;
            }
            if (valor>mayor){
                mayor=valor;
            }
            else if (valor<menor){
                menor=valor;
            }

        }
        media=compa/pares;

        if(pares>0){
            System.out.println("La media de los pares es: "+media);
        }
        else{
            System.out.println("No hay números pares.");
        }
        System.out.println("El mayor es: "+mayor);
        System.out.println("El menor es: "+menor);

        sc.close();



    }
}
