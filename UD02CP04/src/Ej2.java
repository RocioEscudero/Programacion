import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int cont;
        int contPares=0;
        int contImpares=0;
        int contNeg=0;
        int contPos=0;

        for(cont=1; cont<=10; cont++){

            System.out.println("Introduzca un número: ");
            int num= sc.nextInt();

            if (num%2==0){
                contPares++;

            } else {
                contImpares++;
            }
            if (num>0) {
                contPos++;

            }else {
                contNeg++;
            }
        }

        System.out.println("Tenemos "+contPares+" números pares, "+contImpares+
                " números impares, "+contPos+" números positivos y "+contNeg+
                " números negativos");
    }

}



