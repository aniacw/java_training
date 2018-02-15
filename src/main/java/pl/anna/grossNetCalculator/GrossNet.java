package pl.anna.grossNetCalculator;

import java.math.BigDecimal;

public class GrossNet {

    private BigDecimal netPurchasePrice;
    private BigDecimal vatAmount = new BigDecimal(0.23);

    public GrossNet(Double netPurchasePrice) {
        this.netPurchasePrice = new BigDecimal(netPurchasePrice);
    }

    BigDecimal calculateGross(){
        BigDecimal vat = netPurchasePrice.multiply(vatAmount);
        return netPurchasePrice.add(vat);
    }

}
