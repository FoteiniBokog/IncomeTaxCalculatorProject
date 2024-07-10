import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import incometaxcalculator.data.management.CreationTaxpayerFactory;
import incometaxcalculator.data.management.HeadOfHouseholdTaxpayer;
import incometaxcalculator.data.management.SingleTaxpayer;
import incometaxcalculator.data.management.Taxpayer;
import incometaxcalculator.exceptions.WrongTaxpayerStatusException;

class CreationTaxpayerFactoryTest {

  @Test
  void createTaxpayertest() throws WrongTaxpayerStatusException {
    
    String fullname="Kostas Koklas";
    int taxRegistrationNumber=123456789;
    String status="Head of Household";
    float income=20000;
  
    
    CreationTaxpayerFactory  t=new CreationTaxpayerFactory();
    Taxpayer a=t.createTaxpayerfactory(fullname,taxRegistrationNumber,status,income);
    Assertions.assertNotNull(a);
    Assertions.assertTrue(a instanceof HeadOfHouseholdTaxpayer); //we make sure that the object is indeed singleTaxpayer

  }

}
