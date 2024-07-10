package incometaxcalculator.data.management;

import java.io.IOException;

import incometaxcalculator.exceptions.WrongFileFormatException;

public class LogWriterFactory {
  
  
  public void saveLogFile(int taxRegistrationNumber, String fileFormat) throws IOException, WrongFileFormatException {
    if (fileFormat.equals("txt")) {
      new TxtLogWriter().createLogWriter(taxRegistrationNumber);
    } else if (fileFormat.equals("xml")) {
        new XmlLogWriter().createLogWriter(taxRegistrationNumber);
    } else {
      throw new WrongFileFormatException();
    }
  }
}
