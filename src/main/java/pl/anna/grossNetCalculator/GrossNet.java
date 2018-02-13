package pl.anna.grossNetCalculator;

import java.math.BigDecimal;

public class GrossNet {

    private double grossPurchasePrice;
    private double vatAmount;

   BigDecimal decimalGrossPurchasePrice = new BigDecimal(Double.toString(grossPurchasePrice));
   BigDecimal decimalVatAmount = new BigDecimal(Double.toString(vatAmount));

//    public GrossNet(BigDecimal decimalGrossPurchasePrice, BigDecimal decimalVatAmount) {
//        this.decimalGrossPurchasePrice = decimalGrossPurchasePrice;
//        this.decimalVatAmount = decimalVatAmount;
//    }

    public BigDecimal calculateNet(BigDecimal decimalGrossPurchasePrice, BigDecimal decimalVatAmount){
       BigDecimal net = decimalGrossPurchasePrice.divide(decimalVatAmount);
       return net;
    }

}
