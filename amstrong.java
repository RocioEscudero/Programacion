import java.util.Scanner;

public class amstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe un número: ");
        int n = sc.nextInt();
        sc.close();

        int inicial;
        int digito=0;
        double suma=0;
        int cont=0;

        inicial=n;

        do{
            digito=digito*10+(n%10);
            n=n/10;
            cont++;
        }while(n>0);

        n=inicial;

        do{
            digito=n%10;
            n=n/10;
            suma+=Math.pow(digito,cont);
        }while (n>0);


        if(suma==inicial){
            System.out.println("El número es Amstrong.");
        }
        else{
            System.out.println("El número no es Amstrong.");
        }

    }
}
