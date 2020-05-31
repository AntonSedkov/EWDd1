package epam.sedkov.day1.task5;

/*
 * Classname            SolutionFifthTask
 *
 * Version information  0.1
 *
 * Date                 31.05.2020
 *
 * copyright ©
 */

public class SolutionFifthTask {

    // perfect number is a positive integer that is equal to the sum of its positive divisors, excluding the number itself
    private boolean isPerfectNumber(int number) {
        int sumOfDivisors = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sumOfDivisors +=i;
            }
        }
        return number == sumOfDivisors;
    }

    public void getSolution(int number) {
        System.out.println(isPerfectNumber(number));
    }

}
