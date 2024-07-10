package incometaxcalculator.data.io;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;

import incometaxcalculator.data.management.Receipt;
import incometaxcalculator.data.management.TaxpayerManager;

public class TXTInfoWriter extends InfoFileWriter {

  //initialize the constant strings
  private String file="__INFO.txt";
  private String Name="Name:";
  private String AFM="AFM:";
  private String Status="Status:";
  private String Income="Income:";
  private String Receipts="Receipts:";
  private String ReceiptID="ReceiptID:";
  private String Date="Date:";
  private String Kind="Kind:";
  private String Amount="Amount:";
  private String Company="Company:";
  private String Country="Country:";
  private String City="City:";
  private String Street="Street:";
  private String Number="Number:";
  
  
  //constructor
  public TXTInfoWriter(int taxRegistrationNumber) throws IOException{
    //pass the constant string to the generateFile method
    generateFile(taxRegistrationNumber,file,Name,AFM,Status,Income,Receipts,ReceiptID,Date,Kind,Amount,Company,Country,City,Street,Number);
  }
}