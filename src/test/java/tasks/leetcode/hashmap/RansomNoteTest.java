package tasks.leetcode.hashmap;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class RansomNoteTest {
    @Test
    public void example1() {
        String ransomNote = "a";
        String magazine = "b";
        boolean rsl = RansomNote.canConstruct(ransomNote, magazine);
        assertThat(rsl).isFalse();
    }

    @Test
    public void example2() {
        String ransomNote = "aa";
        String magazine = "ab";
        boolean rsl = RansomNote.canConstruct(ransomNote, magazine);
        assertThat(rsl).isFalse();
    }

    @Test
    public void example3() {
        String ransomNote = "aa";
        String magazine = "aab";
        boolean rsl = RansomNote.canConstruct(ransomNote, magazine);
        assertThat(rsl).isTrue();
    }
}
