import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int num;
        int cont;
        int contPares=0;
        int contImpares=0;
        double impares=0;
        int sumaP=0;
        int sumaI=0;

        for (cont=1; cont<=10; cont++){
            System.out.println("Introduzca un número: ");
            num= sc.nextInt();

            if (num%2==0){
                sumaP=sumaP+num;
                contPares++;
            }
            else {
                sumaI=sumaI+num;
                contImpares++;
            }
        }
        impares= (double) sumaI/contImpares;

        System.out.println("Hay "+contPares+" números pares, los cuales suman: "+sumaP);

        if (impares>0){
        System.out.println("El promedio de los impares es: "+impares);
          }
        else{
            System.out.println("No se ha escrito ningún impar.");
        }
    }
}
