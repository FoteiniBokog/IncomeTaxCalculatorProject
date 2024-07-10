package incometaxcalculator.data.management;

import java.io.IOException;

import incometaxcalculator.data.io.XMLLogWriter;

public class XmlLogWriter implements LogWriter {

  @Override
  public void createLogWriter(int taxRegistrationNumber) throws IOException {
     
    new XMLLogWriter(taxRegistrationNumber);

  }

}
