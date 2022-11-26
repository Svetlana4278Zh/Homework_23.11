public class Main {
    public static void main(String[] args) {
        //Задача 1.1
        System.out.println("Задача 1.1");
        int savingsInMonth = 15000;
        double totalWithPercent = 0;
        int month = 0;
        while (totalWithPercent<=2_459_000){
            month++;
            totalWithPercent += savingsInMonth;
            totalWithPercent = Math.ceil(totalWithPercent*101) / 100;
            System.out.println("Месяц "+month+", сумма накоплений равна "+totalWithPercent+" рублей");
        }
        //Задача 1.2
        System.out.println("\nЗадача 1.2");
        int number = 0;
        while (number<10){
            number++;
            System.out.print(number+" ");
        }
        System.out.println();
        for (;number>=1;number--){
            System.out.print(number+" ");
        }
        System.out.println();
        //Задача 1.3
        System.out.println("\nЗадача 1.3");
        int population = 12_000_000;
        int bornInYear = 17; // родилось за год на 1000 человек населения
        int diedInYear = 8; // умерло за год на 1000 человек населения
        for (int year = 1; year<=10; year ++){
            population+=population*(bornInYear-diedInYear)/1000;
            System.out.println("Год "+year+", численность населения составляет "+population);
        }
        //Задача 2.1
        System.out.println("\nЗадача 2.1");
        double savings = 15000;
        double percent = 7;
        int numberMonth = 0;
        while (savings<=12_000_000){
            numberMonth++;
            savings = Math.ceil(savings*(100+percent))/100;
            System.out.println("Месяц "+numberMonth+", сумма накоплений "+savings);
        }
    }
}