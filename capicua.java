import java.util.Scanner;

public class capicua {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        int numInicial;
        int capicua=0;


        do{

            System.out.println("Ingrese un número: ");
            n = sc.nextInt();

        }while(n<9);

        numInicial=n;

        while(n>0){

            capicua=capicua*10+n%10;
            n=n/10;

        }

        if(capicua==numInicial){
            System.out.println("El número es capicúa.");
        }
        else{
            System.out.println("El número no es capicúa.");
        }



    }
}
