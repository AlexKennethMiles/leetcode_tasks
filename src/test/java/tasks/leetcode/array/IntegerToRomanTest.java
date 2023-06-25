package tasks.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class IntegerToRomanTest {
    @Test
    public void example1() {
        int input = 3;
        String exp = "III";
        assertThat(IntegerToRoman.intToRoman(input)).isEqualTo(exp);
    }

    @Test
    public void example2() {
        int input = 58;
        String exp = "LVIII";
        assertThat(IntegerToRoman.intToRoman(input)).isEqualTo(exp);
    }

    @Test
    public void example3() {
        int input = 1994;
        String exp = "MCMXCIV";
        assertThat(IntegerToRoman.intToRoman(input)).isEqualTo(exp);
    }
}
