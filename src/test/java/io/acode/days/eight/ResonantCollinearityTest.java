package io.acode.days.eight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ResonantCollinearityTest {
    @Test
    void validateTestData() {
        ResonantCollinearity target = new ResonantCollinearity("eight/test.txt");

        var result = target.findAntinodes();
        assertEquals(14, result);
    }

    @Test
    void validateFirstProblem() {
        ResonantCollinearity target = new ResonantCollinearity("eight/real.txt");

        var result = target.findAntinodes();
        assertEquals(332, result);
    }

    @Test
    void validateTestDataPart2() {
        ResonantCollinearity target = new ResonantCollinearity("eight/test.txt", true);

        var result = target.findAntinodes();
        assertEquals(34, result);
    }

    @Test
    void validateTestDataPart2_2() {
        ResonantCollinearity target = new ResonantCollinearity("eight/test2.txt", true);

        var result = target.findAntinodes();
        assertEquals(9, result);
    }

    @Test
    void validateFirstProblemPart2() {
        ResonantCollinearity target = new ResonantCollinearity("eight/real.txt", true);

        var result = target.findAntinodes();
        assertEquals(1174, result);
    }
}
