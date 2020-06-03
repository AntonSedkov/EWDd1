package epam.sedkov.day1.service;

import epam.sedkov.day1.entity.CircleFigure;
import epam.sedkov.day1.entity.PointCoordinate;
import epam.sedkov.day1.exception.MyCheckedException;
import epam.sedkov.day1.validator.NumberValidator;
import epam.sedkov.day1.validator.PointValidator;

public class TrigonometricService {

    // S = 4* R^2  - Square of Described Square
    public double receiveRadiusOfInscribedCircle(double squareOfDescribedSquare) throws MyCheckedException {
        if (NumberValidator.isDoubleForTrigonometricFigures(squareOfDescribedSquare)) {
            return Math.sqrt(squareOfDescribedSquare / 4);
        } else {
            throw new MyCheckedException("Wrong input data: square must be bigger than 0.");
        }
    }

    // S = 2* R^2 - Square of Inscribed Square
    public double receiveSquareOfInscribedSquare(double radiusOfInscribedCircle) throws MyCheckedException {
        if (NumberValidator.isDoubleForTrigonometricFigures(radiusOfInscribedCircle)) {
            return (2 * Math.pow(radiusOfInscribedCircle, 2));
        } else {
            throw new MyCheckedException("Wrong input data: radius must be bigger than 0.");
        }
    }

    public double howManyTimesInscribedSmallerDescribed(double squareOfDescribedSquare) throws MyCheckedException {
        if (NumberValidator.isDoubleForTrigonometricFigures(squareOfDescribedSquare)) {
            double squareOfInscribedSquare = receiveSquareOfInscribedSquare(
                    receiveRadiusOfInscribedCircle(
                            squareOfDescribedSquare));
            return (squareOfDescribedSquare / squareOfInscribedSquare);
        } else {
            throw new MyCheckedException("Wrong input data: square must be bigger than 0.");
        }
    }

    public double countDistanceToPoint(PointCoordinate point) {
        return Math.hypot(point.getCoordinateX(), point.getCoordinateY());
    }

    public PointCoordinate receiveClosePoint(PointCoordinate pointA, PointCoordinate pointB) throws MyCheckedException {
        if (!PointValidator.isEqualCoordinates(pointA, pointB)) {
            return countDistanceToPoint(pointA) < countDistanceToPoint(pointB) ? pointA : pointB;
        } else {
            throw new MyCheckedException("Points have equal coordinates.");
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

    public CircleFigure countCircleLengthAndSquare(double radius) throws MyCheckedException {
        if (NumberValidator.isDoubleForTrigonometricFigures(radius)) {
            CircleFigure circle = new CircleFigure();
            circle.setRadius(radius);
            circle.setLength(countLengthCircle(radius));
            circle.setSquare(countSquanderCircle(radius));
            return circle;
        } else {
            throw new MyCheckedException("Radius must be more than 0.");
        }
    }

}
