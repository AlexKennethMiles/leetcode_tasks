package tasks.leetcode.string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class RomanToIntegerTest {
    @Test
    public void whenRomanIs3() {
        String input = "III";
        assertThat(RomanToInteger.replaceRomanToInt(input)).isEqualTo(3);
        assertThat(RomanToInteger.previousRomanToInt(input)).isEqualTo(3);
        assertThat(RomanToInteger.currMultiplyFourRomanToInt(input)).isEqualTo(3);
    }

    @Test
    public void whenRomanIs58() {
        String input = "LVIII";
        assertThat(RomanToInteger.replaceRomanToInt(input)).isEqualTo(58);
        assertThat(RomanToInteger.previousRomanToInt(input)).isEqualTo(58);
        assertThat(RomanToInteger.currMultiplyFourRomanToInt(input)).isEqualTo(58);
    }

    @Test
    public void whenRomanIs1994() {
        String input = "MCMXCIV";
        assertThat(RomanToInteger.replaceRomanToInt(input)).isEqualTo(1994);
        assertThat(RomanToInteger.previousRomanToInt(input)).isEqualTo(1994);
        assertThat(RomanToInteger.currMultiplyFourRomanToInt(input)).isEqualTo(1994);
    }
}
