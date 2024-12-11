package io.acode.days.four;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CeresSearchTest {

    @Test
    void validateTestData() {
        CeresSearch target = new CeresSearch("four/day4test.txt");

        var result = target.findXmas();
        assertEquals(18, result);
    }

    @Test
    void validateFirstProblem() {
        CeresSearch target = new CeresSearch("four/real.txt");

        var result = target.findXmas();
        assertEquals(2639, result);
    }

    @Test
    void validateTestDataPart2() {
        CeresSearch target = new CeresSearch("four/day4test.txt");

        var result = target.findMasX();
        assertEquals(9, result);
    }

    @Test
    void validateFirstProblemPart2() {
        CeresSearch target = new CeresSearch("four/real.txt");

        var result = target.findMasX();
        assertEquals(2005, result);
    }
}
