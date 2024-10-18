public class Ej4 {
    public static void main(String[] args) {


        for (int i = 0; i <=9 ; i++) {
            for(int cont=0; cont<=i; cont++){
                System.out.print("\u001B[34m"+cont+",\u001B[0m");
            }
            System.out.println("");

        }
    }
}
