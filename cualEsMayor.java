import java.util.Scanner;

public class cualEsMayor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cont=1;
        int mayor=0;


        do{
            cont++;

            System.out.println("Ingrese número: ");
            int num = sc.nextInt();

            if(num>mayor){
                mayor=num;
            }

        }while(cont<=5);

        System.out.println("El mayor es: "+mayor);


    }
}
