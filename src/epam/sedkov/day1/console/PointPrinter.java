package epam.sedkov.day1.console;

import epam.sedkov.day1.entity.PointCoordinate;

public class PointPrinter {
    public void pointPrinter(PointCoordinate closePoint) {
        System.out.printf("%s: x:%.2f y:%.2f is closer to coordinate origin.%n",
                closePoint.getPointName(), closePoint.getCoordinateX(), closePoint.getCoordinateY());
    }
}
