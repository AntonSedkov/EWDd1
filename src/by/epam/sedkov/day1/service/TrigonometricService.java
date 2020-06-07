package by.epam.sedkov.day1.service;

import by.epam.sedkov.day1.entity.PointCoordinate;
import by.epam.sedkov.day1.validator.PointValidator;
import by.epam.sedkov.day1.entity.CircleFigure;
import by.epam.sedkov.day1.exception.CheckedException;

public class TrigonometricService {

    // S = 4* R^2  - Square of Described Square
    public double receiveRadiusOfInscribedCircle(double squareOfDescribedSquare) throws CheckedException {
        if (squareOfDescribedSquare > 0) {
            return Math.sqrt(squareOfDescribedSquare / 4);
        } else {
            throw new CheckedException("Wrong input data: square must be bigger than 0.");
        }
    }

    // S = 2* R^2 - Square of Inscribed Square
    public double receiveSquareOfInscribedSquare(double radiusOfInscribedCircle) throws CheckedException {
        if (radiusOfInscribedCircle > 0) {
            return (2 * Math.pow(radiusOfInscribedCircle, 2));
        } else {
            throw new CheckedException("Wrong input data: radius must be bigger than 0.");
        }
    }

    public double howManyTimesInscribedSmallerDescribed(double squareOfDescribedSquare) throws CheckedException {
        if (squareOfDescribedSquare > 0) {
            double squareOfInscribedSquare = receiveSquareOfInscribedSquare(
                    receiveRadiusOfInscribedCircle(
                            squareOfDescribedSquare));
            return (squareOfDescribedSquare / squareOfInscribedSquare);
        } else {
            throw new CheckedException("Wrong input data: square must be bigger than 0.");
        }
    }

    public double countDistanceToPoint(PointCoordinate point) {
        return Math.hypot(point.getCoordinateX(), point.getCoordinateY());
    }

    public PointCoordinate receiveClosePoint(PointCoordinate pointA, PointCoordinate pointB) throws CheckedException {
        if (!PointValidator.isEqualCoordinates(pointA, pointB)) {
            return countDistanceToPoint(pointA) < countDistanceToPoint(pointB) ? pointA : pointB;
        } else {
            throw new CheckedException("Points have equal coordinates.");
        }
    }

    // S= PI * R^2
    private double countSquanderCircle(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    // S= 2 * PI * R
    private double countLengthCircle(double radius) {
        return (2 * Math.PI * radius);
    }

    public CircleFigure countCircleLengthAndSquare(double radius) throws CheckedException {
        if (radius > 0) {
            CircleFigure circle = new CircleFigure();
            circle.setRadius(radius);
            circle.setLength(countLengthCircle(radius));
            circle.setSquare(countSquanderCircle(radius));
            return circle;
        } else {
            throw new CheckedException("Radius must be more than 0.");
        }
    }

}