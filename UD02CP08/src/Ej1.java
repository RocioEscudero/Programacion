import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {

        Scanner sc=new Scanner (System.in);

        System.out.println("Introduce un número: ");
        int num= sc.nextInt();
        sc.close();

        int i=1;
        int cont=0;
        boolean primo = true;

        while(primo){

            if ((num%i)==0){
                cont++;
            }
            if (cont>=3){
                primo=false;
            }

            i++;

        }

        if (cont>2){
            System.out.println("No es primo");
        }
        else {
            System.out.println("Es primo");
        }

    }
}
