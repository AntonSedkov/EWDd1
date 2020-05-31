package epam.sedkov.day1.task9;

/*
 * Classname            SolutionNinthTask
 *
 * Version information  0.1
 *
 * Date                 31.05.2020
 *
 * copyright ©
 */

public class SolutionNinthTask {

    private double generateRadius() {
        return Math.random() * 100 + 1;
    }

    // S= PI * R^2
    private double countSquanderCircle(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    // S= 2 * PI * R
    private double countLengthCircle(double radius) {
        return 2 * Math.PI * radius;
    }

    public void getSolution() {
        double radius = generateRadius();
        System.out.println("Radius of circle is " + radius);
        System.out.println("Squander of circle is " + countSquanderCircle(radius));
        System.out.println("Length of circle is " + countLengthCircle(radius));
    }
}
