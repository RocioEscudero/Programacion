public class Ej3 {
    public static void main(String[] args) {

        int num;
        int mult7=0;
        int suma=0;

        for (num=20; num<=3500; num++){
            if ((num*(num+1)/2)%7==0){
                suma=suma+num;
                mult7++;
            }
        }
        System.out.println("Los múltiplos de 7 entre 20 y " +
                "3500 son: "+mult7+" y la suma de todos ellos es "+suma);
    }
}
