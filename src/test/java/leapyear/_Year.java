package leapyear;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class _Year {

    @Test
    public void should_not_be_a_leap_year_if_not_divisible_by_4() throws Exception {
        assertThat(leapYear(1197), is(false));
    }

    @Test
    public void should_be_a_leap_year_if_divisible_by_4() throws Exception {
        assertThat(leapYear(1196), is(true));
    }

    @Test
    public void should_be_a_leap_year_if_divisible_by_400() throws Exception {
        assertThat(leapYear(1600), is(true));
    }

    @Test
    public void should_not_be_a_leap_year_if_divisible_by_100_but_not_by_400() throws Exception {
        assertThat(leapYear(1800), is(false));
    }

    private boolean leapYear(int year) {
        return new Year(year).leapYear();
    }


}
