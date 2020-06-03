package epam.sedkov.day1.entity;

public class CircleFigure {
    private double radius;
    private double length;
    private double square;

    public CircleFigure() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CircleFigure that = (CircleFigure) o;

        if (Double.compare(that.radius, radius) != 0) return false;
        if (Double.compare(that.length, length) != 0) return false;
        return Double.compare(that.square, square) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(radius);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(length);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(square);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "CircleFigure{" +
                "radius=" + radius +
                ", length=" + length +
                ", square=" + square +
                '}';
    }
}
