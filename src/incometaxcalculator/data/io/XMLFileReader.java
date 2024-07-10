package incometaxcalculator.data.io;

import java.io.BufferedReader;
import java.io.IOException;

import incometaxcalculator.exceptions.WrongFileFormatException;

public class XMLFileReader extends FileReader {

  
  //fill valus for xml
  protected int fillvalues(String values[]) {
    if (values[0].equals("<ReceiptID>")) {
      int receiptId = Integer.parseInt(values[1].trim());
      return receiptId;
    }
    return -1;
    
  }

  //getvalue for xml
  protected String getValue(String values[]) {
    String valueReversed[] = new StringBuilder(values[1]).reverse().toString().trim()
        .split(" ", 2);
    return new StringBuilder(valueReversed[1]).reverse().toString();
  }

}
