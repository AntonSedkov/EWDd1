package epam.sedkov.day1.task8;

/*
 * Classname            SolutionEighthTask
 *
 * Version information  0.1
 *
 * Date                 31.05.2020
 *
 * copyright ©
 */

public class SolutionEighthTask {

    private double countFirstExpression(double number) {
        double result = -Math.pow(number, 2) + 3 * number + 9;
        return result;
    }

    private double countSecondExpression(double number) {
        if ((Math.pow(number, 3) - 6) != 0) {
            double result = 1 / (Math.pow(number, 3) - 6);
            return result;
        } else {
            throw new ArithmeticException("Division by zero");
        }
    }

    public void getSolution(double number) {
        if (number >= 3) {
            System.out.println("Result: " + countFirstExpression(number));
        } else {
            System.out.println("Result: " + countSecondExpression(number));
        }
    }

}
