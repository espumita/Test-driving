package leapyear;

public class Year {

    private final int year;

    public Year(int year) {
        this.year = year;
    }

    public Boolean leapYear() {
        return divisibleBy(4) && !(divisibleBy(100) && notDivisibleBy(400));
    }

    private boolean notDivisibleBy(int number) {
        return year % number != 0;
    }

    private boolean divisibleBy(int number) {
        return year % number == 0;
    }
}
