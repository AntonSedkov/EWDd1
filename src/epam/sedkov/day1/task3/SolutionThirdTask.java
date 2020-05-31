package epam.sedkov.day1.task3;

/*
 * Classname            SolutionThirdTask
 *
 * Version information  0.1
 *
 * Date                 31.05.2020
 *
 * copyright ©
 */

public class SolutionThirdTask {

    // S = 4* R^2  - Squander of Described Square
    private double getRadiusOfInscribedCircle(double squanderOfDescribedSquare) {
        return Math.sqrt(squanderOfDescribedSquare / 4);
    }

    // S = 2* R^2 - Squander of Inscribed Square
    private double getSquanderOfInscribedSquare(double radiusOfInscribedCircle) {
        return 2 * Math.pow(radiusOfInscribedCircle, 2);
    }

    private double howManyTimesDescribedBiggerInscribed(double squanderOfDescribedSquare, double squanderOfInscribedSquare) {
        return Math.round(squanderOfDescribedSquare / squanderOfInscribedSquare);
    }

    public void getSolution(double squanderOfDescribedSquare) {
        double radiusOfInscribedCircle = getRadiusOfInscribedCircle(squanderOfDescribedSquare);
        double squanderOfInscribedSquare = getSquanderOfInscribedSquare(radiusOfInscribedCircle);
        System.out.println("Squander of inscribed square: " + squanderOfInscribedSquare);
        System.out.println("Squander of inscribed square in " + howManyTimesDescribedBiggerInscribed(squanderOfDescribedSquare, squanderOfInscribedSquare)
                + " times smaller than squander of described square");
    }
}
