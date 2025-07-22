package org.javaguru.student_vitalii_lutsenko.project_1;

import java.math.BigDecimal;
import java.math.RoundingMode;

class TaxCalculatorBigDecimal {
     private boolean isIncomeLessThen10k(BigDecimal income){
         return income.compareTo(new BigDecimal("10000")) <= 0;
     }
    private boolean isIncomeFrom10kToLessThen50k(BigDecimal income) {
        return income.compareTo(new BigDecimal("10000")) > 0
                && income.compareTo(new BigDecimal("50000")) <= 0;
    }

     private BigDecimal calculateTaxWenIncomeUnder10k (BigDecimal income){
         return income.multiply(new BigDecimal("0.3")).setScale(2, RoundingMode.HALF_UP);
     }
     private BigDecimal calculateTaxWenIncomeFrom10kTo50k(BigDecimal income){
         BigDecimal tenK = new BigDecimal("10000");
         BigDecimal tax_rate_03 = new BigDecimal("0.3");
         BigDecimal tax_rate_04 = new BigDecimal("0.4");

         BigDecimal tax_1 = tenK.multiply(tax_rate_03);
         BigDecimal tax_2 = income.subtract(tenK).multiply(tax_rate_04);

         return tax_1.add(tax_2).setScale(2, RoundingMode.HALF_UP);
     }
     private BigDecimal calculateTaxWenIncomeMore50k (BigDecimal income){
         BigDecimal tenK = new BigDecimal("10000");
         BigDecimal fiftyK = new BigDecimal("50000");
         BigDecimal tax_rate_03 = new BigDecimal("0.3");
         BigDecimal tax_rate_04 = new BigDecimal("0.4");
         BigDecimal tax_rate_05 = new BigDecimal("0.5");

         BigDecimal tax_1 = tenK.multiply(tax_rate_03);
         BigDecimal tax_2 = fiftyK.subtract(tenK).multiply(tax_rate_04);
         BigDecimal tax_3 = income.subtract(fiftyK).multiply(tax_rate_05);

         return tax_1.add(tax_2).add(tax_3).setScale(2, RoundingMode.HALF_UP);
     }


     BigDecimal calculateTax(BigDecimal income) {

         if (isIncomeLessThen10k(income)) {
             return calculateTaxWenIncomeUnder10k(income);
         }
         if (isIncomeFrom10kToLessThen50k(income)) {
             return calculateTaxWenIncomeFrom10kTo50k(income);
         }
         return  calculateTaxWenIncomeMore50k(income);

     }
}
