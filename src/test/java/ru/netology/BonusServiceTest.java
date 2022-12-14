package ru.netology;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BonusServiceTest {
    @ParameterizedTest
    @CsvFileSource (files = "src/test/resources/data.csv")
    public void shouldCalculate (int expected, long amount, boolean registered) {
        BonusService service = new BonusService();
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }
}
