package pl.ksikora.creditcard;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

public class CreditCardTest {
    @Test
    void itAllowsToAssignCreditLimit() {
        // Arrange
        CreditCard card1 = new CreditCard("1234-4567");
        CreditCard card2 = new CreditCard("1234-4567");
        // Act
        card1.assignCredit(BigDecimal.valueOf(1000));
        card2.assignCredit(BigDecimal.valueOf(1100));
        // Assert
        assertEquals(BigDecimal.valueOf(1000), card1.getBalance());
        assertEquals(BigDecimal.valueOf(1100), card2.getBalance());
    }

    @Test
    void itCantAssignLimitBelowCertainThreshold() {
        CreditCard card1 = new CreditCard("1234-4567");

        try {
            card1.assignCredit(BigDecimal.valueOf(10));
            fail("Should throw exception");
        } catch (CreditLimitBelowThresholdException e) {
            assertTrue(true);
        }

        assertThrows(CreditLimitBelowThresholdException.class,
                () -> card1.assignCredit((BigDecimal.valueOf(10)))); // lambda: card.assign()
        assertThrows(CreditLimitBelowThresholdException.class,
                () -> card1.assignCredit((BigDecimal.valueOf(99))));
        assertDoesNotThrow(
                () -> card1.assignCredit((BigDecimal.valueOf(100))));

    }


    @Test
    void checkDoublesAndFloats() {
        double x1 = 0.01;
        double x2 = 0.03;
        double result = x2 - x1;

        float y1 = 0.01F;
        float y2 = 0.03F;
        float result2 = (float) (x2 - x1);
    }
}
