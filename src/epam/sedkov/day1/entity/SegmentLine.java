package epam.sedkov.day1.entity;

public class SegmentLine {
    private double startSegment;
    private double endSegment;
    private double stepSegment;

    public SegmentLine() {
        this.startSegment = Math.round(Math.random() * 180);                                            // [0;179];
        this.endSegment = Math.round(Math.random() * 181 + 180);                                        // [180;360]
        this.stepSegment = Math.round(Math.random() * (this.endSegment - this.startSegment) / 2);       //  for 4 steps
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


}
