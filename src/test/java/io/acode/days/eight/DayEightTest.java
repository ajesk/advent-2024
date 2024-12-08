package io.acode.days.eight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DayEightTest {
    @Test
    void validateTestData() {
        DayEight target = new DayEight("eight/test.txt");

        var result = target.part1();
        assertEquals(0, result);
    }

    @Test
    void validateFirstProblem() {
        DayEight target = new DayEight("eight/real.txt");

        var result = target.part1();
        assertEquals(0, result);
    }

    @Test
    void validateTestDataPart2() {
        DayEight target = new DayEight("eight/test.txt");

        var result = target.part2();
        assertEquals(0, result);
    }

    @Test
    void validateFirstProblemPart2() {
        DayEight target = new DayEight("eight/real.txt");

        var result = target.part2();
        assertEquals(0, result);
    }
}
