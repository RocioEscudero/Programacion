import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        System.out.println("Introduce el modelo deseado (A o B): ");
        String modelo= sc.next() .toUpperCase();
        System.out.println("Introduce el precio de la tela por metro: ");
        int precio= sc.nextInt();
        System.out.println("Introduce la talla deseada (30, 32 o 36): ");
        int talla= sc.nextInt();
        System.out.println("Introduce el número de pantalones deseados: ");
        int numero=sc.nextInt();
        sc.close();

        //precio= 1.80 o 1.50

        double tela;
        double precioTela;
        double precioCosto=0;
        double ganancia;

        if (modelo .equals("A")){
            tela=1.50*numero;
            precioTela=tela*precio;
            precioCosto=precioTela+(precioTela*0.80);
            if (talla == 32 || talla == 36) {
                precioCosto=precioCosto+(precioCosto*0.04);
                System.out.printf("El precio del coste de fabricación es de: %.2f€\n",precioCosto);
            }else{
                System.out.printf("El precio del coste de fabricación es de: %.2f€\n",precioCosto);
            }

        }
        if (modelo .equals ("B")){
            tela=1.80*numero;
            precioTela=tela*precio;
            precioCosto=precioTela+(precioTela*0.95);
            if (talla == 32 || talla == 36) {
                precioCosto=precioCosto+(precioCosto*0.04);
                System.out.printf("El precio del coste de fabricación es de: %.2f€\n",precioCosto);
            }else{
                System.out.printf("El precio del coste de fabricación es de: %.2f€\n",precioCosto);
            }
        }

        ganancia=precioCosto*0.30;

        System.out.printf("La ganancia extra de la empresa es de: %.2f€\n",ganancia);
        System.out.printf("El precio final de venta es de: %.2f€\n",(precioCosto+ganancia));
    }
}
