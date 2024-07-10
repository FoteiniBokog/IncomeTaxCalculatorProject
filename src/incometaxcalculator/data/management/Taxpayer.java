 package incometaxcalculator.data.management;

import java.util.HashMap;
import java.util.Map;

import incometaxcalculator.exceptions.WrongReceiptKindException;

public class Taxpayer {

  protected final String fullname;
  protected final int taxRegistrationNumber;
  protected final float income;
  private float amountPerReceiptsKind[] = new float[5];
  private int totalReceiptsGathered = 0;
  private HashMap<Integer, Receipt> receiptHashMap = new HashMap<Integer, Receipt>(0);
  
  //private int flag=0;
  private String kind[]={"Entertainment","Basic","Travel","Health","Other"};
  private int number[]= {0,1,2,3,4};
  private double Variationif[]= {0.2,0.4,0.6};
  private double result[]= {0.08,0.04,0.15};
  
  private double BasicTax;
  
  protected Taxpayer(String fullname, int taxRegistrationNumber, float income) {
    this.fullname = fullname;
    this.taxRegistrationNumber = taxRegistrationNumber;
    this.income = income;
    
  }
  
  //added
  public void setBasicTax(double [] ifarray,double A0[],double A1[],double A2[],double A3[],double A4[]) {
    this.BasicTax=calculateBasicTax(ifarray,A0,A1,A2,A3,A4);
  }
  
  //changed
  public void addReceipt(Receipt receipt) throws WrongReceiptKindException {
    int flag=0;
    for(int i=0;i<kind.length;i++) {
      if(kind[i].equals(receipt.getKind())){
        amountPerReceiptsKind[number[i]] += receipt.getAmount();
          flag=1;
      }
    }
    if (flag==0) { //receipt.getKind() isnt in the list  so must been a exception
      throw new WrongReceiptKindException();
    }
    receiptHashMap.put(receipt.getId(), receipt);
    totalReceiptsGathered++;
  }
        
  //changed
  public void removeReceipt(int receiptId) throws WrongReceiptKindException {
    int flag=0;
    Receipt receipt = receiptHashMap.get(receiptId);
    for(int i=0;i<kind.length;i++) {
      if(kind[i].equals(receipt.getKind())){
        amountPerReceiptsKind[number[i]] -= receipt.getAmount();
        flag=1;
      }
    }
    if (flag==0) { //receipt.getKind() isnt in the list  so must been a exception
      throw new WrongReceiptKindException();
    }
    totalReceiptsGathered--;
    receiptHashMap.remove(receiptId);
  }

  public String getFullname() {
    return fullname;
  }

  public int getTaxRegistrationNumber() {
    return taxRegistrationNumber;
  }

  public float getIncome() {
    return income;
  }

  public HashMap<Integer, Receipt> getReceiptHashMap() {
    return receiptHashMap;
  }
  
  //changed
  public double getVariationTaxOnReceipts() {
    float totalAmountOfReceipts = getTotalAmountOfReceipts();
    for(int i=0; i<Variationif.length; i++) {
      if (totalAmountOfReceipts < Variationif[i] * income) {
        return  result[i] *BasicTax;
      } 
    }
    return -0.3 * BasicTax ;
  }
      
        
  private float getTotalAmountOfReceipts() {
    int sum = 0;
    for (int i = 0; i < 5; i++) {
      sum += amountPerReceiptsKind[i];
    }
    return sum;
  }

  public int getTotalReceiptsGathered() {
    return totalReceiptsGathered;
  }

  public float getAmountOfReceiptKind(short kind) {
    return amountPerReceiptsKind[kind];
  }
  
  //changed the calcalulateBasicTax() withe the field BasicTax
  public double getTotalTax() {
    return BasicTax + getVariationTaxOnReceipts();
  }
  
  //changed the calcalulateBasicTax() withe the field BasicTax
  public double getBasicTax() {
    return  BasicTax;
  }
 
   //changed
  public  double calculateBasicTax(double ifarray[],double A0[],double A1[],double A2[],double A3[],double A4[]){
    if (income < ifarray[0]) {
      return A0[0] * income;
    } 
    else if (income <ifarray[1] ) {
      return A1[0] + A1[1] * (income - A1[2]);
    }
    else if (income <ifarray[2]) {
       return A2[0] +A2[1]* (income -A2[2]);
    } 
    else if (income < ifarray[3]) {
       return A3[0] +A3[1] * (income -A3[2]);
    } 
    else {
       return A4[0] + A4[1] * (income - A4[2]);
    }
  }
      

}