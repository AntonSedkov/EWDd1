package by.epam.sedkov.day1.entity;

public class PassedTime {

    private int passedHours;
    private int passedMinutes;
    private int passedSeconds;

    public PassedTime() {
    }

    public PassedTime(int passedHours, int passedMinutes, int passedSeconds) {
        this.passedHours = passedHours;
        this.passedMinutes = passedMinutes;
        this.passedSeconds = passedSeconds;
    }

    public int getPassedHours() {
        return passedHours;
    }

    public void setPassedHours(int passedHours) {
        this.passedHours = passedHours;
    }

    public int getPassedMinutes() {
        return passedMinutes;
    }

    public void setPassedMinutes(int passedMinutes) {
        this.passedMinutes = passedMinutes;
    }

    public int getPassedSeconds() {
        return passedSeconds;
    }

    public void setPassedSeconds(int passedSeconds) {
        this.passedSeconds = passedSeconds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        PassedTime that = (PassedTime) o;
        if (this.passedHours != that.passedHours) {
            return false;
        }
        if (this.passedMinutes != that.passedMinutes) {
            return false;
        }
        return this.passedSeconds == that.passedSeconds;
    }

    @Override
    public int hashCode() {
        int result = passedHours;
        result = 31 * result + passedMinutes;
        result = 31 * result + passedSeconds;
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PassedTime: [");
        sb.append("hours = ").append(passedHours);
        sb.append(", minutes = ").append(passedMinutes);
        sb.append(", seconds = ").append(passedSeconds);
        sb.append("]");
        return sb.toString();
    }

}
