package by.epam.sedkov.day1.entity;

public class PastTime {

    private int pastHours;
    private int pastMinutes;
    private int pastSeconds;

    public PastTime() {
    }

    public PastTime(int pastHours, int pastMinutes, int pastSeconds) {
        this.pastHours = pastHours;
        this.pastMinutes = pastMinutes;
        this.pastSeconds = pastSeconds;
    }

    public int getPastHours() {
        return pastHours;
    }

    public void setPastHours(int pastHours) {
        this.pastHours = pastHours;
    }

    public int getPastMinutes() {
        return pastMinutes;
    }

    public void setPastMinutes(int pastMinutes) {
        this.pastMinutes = pastMinutes;
    }

    public int getPastSeconds() {
        return pastSeconds;
    }

    public void setPastSeconds(int pastSeconds) {
        this.pastSeconds = pastSeconds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        PastTime that = (PastTime) o;
        if (this.pastHours != that.pastHours) {
            return false;
        }
        if (this.pastMinutes != that.pastMinutes) {
            return false;
        }
        return this.pastSeconds == that.pastSeconds;
    }

    @Override
    public int hashCode() {
        int result = pastHours;
        result = 31 * result + pastMinutes;
        result = 31 * result + pastSeconds;
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PassedTime: [");
        sb.append("hours = ").append(pastHours);
        sb.append(", minutes = ").append(pastMinutes);
        sb.append(", seconds = ").append(pastSeconds);
        sb.append("]");
        return sb.toString();
    }

}
