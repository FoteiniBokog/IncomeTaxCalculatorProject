package incometaxcalculator.data.io;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;

import incometaxcalculator.data.management.Receipt;
import incometaxcalculator.data.management.Taxpayer;
import incometaxcalculator.data.management.TaxpayerManager;

public  class InfoFileWriter{
  
  //added
  private TaxpayerManager manager=new TaxpayerManager();
  
 
  public void generateFile(int taxRegistrationNumber,String file,String Name,String AFM,String Status,String Income,String Receipts,String ReceiptID,String Date,String Kind,String Amount,String Company,String Country,String City,String Street,String Number) throws IOException {

    PrintWriter outputStream = new PrintWriter(
        new java.io.FileWriter(taxRegistrationNumber + file));
    outputStream.println(Name + manager.getTaxpayerName(taxRegistrationNumber) + Name);
    outputStream.println(AFM + taxRegistrationNumber +AFM);
    outputStream.println(Status + manager.getTaxpayerStatus(taxRegistrationNumber) + Status);
    outputStream.println(Income+ manager.getTaxpayerIncome(taxRegistrationNumber) +Income);
    outputStream.println();// den mas emfanize to \n se aplo notepad
    outputStream.println(Receipts);
    outputStream.println();
    generateTaxpayerReceipts(taxRegistrationNumber, outputStream,ReceiptID,Date,Kind,Amount,Company,Country,City,Street,Number);
    outputStream.close();
  }
  
  private void generateTaxpayerReceipts(int taxRegistrationNumber, PrintWriter outputStream, String ReceiptID,String Date,String Kind,String Amount,String Company,String Country,String City,String Street,String Number) {

    HashMap<Integer, Receipt> receiptsHashMap = manager.getReceiptHashMap(taxRegistrationNumber);
    Iterator<HashMap.Entry<Integer, Receipt>> iterator = receiptsHashMap.entrySet().iterator();
    
    while (iterator.hasNext()) {
      HashMap.Entry<Integer, Receipt> entry = iterator.next();
      Receipt receipt = entry.getValue();
      outputStream.println( ReceiptID + receipt.getId());   
      outputStream.println(Date+ receipt.getIssueDate()); 
      outputStream.println(Kind+receipt.getKind() );   
      outputStream.println(Amount+receipt.getAmount());   
      outputStream.println(Company+ receipt.getCompany().getName());  
      outputStream.println(Country+ receipt.getCompany().getCountry() );   
      outputStream.println(City+  receipt.getCompany().getCity());   
      outputStream.println(Street+ receipt.getCompany().getStreet()); //getCompanyStreet(receipt)
      outputStream.println(Number+ receipt.getCompany().getNumber()); //getCompanyNumber(receipt)
      outputStream.println();
    }
  }
}

  
