package incometaxcalculator.data.io;

import java.io.IOException;
import java.io.PrintWriter;

import incometaxcalculator.data.management.TaxpayerManager;

public class TXTLogWriter extends LogFileWriter {

  
  private String file="__LOG.txt";
  private String Name="Name:";
  private String AFM="AFM:";
  private String Income="Income:";
  private String BasicTax="BasicTax:";
  private String TaxIncrease="TaxIncrease:";
  private String TaxDecrease="TaxDecrease:";
  private String TotalTax="<TotalTax>";
  private String Receipts="TotalReceiptsGathered:";
  private String Enter="Entertainment:";
  private String Basic="Basic:";
  private String Travel="Travel:";
  private String Health="Health:";
  private String Other="Other:";
  
  public TXTLogWriter( int taxRegistrationNumber) throws IOException {
    
    generateFile(taxRegistrationNumber,file,Name,AFM,Income,BasicTax,TaxIncrease,TaxDecrease,TotalTax,Receipts,Enter,Basic,Travel,Health,Other);  
  }

}
