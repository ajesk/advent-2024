package io.acode.days.seven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BridgeRepairTest {
    @Test
    void validateTestData() {
        BridgeRepair target = new BridgeRepair("seven/test.txt");

        var result = target.part1();
        assertEquals(3749, result);
    }

    @Test
    void validateFirstProblem() {
        BridgeRepair target = new BridgeRepair("seven/real.txt");

        var result = target.part1();
        assertEquals(303876485655L, result);
    }

    @Test
    void validateTestDataPart2() {
        BridgeRepair target = new BridgeRepair("seven/test.txt", true);

        var result = target.part1();
        assertEquals(11387, result);
    }

    @Test
    void validateFirstProblemPart2() {
        BridgeRepair target = new BridgeRepair("seven/real.txt", true);

        var result = target.part1();
        assertEquals(146111650210682L, result);
    }
}
