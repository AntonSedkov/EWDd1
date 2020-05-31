package epam.sedkov.day1.task4;

/*
 * Classname            SolutionFourthTask
 *
 * Version information  0.1
 *
 * Date                 31.05.2020
 *
 * copyright ©
 */

import java.util.Scanner;

public class SolutionFourthTask {

    private boolean isTwoEven(int[] numbers) {
        int quantityOfEven = 0;
        for (int i = 0; quantityOfEven > 2 || i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                quantityOfEven++;
            }
        }
        return quantityOfEven == 2;
    }

    private int[] getNumbersFromScanner() {
        Scanner scanner;
        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            while (true) {
                scanner = new Scanner(System.in);
                System.out.println("Insert next number: ");
                if (!scanner.hasNextInt()) {
                    System.out.println("You don't insert an integer!");
                } else {
                    array[i] = scanner.nextInt();
                    break;
                }
            }
        }
        return array;
    }

    public void getSolutionWithScanner() {
        int[] numbers = getNumbersFromScanner();
        System.out.println(isTwoEven(numbers));
    }

    public void getSolutionWithoutScanner(int[] numbers) {
        System.out.println(isTwoEven(numbers));
    }

}
