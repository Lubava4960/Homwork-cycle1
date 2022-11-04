public class Main {

    public static void main(String[] args) {
        for (int n = 0; n <=10; n++) {
            System.out.println("Итерация цикла " + n);
        }
        //Задание 2
        for (int t =10; t>=1; t--) {
            System.out.println("Итерация цикла 2 " + t);


        }
        //Задание 3.
        for (int i =0; i<17; i+=2){
            System.out.println("Итерация цикла 3 " +i);
        }
        //Задание 4.
        for(int i=1904; i<2096; i=i+4){

            System.out.println("високосный год " + i);
        }
        //Задача 5.
        for(int i=7; i<=63; i=i+7){
            System.out.println("Задача 5 " +i);
        }
        //Задача 6.
        for(int i=2; i<=512; i=i*2){
            System.out.println("Задача 6 " +i);
        }
        // Задача 7.
        int contribution=29000;
        int total=0;
        for (int i=1; i<=12; i++) {
            total =total+contribution;
            System.out.println( " месяц " +i+ ", сумма накоплений равна " + total+ "рублей ");
        }
        //Задача 8.

        int contributionM=29000;
        int totalM = 0;

        for (int i=1; i<=12; i++) {
            totalM =totalM+contributionM/100;
            totalM=totalM+contributionM;
            System.out.println("месяц " +i+ " сумма накоплений равна " + totalM+ "рублей ");
        }


    }
}
