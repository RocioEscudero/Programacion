import java.util.Scanner;

public class inverso {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        int n = sc.nextInt();
        int resto=0;
        int invertido=0;

        do{
            resto=n%10;
            invertido=invertido*10+resto;
            n=n/10;

        }while(n>0);

        System.out.println("El número invertido es: "+invertido);
    }
}
