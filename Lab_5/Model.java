/**
 * Lab 5A/5B - BCIT Student A01029917 - Course Comp-1409-0 Intro Software Development 1 - 55053
 * 
 * @author Andrew Hewitson
 * @version May 16, 2017
 */
public class Model
{
    private String firstName;
    private String lastName;
    private int height;
    private double weight;
    private boolean canTravel;
    private boolean smokes;

    private double weightKg;
    private long kilograms;
    private int feet;
    private int inches;
    private String heightFeetAndInches;
    private int pay;

    private static String occupation = "modeling";
    public static int SHORTEST_NAME = 3;
    public static int LONGEST_NAME = 20;
    public static int SHORTEST_HEIGHT = 24;
    public static int TALLEST_HEIGHT = 84;
    public static int LIGHTEST_WEIGHT = 80;
    public static int HEAVIEST_WEIGHT = 280;
    public static double INCH_TO_CM = 2.54;
    public static double POUND_TO_KG = .454;

    public static final int INCHES_PER_FOOT = 12;
    public static final int BASE_RATE_DOLLARS_PER_HOUR = 60;
    public static final int TALL_INCHES = 67;
    public static final double THIN_POUNDS = 140.0;
    public static final int TALL_THIN_BONUS_DOLLARS_PER_HOUR = 5;
    public static final int TRAVEL_BONUS_DOLLARS_PER_HOUR = 4;
    public static final int SMOKER_DEDUCTION_DOLLARS_PER_HOUR = 10;

    /**
     * Constructor for objects of class Model
     * @param First Name must be longer than shortest name and shorter than longest name
     * @param Last Name must be longer than shortest name and shorter than longest name
     * @param height must be taller than shortest height and shorter than tallest height
     * @param weight must be heavier than lightest weight and heavier than lightest weight
     * @param can travel must be true or false
     * @param smokes must be true or false
     * @param occupation
     */
    public Model(String newFirstName, String newLastName, int newHeight, double newWeight, boolean newCanTravel, boolean newSmokes)
    {      
        setFirstName(newFirstName);
        setLastName(newLastName);
        setNewHeight(newHeight); 
        setNewWeight(newWeight);
        setCanTravel(newCanTravel);
        setDoesSmoke(newSmokes);
    }

    /**
     * @param First Name must be longer than shortest name and shorter than longest name
     * @param Last Name must be longer than shortest name and shorter than longest name
     * @param height must be taller than shortest height and shorter than tallest height
     * @param weight must be heavier than lightest weight and heavier than lightest weight
     * @param canTravel is true
     * @param smokes is false
     */
    public Model (String newFirstName2, String newLastName2, int heightInInches, int weightInPounds)
    {
        setFirstName(newFirstName2);
        setLastName(newLastName2);
        setNewHeight(heightInInches);          
        setNewWeight(weightInPounds);
        setCanTravel(true);   
        setDoesSmoke (false);          
    }

    /**
     * @return Student's First Name
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * @return Student's Last Name
     */
    public String getLastName()
    {
        return lastName;
    }

    /**
     * @return Height
     */
    public int getHeight()
    {
        return height;
    }

    /**
     * @return Weight
     */
    public double getWeight()
    {
        return weight;
    }

    /**
     * @return Can Travel
     */

    public boolean getCanTravel()
    {
        return canTravel;
    }

    /**
     * @return Smokes
     */
    public boolean getsmokes()
    {
        return smokes;
    }

    /**
     * @param changes Can Travel
     */
    public final void setCanTravel(boolean willTravel)
    {
        canTravel = willTravel;
    }

    /**
     * @param change First Name
     */
    public final void setFirstName(String first)
    {
        if((first!= null) && (first.length() >=SHORTEST_NAME) && (first.length() <=LONGEST_NAME))
        {
            firstName = first;
        }
    }

    /**
     * @param change Last Name
     */
    public final void setLastName(String last)
    {
        if((last!= null) && (last.length() >=SHORTEST_NAME) && (last.length() <=LONGEST_NAME))
        {
            lastName = last;
        }
    }

    /**
     * @param change Height 
     */
    public final void setNewHeight(int newHeight)
    {
        if (newHeight >= SHORTEST_HEIGHT && newHeight <= TALLEST_HEIGHT)
        {
            height = newHeight;
        }
    }   

    /**
     * @param change Weight
     */
    public final void setNewWeight(double newWeight)
    {
        if (newWeight >= LIGHTEST_WEIGHT && newWeight <= HEAVIEST_WEIGHT)
        {
            weight = newWeight;
        }
    }

    /**
     * @param change Smokes
     */
    public final void setDoesSmoke(boolean newSmoke) 
    {
        smokes = newSmoke;
    }

