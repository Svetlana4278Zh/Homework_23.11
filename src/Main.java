import java.time.LocalDate;

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

        //Задача 2.1 и 2.2
        System.out.println("\nЗадача 2.1 и 2.2");
        int savings = 15000;
        double percent = 0.07;
        int numberMonth = 0;
        while (savings<=12_000_000){
            numberMonth++;
            savings +=savings*percent;
            if (numberMonth%6 == 0|| savings>12_000_000) {
                System.out.println("Месяц " + numberMonth + ", сумма накоплений " + savings);
            }
        }

        //Задача 2.3
        System.out.println("\nЗадача 2.3");
        savings = 15000;
        numberMonth = 0;
        while (numberMonth<=12*9){
            numberMonth++;
            savings += savings*percent;
            if (numberMonth%6 == 0) {
                System.out.println("Месяц " + numberMonth + ", сумма накоплений " + savings);
            }
        }

        //Задача 2.4
        System.out.println("\nЗадача 2.4");
        int dateFriday = 4;
        while (dateFriday <= 31){
            System.out.println("Сегодня пятница, "+dateFriday+"-е число. Необходимо подготовить отчет.");
            dateFriday += 7;
        }

        //Задача 3.1
        System.out.println("\nЗадача 3.1");
        int cometPeriod = 79;
        int yearOfComet = 0;
        int nowYear = LocalDate.now().getYear();
        int start = nowYear - 200;
        int finish = nowYear + 100;
        do {
            if (yearOfComet >= start){
                System.out.println(yearOfComet);
            }
            yearOfComet += cometPeriod;
        } while (yearOfComet <= finish);

        //Задача 3.2
        System.out.println("\nЗадача 3.2");
        int multiplier = 2;
        for (int i=1; i<=10; i++){
            System.out.println(multiplier +" * "+ i +" = "+ multiplier*i);
        }
    }
}