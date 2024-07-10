package incometaxcalculator.data.management;

import java.util.HashMap;

import incometaxcalculator.exceptions.WrongTaxpayerStatusException;

public class CreationTaxpayerFactory  {
  
 //factory to create different objects according to status
  public Taxpayer createTaxpayerfactory(String fullname, int taxRegistrationNumber, String status,
      float income) throws WrongTaxpayerStatusException {

    if (status.equals("Married Filing Jointly")) {
           return  new MarriedFilingJointlyTaxpayer(fullname, taxRegistrationNumber, income);
    } else if (status.equals("Married Filing Separately")) {
      
           return new MarriedFilingSeparatelyTaxpayer(fullname, taxRegistrationNumber, income);
    } else if (status.equals("Single")) {
          return new SingleTaxpayer(fullname, taxRegistrationNumber, income);
    } else if (status.equals("Head of Household")) {
           return new HeadOfHouseholdTaxpayer(fullname, taxRegistrationNumber, income);
    } else {
      throw new WrongTaxpayerStatusException();
    }
  }
}
