package epam.sedkov.day1.entity;

import java.util.StringJoiner;

public class SegmentLine {
    private double startSegment;
    private double endSegment;
    private double stepSegment;

    public SegmentLine() {
    }

    public SegmentLine(double startSegment, double endSegment, double stepSegment) {
        this.startSegment = startSegment;
        this.endSegment = endSegment;
        this.stepSegment = stepSegment;
    }

    public double getStartSegment() {
        return startSegment;
    }

    public void setStartSegment(double startSegment) {
        this.startSegment = startSegment;
    }

    public double getEndSegment() {
        return endSegment;
    }

    public void setEndSegment(double endSegment) {
        this.endSegment = endSegment;
    }

    public double getStepSegment() {
        return stepSegment;
    }

    public void setStepSegment(double stepSegment) {
        this.stepSegment = stepSegment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        SegmentLine that = (SegmentLine) o;
        if (Double.compare(this.startSegment, that.startSegment) != 0) {
            return false;
        }
        if (Double.compare(this.endSegment, that.endSegment) != 0) {
            return false;
        }
        return Double.compare(this.stepSegment, that.stepSegment) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(startSegment);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(endSegment);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(stepSegment);
        result = (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", SegmentLine.class.getSimpleName() + "[", "]")
                .add("startSegment = " + startSegment)
                .add("endSegment = " + endSegment)
                .add("step = " + stepSegment)
                .toString();
    }

}
