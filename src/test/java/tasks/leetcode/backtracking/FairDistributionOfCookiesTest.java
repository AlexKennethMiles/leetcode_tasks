package tasks.leetcode.backtracking;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FairDistributionOfCookiesTest {
    private FairDistributionOfCookies alg = new FairDistributionOfCookies();

    @Test
    public void example1() {
        int[] cookies = {8, 15, 10, 20, 8};
        int k = 2;
        int rsl = alg.distributeCookies(cookies, k);
        int exp = 31;
        assertThat(rsl).isEqualTo(exp);
    }

    @Test
    public void example2() {
        int[] cookies = {6, 1, 3, 2, 2, 4, 1, 2};
        int k = 3;
        int rsl = alg.distributeCookies(cookies, k);
        int exp = 7;
        assertThat(rsl).isEqualTo(exp);
    }
}
