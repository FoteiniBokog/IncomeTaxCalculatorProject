package incometaxcalculator.data.management;

import java.io.IOException;

import incometaxcalculator.data.io.FileReader;
import incometaxcalculator.data.io.XMLFileReader;
import incometaxcalculator.exceptions.WrongFileEndingException;
import incometaxcalculator.exceptions.WrongFileFormatException;
import incometaxcalculator.exceptions.WrongReceiptDateException;
import incometaxcalculator.exceptions.WrongReceiptKindException;
import incometaxcalculator.exceptions.WrongTaxpayerStatusException;

public class XmlLoadTaxpayer implements LoadTaxPayer {

  @Override
  public void LoadReader(String fileName)
      throws NumberFormatException, IOException, WrongFileFormatException, WrongFileEndingException,
      WrongTaxpayerStatusException, WrongReceiptKindException, WrongReceiptDateException {
    FileReader reader = new XMLFileReader();
    reader.readFile(fileName);

  }

}
