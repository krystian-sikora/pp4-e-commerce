package pl.ksikora.creditcard;

import java.math.BigDecimal;

public class CreditCard {

    private BigDecimal balance;

    public CreditCard(String cardNumber) {

    }
    public void assignCredit(BigDecimal creditAmount) {
        if (creditAmount.compareTo(BigDecimal.valueOf(100)) < 0) {
            throw new CreditLimitBelowThresholdException();
        }
        this.balance = creditAmount;
    }
    public BigDecimal getBalance() {
        return balance;
    }
}
