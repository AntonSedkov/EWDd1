package epam.sedkov.day1.task6;

/*
 * Classname            SolutionSixthTask
 *
 * Version information  0.1
 *
 * Date                 31.05.2020
 *
 * copyright ©
 */

public class SolutionSixthTask {

    private int getHours(int seconds) {
        return seconds / 3600;                  //  Get integer hours by division 60 min *60 sec
    }

    private int getMinutes(int seconds) {
        return seconds % 3600 / 60;             // Get reminder after hours and then get integer minutes by division 60 sec
    }

    private int getSeconds(int seconds) {
        return seconds % 3600 % 60;             //Get reminder after hours and after minutes
    }

    public void getSolution(int seconds) {
        System.out.print(getHours(seconds) + " hours ");
        System.out.print(getMinutes(seconds) + " minutes ");
        System.out.println(getSeconds(seconds) + " seconds");
    }
}
