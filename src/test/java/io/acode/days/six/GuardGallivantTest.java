package io.acode.days.six;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GuardGallivantTest {

    @Test
    void validateTestData() {
        GuardGallivant target = new GuardGallivant("six/day6test.txt");

        var result = target.trackGuardLocations();
        assertEquals(41, result);
    }

    @Test
    void validateFirstProblem() {
        GuardGallivant target = new GuardGallivant("six/day6.txt");

        var result = target.trackGuardLocations();
        assertEquals(5177, result);
    }

    @Test
    void validateSimulationTestData() {
        GuardGallivant target = new GuardGallivant("six/day6test.txt");

        var result = target.part2();
        assertEquals(6, result);
    }

    @Test
    void validateFirstProblemFixAndCountErrors() {
        GuardGallivant target = new GuardGallivant("six/day6.txt");

        var result = target.part2();
        assertEquals(0, result);
    }
}
