package epam.sedkov.day1.console;

import epam.sedkov.day1.entity.CircleFigure;

public class TrigonometricPrinter {
    public void squarePrinter(String figureType, double square) {
        System.out.printf("Square of %s: %.4f.%n", figureType, square);
    }

    public void howManySmallerPrinter(double result, String firstObjectName, String relativeToObjectName) {
        System.out.printf("Square of %s in %.2f times smaller than square of %s.%n",
                firstObjectName, result, relativeToObjectName);
    }

    public void circlePrint(CircleFigure circle) {
        System.out.printf("Circle with radius=%.2f has length=%.4f and square=%.4f.%n",
                circle.getRadius(), circle.getLength(), circle.getSquare());
    }

}
