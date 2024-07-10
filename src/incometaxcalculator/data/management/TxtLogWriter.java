package incometaxcalculator.data.management;

import java.io.IOException;

import incometaxcalculator.data.io.TXTLogWriter;

public class TxtLogWriter implements LogWriter {

  @Override
  public void createLogWriter(int taxRegistrationNumber) throws IOException {
    
    new TXTLogWriter(taxRegistrationNumber);
    

  }

}
