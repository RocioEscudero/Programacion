import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        boolean seguir=true;
        String continuar;
        double descuento;
        double precio=0;
        double precioTotal=0;

        do{
            System.out.println("Introduzca precio del artículo a comprar: ");
            num= sc.nextInt();

            if(num>=200){
                descuento=num*0.15;
                precio=num-descuento;
                System.out.println("Con el descuento del 15%");
                System.out.println("El precio del artículo con descuento es de: "+precio);
            } else if (num>100) {
                descuento=num*0.12;
                precio=num-descuento;
                System.out.println("Con el descuento del 12%");
                System.out.println("El precio del artículo con descuento es de: "+precio);

            } else {
                descuento=num*0.10;
                precio=num+descuento;
                System.out.println("Con el descuento del 10%");
                System.out.println("El precio del artículo con descuento es de: "+precio);
            }

            System.out.println("Quiere intorducir un artículo? (si o no): ");
            continuar= sc.next();

            if(continuar .equals("no")){
                seguir=false;
            }

            precioTotal=precioTotal+precio;

        }while (seguir);

        System.out.println("El precio total es de: "+precioTotal+"€");




    }
}
