package tasks.leetcode.string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class LengthOfLastWordTest {
    @Test
    public void exampleOne() {
        String input = "Hello World";
        assertThat(LengthOfLastWord.lengthOfLastWord(input)).isEqualTo(5);
    }

    @Test
    public void exampleTwo() {
        String input = "   fly me   to   the moon  ";
        assertThat(LengthOfLastWord.lengthOfLastWord(input)).isEqualTo(4);
    }

    @Test
    public void exampleThree() {
        String input = "luffy is still joyboy";
        assertThat(LengthOfLastWord.lengthOfLastWord(input)).isEqualTo(6);
    }

    @Test
    public void exampleFiftyOne() {
        String input = "Today is a nice day";
        assertThat(LengthOfLastWord.lengthOfLastWord(input)).isEqualTo(3);
    }

}
