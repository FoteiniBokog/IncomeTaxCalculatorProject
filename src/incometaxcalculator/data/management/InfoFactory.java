package incometaxcalculator.data.management;

import java.io.File;
import java.io.IOException;

import incometaxcalculator.data.io.TXTInfoWriter;
import incometaxcalculator.data.io.XMLInfoWriter;

public class InfoFactory {
  
  //void
  public  void  updateFiles(int taxRegistrationNumber) throws IOException {
    if(new File(taxRegistrationNumber + "_INFO.xml").exists()){
       new XmlWriter().createFile(taxRegistrationNumber);//changed
    } else {
        new TxtWriter().createFile(taxRegistrationNumber); //changed
    }
    if ((new File(taxRegistrationNumber + "_INFO.txt").exists())) {
        new TxtWriter().createFile(taxRegistrationNumber); //changed
    }
   
  }

}
