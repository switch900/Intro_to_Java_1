
/**
 * In Class work - Lesson 3
 * 
 * @Andrew   
 * @version (a version number or a date)
 */
public class Car
{
    private String make;
    private int numDoors;

    public Car(String theMake, int newNumDoors)
    {
        if(theMake != null &&theMake.length()> 3)
        {
            make = theMake;
        }

        if(newNumDoors >=2 && newNumDoors <=6)
        {
            numDoors = newNumDoors;
        }
        else
        {
            System.out.println(newNumDoors + " is not between 2 and 6");
        }
        
        if (newNumDoors <2)
        {
            System.out.println(newNumDoors + " is too low");
        }
        
        if (newNumDoors >6)
        {
            System.out.println(newNumDoors + " is too high");
        }
        else
        {
            numDoors = newNumDoors;
        }

    }

    /** 
     * 
     * @return returns the make of the car
     */
    public String getMake()
    {
        return make;
    }

    /**
     * Accessor
     * @return the number of doors on the car
     */
    public int getNumDoors()
    {
        return numDoors;
    }

    /**
     *Mutator
     *@param newMake the new make of the car
     */
    public void setMake(String newMake)
    {
        if(newMake != null && newMake.length()> 3)
        {
            make = newMake;
        }
    }
    /**
     * Mutator
     * @param newNumDoors the new number of doors
     * 
     */

    //public void setNumDoors (int newNumDoors)
    //{
    //    if newNumDoors !
    //}
    //
    /**
     * Print Method
     * 
     */
    public void printCar()
    {
        System.out.print("\n\n The Make of the car is " + make);
        System.out.println("\n\n It has " + numDoors + " doors.");
    }
}    
