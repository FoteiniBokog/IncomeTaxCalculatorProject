package incometaxcalculator.data.management;

public class MarriedFilingJointlyTaxpayer extends Taxpayer {
 
  //here we create the matrixes that keep the values foe the specific taxpayer
  private double[] ifarray={36080,90000,143350,254240};
  private double A0[]= {0.0535};
  private double A1[]= {1930.28,0.0705,36080};
  private double A2[]= {5731.64,0.0705,90000};
  private double A3[]= {9492.82,0.0785,143350};
  private double A4[]= {18197.69,0.0985,254240};
  

  public MarriedFilingJointlyTaxpayer(String fullname, int taxRegistrationNumber, float income){
    super(fullname, taxRegistrationNumber, income);
    
    setBasicTax(ifarray,A0,A1,A2,A3,A4); //here we calculate the basic tax according to the matrixes above
  }


  
  
 
  

}