public class BankAccount
{
    //instance variables
    private int pin;
    private double personalInterestRate;
    
    //does not change for life of object but is constant    
    private final String accountNumber;
    
    //belongs to the class - no object but can change - only one copy    
    private static double primeInterestRate = 0.01;
    
    //cannot change - belongs to class - no object - symbolic constant
    public static final int YEAR_BANK_FOUNDED = 1899;
    public static final int PIN_UPPER_LIMIT = 9999;
    public static final int PIN_LOWER_LIMIT = 1000;
    
    public BankAccount(String newNumber, int newPin)
    {
        accountNumber = newNumber;
        
        if (newPin  < PIN_UPPER_LIMIT && newPin > PIN_LOWER_LIMIT)
        {
            pin = newPin;
            
        }
    }
    
    public static int getYEAR_FOUNDED()
    {
        return YEAR_BANK_FOUNDED;
    }
    
    public static void setPrimeInterestRate(double newRate)
    {
        primeInterestRate = newRate;
    }
    
    public void printDetails()
    {
        String motto = "It's your career, get it right!";
       
        motto.toUpperCase();
        System.out.println(motto);
        System.out.println(motto.toLowerCase());
        
        //return motto.toUpperCase();
    }
    
    
   
    
    
    
}
    