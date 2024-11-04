package Lab4;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/radii.csv")
    void testCalculateCircleArea(
            @ConvertWith(CircleConverter.class) Circle circle,
            double area
    ) {
        assertEquals(area, circle.calculateCircleArea(), 0.02);
    }
}