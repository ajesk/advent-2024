package io.acode.days.two;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RedNosedReportsTest {
    @Test
    void validateTestData() {
        RedNosedReports target = new RedNosedReports("two/day2test.txt");

        var result = target.findSafeReports();
        assertEquals(2, result);
    }

    @Test
    void validatePart1Data() {
        RedNosedReports target = new RedNosedReports("two/real.txt");

        var result = target.findSafeReports();
        assertEquals(218, result);
    }

    @Test
    void validatePart2TestData() {
        RedNosedReports target = new RedNosedReports("two/day2test.txt");

        var result = target.findErrorCheckedReports();
        assertEquals(4, result);
    }

    @Test
    void validatePart2Data() {
        RedNosedReports target = new RedNosedReports("two/real.txt");

        var result = target.findErrorCheckedReports();
        assertEquals(290, result);
    }
}
