public class Main {
    public static void main(String[] args) {

        System.out.println("task1");
        int deposit = 0;
        int salary = 15000;
        int mounth = 0;
        while (deposit <= 2_459_000){
            deposit = deposit + salary;
            mounth++;
            System.out.println("Месяц " + mounth + ", сумма накоплений равна " + deposit + " рублей");
        }
        System.out.println();

        System.out.println("task2");
        int i = 1;
        while (i <= 10){
            System.out.print (i+ "\t");
            i++;
}
        System.out.println();
        for (i=10; i >= 1; i--) {
            System.out.print (i+ "\t");
        }
        System.out.println("\n");

        System.out.println("task3");
        int population = 12_000_000;
        int birthRate;
        int deathRate;
        int year;
        for(year = 1; year <= 10; year++){
            birthRate = population * 17/1000;
            deathRate = population * 8/1000;
            population = population +  birthRate - deathRate;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
        System.out.println();

        System.out.println("task4");
        int cash = 15000;           //использовал int для округления денег до целых значений
        int numberMounth = 0;
        for (numberMounth = 1; cash <= 12_000_000; numberMounth++){
            cash = cash + cash/100*7/12;
            System.out.println("Месяц " + numberMounth + ", сумма накоплений равна " + cash + " рублей");
        }

        System.out.println();

        System.out.println("task5");
        int cash2 = 15000;           //использовал int для округления денег до целых значений
        int numberMounth2 = 0;
        for (numberMounth2 = 1; cash2 <= 12_000_000; numberMounth2++) {
            cash2 = cash2 + cash2 / 100 * 7 / 12;   //  /100*7/12 - процент в месяц
            if (numberMounth2 % 6 == 0) {
                System.out.println("Месяц " + numberMounth2 + ", сумма накоплений равна " + cash2 + " рублей");
            }
        }

        System.out.println();

        System.out.println("task6");
        int mounthTask6;
        int summ = 15000;
        for (mounthTask6 = 1; mounthTask6 <= 12*9; mounthTask6++){
            summ = summ + summ / 100 * 7 / 12;
            if (mounthTask6 % 6 == 0){
                System.out.println("Месяц " + mounthTask6 + ", сумма накоплений равна " + summ + " рублей");
            } else {
            System.out.println("Месяц " + mounthTask6);
            }
        }
        System.out.println();

        System.out.println("task7");
        int data = 4;
        while (data <= 31){
            System.out.println("Сегодня пятница, " + data + "-е число. Необходимо подготовить отчет");
            data += 7;
        }
        System.out.println();

        System.out.println("task8");
        int presentYear = 2024;
        int startYear = presentYear - 200;
        int endYear = presentYear + 100;
        int countYear;
        for (countYear = 0; countYear <= endYear; countYear += 79) {
            if (countYear >= startYear){
                System.out.println(countYear);
            }
        }
    }
}