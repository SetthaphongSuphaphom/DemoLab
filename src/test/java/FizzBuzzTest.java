import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void fizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        // Arrange
        int input = 1;
        String expected = "1";
        // Act
        String actual = fizzBuzz.fizzBuzz(input);
        // Assert
        assertEquals(expected, actual);
    }
}