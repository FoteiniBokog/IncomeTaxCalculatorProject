package incometaxcalculator.data.io;

import java.io.IOException;
import java.io.PrintWriter;

import incometaxcalculator.data.management.TaxpayerManager;

public  class LogFileWriter {
  //added
  private TaxpayerManager manager=new TaxpayerManager();
  private static final short ENTERTAINMENT = 0;
  private static final short BASIC = 1;
  private static final short TRAVEL = 2;
  private static final short HEALTH = 3;
  private static final short OTHER = 4;

  //changed the parameters of the generatefile
  public void generateFile(int taxRegistrationNumber,String file,String Name,String AFM,String Income,String BasicTax,String TaxIncrease,String TaxDecrease,String TotalTax,String TotalReceipts,String  Enter,String Basic,String Travel,String Health,String Other) throws IOException{
  
    PrintWriter outputStream = new PrintWriter(
        new java.io.FileWriter(taxRegistrationNumber + file));
    outputStream.println(Name + manager.getTaxpayerName(taxRegistrationNumber));
    outputStream.println(AFM+ taxRegistrationNumber);
    outputStream.println(Income+ manager.getTaxpayerIncome(taxRegistrationNumber));
    outputStream.println(BasicTax+ manager.getTaxpayerBasicTax(taxRegistrationNumber));
    if (manager.getTaxpayerVariationTaxOnReceipts(taxRegistrationNumber) > 0) {
      outputStream
          .println(TaxIncrease+ manager.getTaxpayerVariationTaxOnReceipts(taxRegistrationNumber));
    } else {
      outputStream
          .println(TaxDecrease+ manager.getTaxpayerVariationTaxOnReceipts(taxRegistrationNumber));
    }
    outputStream.println(TotalTax + manager.getTaxpayerTotalTax(taxRegistrationNumber));
    outputStream.println(
        TotalReceipts+ manager.getTaxpayerTotalReceiptsGathered(taxRegistrationNumber));
    outputStream.println(
        Enter+ manager.getTaxpayerAmountOfReceiptKind(taxRegistrationNumber, ENTERTAINMENT));
    outputStream.println(Basic+ manager.getTaxpayerAmountOfReceiptKind(taxRegistrationNumber, BASIC));
    outputStream
        .println(Travel+ manager.getTaxpayerAmountOfReceiptKind(taxRegistrationNumber, TRAVEL));
    outputStream
        .println(Health+ manager.getTaxpayerAmountOfReceiptKind(taxRegistrationNumber, HEALTH));
    outputStream.println(Other+ manager.getTaxpayerAmountOfReceiptKind(taxRegistrationNumber, OTHER));
    outputStream.close();
  }
}
