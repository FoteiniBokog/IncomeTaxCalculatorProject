package incometaxcalculator.data.management;

import java.io.IOException;

public interface LogWriter {
  public void createLogWriter(int taxRegistrationNumber)  throws IOException;

}
