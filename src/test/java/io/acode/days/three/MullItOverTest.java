package io.acode.days.three;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MullItOverTest {

    @Test
    void validateTestData() {
        MullItOver target = new MullItOver("three/day3test.txt");

        var result = target.multiplication();
        assertEquals(161, result);
    }

    @Test
    void validateFirstProblem() {
        MullItOver target = new MullItOver("three/day3.txt");

        var result = target.multiplication();
        assertEquals(188741603, result);
    }

    @Test
    void validateTestDataPart2() {
        MullItOver target = new MullItOver("three/day3test2.txt");

        var result = target.startStop();
        assertEquals(48, result);
    }

    @Test
    void validateFirstProblemPart2() {
        MullItOver target = new MullItOver("three/day3.txt");

        var result = target.startStop();
        assertEquals(67269798, result);
    }
}
