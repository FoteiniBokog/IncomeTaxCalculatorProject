package incometaxcalculator.data.management;

import java.io.File;
import java.io.IOException;

import incometaxcalculator.data.io.XMLInfoWriter;

public class XmlWriter implements InfoWriter {

  @Override
  public void createFile(int taxRegistrationNumber) throws IOException {
      new XMLInfoWriter(taxRegistrationNumber);
  }

}
