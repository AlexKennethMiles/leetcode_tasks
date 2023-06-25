package tasks.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class IntegerToEnglishWordsTest {
    private final IntegerToEnglishWords alg = new IntegerToEnglishWords();

    @Test
    public void example1() {
        int input = 123;
        String exp = "One Hundred Twenty Three";
        assertThat(alg.numberToWords(input)).isEqualTo(exp);
    }

    @Test
    public void example2() {
        int input = 12345;
        String exp = "Twelve Thousand Three Hundred Forty Five";
        assertThat(alg.numberToWords(input)).isEqualTo(exp);
    }

    @Test
    public void example3() {
        int input = 1234567;
        String exp = "One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven";
        assertThat(alg.numberToWords(input)).isEqualTo(exp);
    }

    @Test
    public void case520() {
        int input = 20;
        String exp = "Twenty";
        assertThat(alg.numberToWords(input)).isEqualTo(exp);
    }

    @Test
    public void case580() {
        int input = 50868;
        String exp = "Fifty Thousand Eight Hundred Sixty Eight";
        assertThat(alg.numberToWords(input)).isEqualTo(exp);
    }
}
