package tasks.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ZigzagConversionTest {
    @Test
    public void example1() {
        String inputStr = "PAYPALISHIRING";
        int nuwRows = 3;
        String rsl = ZigzagConversion.convert(inputStr, nuwRows);
        String exp = "PAHNAPLSIIGYIR";
        assertThat(rsl).isEqualTo(exp);
    }

    @Test
    public void example2() {
        String inputStr = "PAYPALISHIRING";
        int nuwRows = 4;
        String rsl = ZigzagConversion.convert(inputStr, nuwRows);
        String exp = "PINALSIGYAHRPI";
        assertThat(rsl).isEqualTo(exp);
    }

    @Test
    public void example3() {
        String inputStr = "A";
        int nuwRows = 1;
        String rsl = ZigzagConversion.convert(inputStr, nuwRows);
        String exp = "A";
        assertThat(rsl).isEqualTo(exp);
    }
}
