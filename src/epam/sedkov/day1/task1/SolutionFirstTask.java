package epam.sedkov.day1.task1;

/*
 * Classname            SolutionFirstTask
 *
 * Version information  0.1
 *
 * Date                 31.05.2020
 *
 * copyright ©
 */

import java.util.Scanner;

public class SolutionFirstTask {

    private int getNumberFromScanner() {
        Scanner scanner;
        while (true) {
            scanner = new Scanner(System.in);
            System.out.println("Insert an integer: ");
            if (!scanner.hasNextInt()) {
                System.out.println("You don't insert an integer!");
            } else {
                int scanNumber = scanner.nextInt();
                scanner.close();
                return scanNumber;
            }
        }
    }

    private int getLastDigit(int number) {
        return number % 10;
    }

    private void getLastSquaredDigit(int digit) {
        switch (digit) {
            case 1:
            case 9:
                System.out.println("The last squared digit is " + 1);
                break;
            case 2:
            case 8:
                System.out.println("The last squared digit is " + 4);
                break;
            case 3:
            case 7:
                System.out.println("The last squared digit is " + 9);
                break;
            case 4:
            case 6:
                System.out.println("The last squared digit is " + 6);
                break;
            case 5:
                System.out.println("The last squared digit is " + 5);
                break;
            case 0:
                System.out.println("The last squared digit is " + 0);
                break;
            default:
                System.out.println("Wrong insertion digit");
        }
    }

    public void getSolution() {
        getLastSquaredDigit(getLastDigit(getNumberFromScanner()));
    }

}
