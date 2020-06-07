package by.epam.sedkov.day1.entity;

import java.util.StringJoiner;

public class PointCoordinate {

    private String pointName;
    private double coordinateX;
    private double coordinateY;

    public PointCoordinate() {
    }

    public PointCoordinate(String pointName, double coordinateX, double coordinateY) {
        this.pointName = pointName;
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public String getPointName() {
        return pointName;
    }

    public void setPointName(String pointName) {
        this.pointName = pointName;
    }

    public double getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(double coordinateX) {
        this.coordinateX = coordinateX;
    }

    public double getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(double coordinateY) {
        this.coordinateY = coordinateY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        PointCoordinate that = (PointCoordinate) o;
        if (Double.compare(this.coordinateX, that.coordinateX) != 0) {
            return false;
        }
        if (Double.compare(this.coordinateY, that.coordinateY) != 0) {
            return false;
        }
        return this.pointName.equals(that.pointName);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = pointName != null ? pointName.hashCode() : 0;
        temp = Double.doubleToLongBits(coordinateX);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(coordinateY);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", PointCoordinate.class.getSimpleName() + " [", "]")
                .add("point name = " + pointName)
                .add("coordinate X = " + coordinateX)
                .add("coordinate Y = " + coordinateY)
                .toString();
    }

}
