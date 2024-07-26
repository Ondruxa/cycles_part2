public class Main {
    public static void main(String[] args) {

        System.out.println("task1");
        int deposit = 0;
        int salary = 15000;
        int mounth = 0;
        int hundredPercent = 100;
        while (deposit <= 2_459_000) {
            deposit = deposit + deposit / hundredPercent;
            deposit = deposit + salary;
            mounth++;
            System.out.println("Месяц " + mounth + ", сумма накоплений равна " + deposit + " рублей");
        }
        System.out.println();

        System.out.println("task2");
        int number = 1;
        while (number <= 10) {
            System.out.print(number + "\t");
            number++;
        }
        System.out.println();
        for (number = 10; number >= 1; number--) {
            System.out.print(number + "\t");
        }
        System.out.println("\n");

        System.out.println("task3");
        int population = 12_000_000;
        int birthRate;
        int deathRate;
        int year;
        for (year = 1; year <= 10; year++) {
            birthRate = population * 17 / 1000;
            deathRate = population * 8 / 1000;
            population = population + birthRate - deathRate;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
        System.out.println();

        System.out.println("task4");
        int cash = 15000;           //использовал int для округления денег до целых значений
        int numberMounth;
        int depositPercent = 7;
        int mounthInYear = 12;
        int percentTask4;
        for (numberMounth = 1; cash <= 12_000_000; numberMounth++) {
            percentTask4 = cash / hundredPercent * depositPercent / mounthInYear;
            cash = cash + percentTask4;
            System.out.println("Месяц " + numberMounth + ", сумма накоплений равна " + cash + " рублей");
        }

        System.out.println();

        System.out.println("task5");
        int cash2 = 15000;           //использовал int для округления денег до целых значений
        int numberMounth2;
        int finalCash = 12_000_000;
        int percentTask5;
        for (numberMounth2 = 1; cash2 <= finalCash; numberMounth2++) {
            percentTask5 = cash2 / hundredPercent * depositPercent / mounthInYear;
            cash2 = cash2 + percentTask5;   //  /100*7/12 - процент в месяц
            if (numberMounth2 % 6 == 0) {
                System.out.println("Месяц " + numberMounth2 + ", сумма накоплений равна " + cash2 + " рублей");
            }
        }

        System.out.println();

        System.out.println("task6");
        int mounthTask6;
        int depositTask6 = 15000;
        int percentTask6;
        for (mounthTask6 = 1; mounthTask6 <= 12 * 9; mounthTask6++) {
            percentTask6 = depositTask6 / hundredPercent * depositPercent / mounthInYear;
            depositTask6 = depositTask6 + percentTask6;
            if (mounthTask6 % 6 == 0) {
                System.out.println("Месяц " + mounthTask6 + ", сумма накоплений равна " + depositTask6 + " рублей");
            } else {
                System.out.println("Месяц " + mounthTask6);
            }
        }
        System.out.println();

        System.out.println("task7");
        int friday = 4;
        int daysInMounth = 31;
        int daysInWeek = 7;
        while (friday <= daysInMounth) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
            friday += daysInWeek;
        }
        System.out.println();

        System.out.println("task8");
        int presentYear = 2024;
        int numberForStart = 200;
        int startYear = presentYear - numberForStart;
        int numberFoeEnd = 100;
        int endYear = presentYear + numberFoeEnd;
        int iterationYear = 79;
        int countYear;
        for (countYear = 0; countYear <= endYear; countYear += iterationYear) {
            if (countYear >= startYear) {
                System.out.println(countYear);
            }
        }
    }

}