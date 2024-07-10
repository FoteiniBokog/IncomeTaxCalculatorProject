package incometaxcalculator.data.management;

import java.io.IOException;

import incometaxcalculator.exceptions.WrongFileEndingException;
import incometaxcalculator.exceptions.WrongFileFormatException;
import incometaxcalculator.exceptions.WrongReceiptDateException;
import incometaxcalculator.exceptions.WrongReceiptKindException;
import incometaxcalculator.exceptions.WrongTaxpayerStatusException;



public interface LoadTaxPayer {
  public void LoadReader(String fileName)throws NumberFormatException, IOException, WrongFileFormatException, WrongFileEndingException,
  WrongTaxpayerStatusException, WrongReceiptKindException, WrongReceiptDateException ;
}


