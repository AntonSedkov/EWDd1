package epam.sedkov.day1.entity;

public class PassedTime {

    public static final int SECONDS_IN_DAY = 86400;
    public static final int SECONDS_IN_HOUR = 3600;
    public static final int SECONDS_IN_MINUTE = 60;

    private int passedHours;
    private int passedMinutes;
    private int passedSeconds;

    public PassedTime() {
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
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PassedTime that = (PassedTime) o;

        if (passedHours != that.passedHours) return false;
        if (passedMinutes != that.passedMinutes) return false;
        return passedSeconds == that.passedSeconds;
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
        return "PassedTime{" +
                "passedHours=" + passedHours +
                ", passedMinutes=" + passedMinutes +
                ", passedSeconds=" + passedSeconds +
                '}';
    }
}
