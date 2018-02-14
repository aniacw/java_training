package pl.anna.grossNetCalculator;

import java.math.BigDecimal;

public class GrossNet {

    private BigDecimal netPurchasePrice;
    private BigDecimal vatAmount = new BigDecimal(0.23);

    public GrossNet(BigDecimal netPurchasePrice) {
        this.netPurchasePrice = new BigDecimal(double);
    }

    BigDecimal vat = netPurchasePrice.multiply(vatAmount);

    BigDecimal calculateGross(){
        return netPurchasePrice.add(vat);
    }
}
