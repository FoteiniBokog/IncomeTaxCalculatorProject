package incometaxcalculator.data.management;

public class SingleTaxpayer extends Taxpayer{
  
    //here we create the matrixes that keep the values foe the specific taxpayer
    private double[] ifarray={24680,81080,90000,152540};
    private double A0[]= {0.0535};
    private double A1[]= {320.38,0.0705,24680};
    private double A2[]= {5296.58,0.0785,81080};
    private double A3[]= {5996.80,0.0785,90000};
    private double A4[]= {10906.19,0.0985,152540};
    //private double Tax;
    
   
    //constructor
    public SingleTaxpayer(String fullname, int taxRegistrationNumber, float income) {
      super(fullname, taxRegistrationNumber, income);
      
      setBasicTax(ifarray,A0,A1,A2,A3,A4);//here we calculate the basic tax according to the matrixes above
      
    
  }


   
   
   

}