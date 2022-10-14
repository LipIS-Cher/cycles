public class Main {
    public static void main(String[] args) {
        //razdel 1
        //zadanie 1
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }

        System.out.println(" ");
        //zadanie 2
        for (int i = 10; i >= 1; i--){
            System.out.println(i);
        }

        System.out.println(" ");
        //zadanie 3
        for (int i = 2; i <= 17; i = i + 2){
            System.out.println(i);
        }

        System.out.println(" ");
        //zadanie 4
        for (int i = 10; i >= -10; i--){
            System.out.println(i);
        }

        System.out.println(" ");

        //razdel 2
        //zadanie 1
        for (int i = 1904; i <= 2096; i = i + 4){
            System.out.println(i + " год является високосным");
        }

        System.out.println(" ");
        //zadanie 2
        for (int i = 7; i < 100; i = i + 7){
            System.out.println(i);
        }

        System.out.println(" ");
        //zadanie 3
        for (int i = 1; i < 1000; i = i * 2){
            System.out.println(i);
        }

        System.out.println(" ");

        //razdel 3
        //zadanie 1
        for (int i = 1; i <= 12; i++){
            System.out.println("Месяц " + i + " , сумма накоплений равна " + (i * 29000) + " рублей");
        }

        System.out.println(" ");
        //zadanie 2
        int money = 29000;
        int perCent = 0;
        for (int i = 1; i <= 12; i++){
            perCent = ((money / 1200) * 12) + money;
            System.out.println("Месяц " + i + " , сумма накоплений равна " + perCent + " рублей");
            money = perCent + 29000;
        }
    }
}