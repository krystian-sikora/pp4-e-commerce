package pl.ksikora;

import org.junit.jupiter.api.Test;

public class FirstTest {
    @Test
    void myFirstTest() {
        assert true == true;
    }
    @Test
    void My2ndTest() {
        String name = "jakub";
        String hello = String.format("Hello %s", name);
        assert hello.equals("Hello jakub");
    }

    @Test
    void baseTestSchema() {
        // Arrange   // Given    // Input
        // Act       // When     // Call / Interaction
        // Assert    // Then     // Output
    }
}
