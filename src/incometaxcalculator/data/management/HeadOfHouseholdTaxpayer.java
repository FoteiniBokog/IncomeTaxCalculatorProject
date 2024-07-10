package incometaxcalculator.data.management;

public class HeadOfHouseholdTaxpayer extends Taxpayer {
  
//here we create the matrixes that keep the values foe the specific taxpayer
  private double[] ifarray={30390,90000,122110,203390};
  private double A0[]= {0.0535};
  private double A1[]= {1625.87,0.0705,30390};
  private double A2[]= {5828.38,0.0705,90000};
  private double A3[]= {8092.13,0.0785,122110};
  private double A4[]= {14472.61,0.0985,203390};
  

  public HeadOfHouseholdTaxpayer(String fullname, int taxRegistrationNumber, float income) {
    super(fullname, taxRegistrationNumber, income);
    
    setBasicTax(ifarray,A0,A1,A2,A3,A4); //here we calculate the basic tax according to the matrixes above
  }

 
  
  
  

}
