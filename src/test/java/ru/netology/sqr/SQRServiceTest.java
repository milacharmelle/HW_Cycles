package ru.netology.sqr;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(resources = {"/testdata.csv"})
    void test(int limit1, int limit2, int expected) {
        SQRService service = new SQRService();

        int actual = service.SQRCount(limit1, limit2);


        assertEquals(expected, actual);
    }

}
