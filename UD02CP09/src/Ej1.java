import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        System.out.println("Introduce número de filas: ");
        int filas= sc.nextInt();

        for (int i = 1; i <= filas; i++) {
            System.out.println();
            for (int j = 1; j <= filas ; j++) {
              if (i==1 || i==filas){
                  System.out.print("* ");
              }
              else{
                  if(j==1 || j==filas){
                      System.out.print("* ");
                  }
                  else{
                      System.out.print("  ");
                  }
              }

            }

        }


    }
}
