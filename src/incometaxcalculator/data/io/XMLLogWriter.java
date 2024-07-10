package incometaxcalculator.data.io;

import java.io.IOException;
import java.io.PrintWriter;

import incometaxcalculator.data.management.TaxpayerManager;

public class XMLLogWriter extends LogFileWriter {

  
  private String file="__LOG.xml";
  private String Name="<Name>";
  private String AFM="<AFM>";
  private String Income="<Income>";
  private String BasicTax="<BasicTax>";
  private String TaxIncrease="TaxIncrease>";
  private String TaxDecrease="<TaxDecreasee>";
  private String TotalTax="<TotalTax>";
  private String Receipts="<Receipts>";
  private String Enter="<Entertainment>";
  private String Basic="<Basic>";
  private String Travel="<Travel>";
  private String Health="<Health>";
  private String Other="<Other>";
  
  public XMLLogWriter( int taxRegistrationNumber) throws IOException {
    
    generateFile(taxRegistrationNumber,file,Name,AFM,Income,BasicTax,TaxIncrease,TaxDecrease,TotalTax,Receipts,Enter,Basic,Travel,Health,Other);  
  }

}
