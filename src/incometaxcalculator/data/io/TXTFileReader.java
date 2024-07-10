package incometaxcalculator.data.io;

import java.io.BufferedReader;
import java.io.IOException;

import incometaxcalculator.exceptions.WrongFileFormatException;

public class TXTFileReader extends FileReader {

  //fill the values for txt format file
  protected int fillvalues(String values[]) {
    if (values[0].equals("Receipt")) {
      if (values[1].equals("ID:")) {
        int receiptId = Integer.parseInt(values[2].trim());
        return receiptId;
      }
    }
    return -1;
  }

 //get value for txt format file
  protected String  getValue(String values[]) {
    values[1] = values[1].trim();
    return values[1];
  }

}