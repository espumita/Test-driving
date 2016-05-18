package romannumerals;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class _RomanNumeralGenerator {

    @Test
    public void generate_a_roman_numeral_for_a_given_decimal_number() throws Exception {
        RomanNumeralGenerator generator = new RomanNumeralGenerator();

        assertThat(generator.romanFor(1), is("I"));
        assertThat(generator.romanFor(2), is("II"));
        assertThat(generator.romanFor(3), is("III"));
        assertThat(generator.romanFor(4), is("IV"));
        assertThat(generator.romanFor(5), is("V"));
        assertThat(generator.romanFor(7), is("VII"));
        assertThat(generator.romanFor(9), is("IX"));
        assertThat(generator.romanFor(10), is("X"));
        assertThat(generator.romanFor(18), is("XVIII"));
        assertThat(generator.romanFor(30), is("XXX"));
        assertThat(generator.romanFor(2687), is("MMDCLXXXVII"));
        assertThat(generator.romanFor(3499), is("MMMCDXCIX"));

    }
}
