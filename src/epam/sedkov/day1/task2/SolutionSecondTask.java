package epam.sedkov.day1.task2;

import java.time.LocalDate;
import java.util.Scanner;

/*
 * Classname            SolutionSecondTask
 *
 * Version information  0.1
 *
 * Date                 31.05.2020
 *
 * copyright ©
 */

public class SolutionSecondTask {

    private int year;
    private int month;
    private boolean leapYear;

    private void getYearAndMonthFromScanner() {
        Scanner scanner;
        while (true) {
            scanner = new Scanner(System.in);
            System.out.println("Insert an year: ");
            if (!scanner.hasNextInt()) {
                System.out.println("You don't insert an integer!");
            } else {
                year = scanner.nextInt();
                if (year < 0 || year > LocalDate.now().getYear()) {
                    System.out.println("You insert a wrong year!");
                } else {
                    break;
                }
            }
        }
        while (true) {
            scanner = new Scanner(System.in);
            System.out.println("Insert a month: ");
            if (!scanner.hasNextInt()) {
                System.out.println("You don't insert an integer!");
            } else {
                month = scanner.nextInt();
                if (month < 0 || month > 12) {
                    System.out.println("You insert a wrong month!");
                } else {
                    scanner.close();
                    break;
                }
            }
        }
    }

    private boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return true;
        }
    }

    private int getQuantityOfDaysInMonth(int month) {
        if ((month % 2 == 1 && month < 8) || (month % 2 == 0 && month >= 8)) {
            return 31;
        } else if (month == 2) {
            return (leapYear ? 29 : 28);
        } else {
            return 30;
        }
    }

    public void getSolution() {
        getYearAndMonthFromScanner();
        leapYear = isLeapYear(year);
        System.out.print("Quantity of days in month: " + getQuantityOfDaysInMonth(month) + " .\t");
        System.out.println(leapYear ? "Year is leap." : "Year is not leap.");
    }

}
