package io.acode.days.one;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HistorianHysteriaTest {

    @Test
    void validateTestData() {
        HistorianHysteria target = new HistorianHysteria("one/day1test.txt");

        var result = target.totalDistance();
        assertEquals(11, result);
    }

    @Test
    void validateFirstProblem() {
        HistorianHysteria target = new HistorianHysteria("one/day1.txt");

        var result = target.totalDistance();
        assertEquals(1938424, result);
    }

    @Test
    void validateTestDataPart2() {
        HistorianHysteria target = new HistorianHysteria("one/day1test.txt");

        var result = target.similarityScore();
        assertEquals(31, result);
    }

    @Test
    void validateFirstProblemPart2() {
        HistorianHysteria target = new HistorianHysteria("one/day1.txt");

        var result = target.similarityScore();
        assertEquals(22014209, result);
    }
}
