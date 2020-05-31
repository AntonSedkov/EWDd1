package epam.sedkov.day1.task7;

/*
 * Classname            SolutionSeventhTask
 *
 * Version information  0.1
 *
 * Date                 31.05.2020
 *
 * copyright ©
 */

import java.util.Arrays;

public class SolutionSeventhTask {

    private int[] pointA = new int[2];
    private int[] pointB = new int[2];

    private void getRandomPoints() {
        for (int i = 0; i < 2; i++) {
            pointA[i] = (int) (Math.random() * 100);
            pointB[i] = (int) (Math.random() * 75);
        }
    }

    // S= \|(y^2)+(x^2)
    private double countDistanceToPoint(int[] point) {
        return Math.sqrt(Math.pow(point[0], 2) + Math.pow(point[1], 2));
    }

    public void getSolution() {
        getRandomPoints();
        if (countDistanceToPoint(pointA) > countDistanceToPoint(pointB)) {
            System.out.println("Point B " + Arrays.toString(pointB) + " is nearer than Point A " + Arrays.toString(pointA));
        } else if (countDistanceToPoint(pointA) < countDistanceToPoint(pointB)) {
            System.out.println("Point A " + Arrays.toString(pointA) + " is nearer than Point B " + Arrays.toString(pointB));
        } else {
            System.out.println("Point B " + Arrays.toString(pointB) + " is equal Point A " + Arrays.toString(pointA));
        }
    }

}
