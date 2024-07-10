package incometaxcalculator.data.management;

import java.io.File;
import java.io.IOException;

public interface InfoWriter {
  public void createFile(int taxRegistrationNumber)throws IOException;

}