    /**
     * @return Height in feet and inches
     */
    public String getHeightInFeetAndInches()
    {
        feet = height/INCHES_PER_FOOT;
        inches = height%INCHES_PER_FOOT;
        if (inches > 1)
        {
            return heightFeetAndInches = feet + " feet " + inches + " inches";
        }
        else
        {
            return heightFeetAndInches = feet + " feet " + inches + " inch";
        }
    }

    /**
     * return weight in KG
     */
    public double getWeightKg()
    {
        return weightKg = Math.round((weight)*POUND_TO_KG);
    }

    /**
     * @return occupation
     */
    public static String getOccupation()
    {
        return occupation = occupation;
    }

    /**
     * @param set weight in KG
     */
    public final void setWeight ()
    {   
        kilograms= (Math.round(weight*POUND_TO_KG));
    }

    /**
     * @param set height in feet and inches
     */
    public final void setHeight (int feet,int inches)
    {       
        feet = height/INCHES_PER_FOOT;
        inches = height%INCHES_PER_FOOT;
    }

    /**
     * @return total pay
     */
    public int calculatePayDollarsPerHour()
    {
        if (height >= TALL_INCHES && weight <=THIN_POUNDS && smokes == false &&  canTravel == false)
        {
            return pay = BASE_RATE_DOLLARS_PER_HOUR +TALL_THIN_BONUS_DOLLARS_PER_HOUR;
        } 
        if (height >= TALL_INCHES && weight <=THIN_POUNDS && smokes == false && canTravel == true)
        {
            return pay = BASE_RATE_DOLLARS_PER_HOUR +TALL_THIN_BONUS_DOLLARS_PER_HOUR+ TRAVEL_BONUS_DOLLARS_PER_HOUR;
        }
        if (height >= TALL_INCHES && weight <=THIN_POUNDS && smokes == true && canTravel == true)
        {
            return pay = BASE_RATE_DOLLARS_PER_HOUR - SMOKER_DEDUCTION_DOLLARS_PER_HOUR + TALL_THIN_BONUS_DOLLARS_PER_HOUR + TRAVEL_BONUS_DOLLARS_PER_HOUR;
        }
        if (smokes == true)
        {
            return pay = BASE_RATE_DOLLARS_PER_HOUR - SMOKER_DEDUCTION_DOLLARS_PER_HOUR;
        }
        if (canTravel == true)
        {
            return pay = BASE_RATE_DOLLARS_PER_HOUR + TRAVEL_BONUS_DOLLARS_PER_HOUR;
        }
        else
        {
            return pay  = BASE_RATE_DOLLARS_PER_HOUR;
        }
    }

    /**
     * @param print details
     */
    public void printDetails()
    {
        System.out.println("Name: " + getFirstName() + " " + getLastName());
        System.out.println("Height: " + getHeight() + " inches");
        System.out.println("Weight: " + Math.round(getWeight()) + " pounds");
        if (canTravel == true){
            System.out.println("Does travel");
        }else{
            System.out.println("Does not travel");
        }
        if (smokes == true){
            System.out.println("Does smoke");
        }else{
            System.out.println("Does not smoke");
        }
    }

    /**
     * @param display model details
     */
    public void displayModelDetails()
    {
        System.out.println("Name: " + getFirstName() + " " + getLastName());
        System.out.println("Height: " + getHeightInFeetAndInches());
        System.out.println("Weight: " + getWeight() + " pounds");
        if (canTravel == true)
        {
            System.out.println ("Travels: yep");
        }
        else
        {
            System.out.println ("Travels: nope");
        }
        if (smokes == true)
        {
            System.out.println ("Smokes: yep");
        }
        else
        {
            System.out.println ("Smokes: nope");
        }
        System.out.println ("Hourly rate: $ " + calculatePayDollarsPerHour());
    }

    /**
     * @param display model details in metric units
     */
    public void displayModelDetails(boolean metricUnits)
    {
        if (metricUnits == true)
        {
            System.out.println("Name: " + getFirstName() + " " + getLastName());
            System.out.println("Height: " + Math.round(getHeight()*INCH_TO_CM) + " cm");
            System.out.println("Weight: " + getWeightKg() + " kg");
            if (canTravel == true)
            {
                System.out.println ("Travels: yep");
            }
            else
            {
                System.out.println ("Travels: nope");
            }
            if (smokes == true)
            {
                System.out.println ("Smokes: yep");
            }
            else
            {
                System.out.println ("Smokes: nope");
            }
            System.out.println ("Hourly rate: $ " + calculatePayDollarsPerHour());
        }
        else displayModelDetails();
    }
}