public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int targetTotal = 2_459_000;
        int saving = 15000;
        int total = 0;
        int months = 0;
        while (total < targetTotal) {
            total = total + saving;
            months++;
            System.out.println("Месяц " + months + " , сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int a = 0;
        while (a < 10) {
            a++;
            System.out.print(a + " ");
        }
        System.out.println();
        for (; a > 0; a--) {
            System.out.print(a + " ");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int yearsWatched = 10;
        int population = 12000;
        int deathRatePerThousand = 8;
        int birthRatePerThousand = 17;
        for (int years = 1; years <= yearsWatched; years++) {
            population = population - ((population / 1000) * deathRatePerThousand) + ((population / 1000) * birthRatePerThousand);
            System.out.println("Год " + years + " , численность населения составляет " + population);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        double totalTarget = 12_000_000;
        double total = 15_000;
        double interest = 0.07;
        double interestCoeff = 1 + interest;
        int months = 0;
        while (total < totalTarget) {
            total = total * interestCoeff;
            months++;
            System.out.printf("Месяц " + months + " накоплено %.2f", total);
            System.out.println();
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        double totalTarget = 12_000_000;
        double total = 15_000;
        double interest = 0.07;
        double interestCoeff = 1 + interest;
        int months = 0;
        while (total < totalTarget) {
            total = total * interestCoeff;
            months = months + 1;
            if (months % 6 == 0 || total >= totalTarget) {
                System.out.printf("Месяц " + months + " накоплено %.2f", total);
                System.out.println();
            }
        }
    }


    public static void task6() {
        System.out.println("Задача 6");
        double total = 15_000;
        double interest = 0.07;
        double interestCoeff = 1 + interest;
        int months = 0;
        int depositTermYears = 9;
        int depositTerm = depositTermYears * 12;
        while (months < depositTerm) {
            total = total * interestCoeff;
            months = months + 1;
            if (months % 6 == 0 || months == depositTerm) {
                System.out.printf("Месяц " + months + " накоплено %.2f", total);
                System.out.println();
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int fridayCount = 2;
        int monthLength = 31;
        while (fridayCount <= monthLength) {
            System.out.println("Сегодня пятница, " + fridayCount + "-е число, нужно сдать отчет");
            fridayCount += 7;
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int currentYear = 2023;
        int yearsBefore = 200;
        int yearsAfter = 100;
        int cometAppearsIn = 79;

        for (int i = 0; i < currentYear + yearsAfter; i += cometAppearsIn) {
            if (i > currentYear - yearsBefore) {
                System.out.println(i);
            }
        }
    }
}