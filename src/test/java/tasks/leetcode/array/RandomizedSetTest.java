package tasks.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class RandomizedSetTest {
    @Test
    public void leetCodeExample1() {
        RandomizedSet randomizedSet = new RandomizedSet();
        assertThat(randomizedSet.insert(1)).isTrue(); // Inserts 1 to the set. Returns true as 1 was inserted successfully.
        assertThat(randomizedSet.remove(2)).isFalse(); // Returns false as 2 does not exist in the set.
        assertThat(randomizedSet.insert(2)).isTrue(); // Inserts 2 to the set, returns true. Set now contains [1,2].
        int rand = randomizedSet.getRandom();
        boolean rslRand = rand == 1 || rand == 2;
        assertThat(rslRand).isTrue(); // getRandom() should return either 1 or 2 randomly.
        assertThat(randomizedSet.remove(1)).isTrue(); // Removes 1 from the set, returns true. Set now contains [2].
        assertThat(randomizedSet.insert(2)).isFalse(); // 2 was already in the set, so return false.
        assertThat(randomizedSet.getRandom()).isEqualTo(2); // Since 2 is the only number in the set, getRandom() will always return 2.
    }

    @Test
    public void leetCodeExample10() {
        RandomizedSet randomizedSet = new RandomizedSet();
        assertThat(randomizedSet.insert(0)).isTrue(); // Inserts 1 to the set. Returns true as 1 was inserted successfully.
        assertThat(randomizedSet.insert(1)).isTrue(); // Inserts 1 to the set. Returns true as 1 was inserted successfully.
        assertThat(randomizedSet.remove(0)).isTrue(); // Returns false as 2 does not exist in the set.
        assertThat(randomizedSet.insert(2)).isTrue(); // Inserts 2 to the set, returns true. Set now contains [1,2].
        assertThat(randomizedSet.remove(1)).isTrue(); // Removes 1 from the set, returns true. Set now contains [2].
        int rand = randomizedSet.getRandom();
        assertThat(rand).isEqualTo(2); // getRandom() should return either 1 or 2 randomly.
    }
}