package by.epam.sedkov.day1.validator;

import by.epam.sedkov.day1.entity.PointCoordinate;

public class PointValidator {

    public static boolean isEqualCoordinates(PointCoordinate pointA, PointCoordinate pointB) {
        return (pointA.getCoordinateX() == pointB.getCoordinateX() && pointA.getCoordinateY() == pointB.getCoordinateY());
    }
}
