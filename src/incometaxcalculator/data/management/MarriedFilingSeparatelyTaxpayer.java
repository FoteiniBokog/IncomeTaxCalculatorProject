package incometaxcalculator.data.management;

public class MarriedFilingSeparatelyTaxpayer extends Taxpayer{
  
//here we create the matrixes that keep the values foe the specific taxpayer
  private double[] ifarray={18040,71680,90000,127120};
  private double A0[]= {0.0535};
  private double A1[]= {965.14,0.0705,18040};
  private double A2[]= {4746.76,0.0785,71680};
  private double A3[]= {6184.88,0.0785,90000};
  private double A4[]= {9098.80,0.0985,127120};
  
  
  public MarriedFilingSeparatelyTaxpayer(String fullname, int taxRegistrationNumber, float income) {
    super(fullname, taxRegistrationNumber, income);
    
    setBasicTax(ifarray,A0,A1,A2,A3,A4); //here we calculate the basic tax according to the matrixes above
  }

 

  
  
  
}