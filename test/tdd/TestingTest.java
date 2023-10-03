package tdd;

import org.junit.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class TestingTest {
@Test
    public void testingTesting(){
    List<LocalDate> list = List.of(LocalDate.of(2023,9,17),
            LocalDate.of(2023,9,18),
            LocalDate.of(2023,9,19),
            LocalDate.of(2023,9,20),
            LocalDate.of(2023,9,21),
            LocalDate.of(2023,9,22),
            LocalDate.of(2023,9,23));
    Testing.mensDay();

    assertIterableEquals(list,Testing.mensDay());
}
}