package incometaxcalculator.data.management;

import java.io.IOException;

import incometaxcalculator.exceptions.WrongFileEndingException;
import incometaxcalculator.exceptions.WrongFileFormatException;
import incometaxcalculator.exceptions.WrongReceiptDateException;
import incometaxcalculator.exceptions.WrongReceiptKindException;
import incometaxcalculator.exceptions.WrongTaxpayerStatusException;

public class LoadTaxpayerFactory {
  
  public void loadTaxpayer(String fileName)
      throws NumberFormatException, IOException, WrongFileFormatException, WrongFileEndingException,
      WrongTaxpayerStatusException, WrongReceiptKindException, WrongReceiptDateException {

    String ending[] = fileName.split("\\.");
    if (ending[1].equals("txt")) {
      new TxtLoadTaxpayer().LoadReader(fileName);
    } else if (ending[1].equals("xml")) {
      new XmlLoadTaxpayer().LoadReader(fileName);
    } else {
      throw new WrongFileEndingException();
    }
  }
}
