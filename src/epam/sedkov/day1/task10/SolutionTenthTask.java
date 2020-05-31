package epam.sedkov.day1.task10;

/*
 * Classname            SolutionTenthTask
 *
 * Version information  0.1
 *
 * Date                 31.05.2020
 *
 * copyright ©
 */

import java.util.Arrays;

public class SolutionTenthTask {

    int[] interval = new int[2];
    int step;

    private void generateIntervalData() {
        interval[0] = (int) (Math.random() * 180);                                          // [0;179]
        interval[1] = (int) (Math.random() * 181 + 180);                                    // [180;360]
        step = (int) (Math.random() * (interval[1] - interval[0]) / 2 + 1);
        System.out.println("Interval " + Arrays.toString(interval) + " , step " + step);
    }

    private double countFunction(int degrees) {
        double radians = degrees * Math.PI / 180;
        return Math.tan(radians);
    }

    public void getSolution() {
        generateIntervalData();
        System.out.println("Argument \t Function");
        for (int i = interval[0]; i <= interval[1]; i += step) {
            System.out.println(i + " degree \t" + countFunction(i));
        }
    }

}
