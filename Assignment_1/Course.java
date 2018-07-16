/**
 * Project - Assignment 1 - course Comp-1409-0 Intro Software Development 1 - 55053
 * 
 * @author  Andrew Hewitson 
 * 
 * @version 2017/04/29
 */
public class Course
{
    private String department;
    private int number;
    private String name;
    private double price;
    private boolean isFull;
    private static final String SCHOOL_NAME = "BCIT";
    private static String motto = "To Each Their Highest Attainment.";

    public static final int LOWEST_COURSE_NUMBER = 1000;
    public static final int HIGHEST_COURSE_NUMBER = 6000;
    public static final double LOWEST_PRICE = 400;
    public static final double HIGHEST_PRICE = 500;
    public static final int SHORTEST_COURSE_NAME = 0;
    public static final String DEFAULT_NAME = null;
    public static final String DEFAULT_DEPARTMENT = null;
    public static final int DEFAULT_NUMBER = 0;
    public static final double DEFAULT_PRICE = 0.0;
    public static final boolean DEFAULT_IS_FULL = false;

    public Course(){}

    /**
     * Constructor for objects of class Course
     * @param   department must be "COMP", "COMM" or "MATH or print error message
     * @param   Course number must be between 1000 - 6000 inclusive or print error message
     * @param   Course name must be nullor print error message
     * @param   price must be between 400-500 inclusive or print error message
     * @param   isFull must be true or false 
     */
    public Course(String theDepartment, int theNumber, String courseName, double coursePrice, boolean isFull)
    {
        setDepartment(theDepartment);

        setNumber(theNumber);

        setName(courseName);

        setIsFull(isFull);

        setPrice(coursePrice);    
    }

    /**
     * @return  course Name 
     */
    public String getName()
    {
        return name;
    }

    /**
     * @return  Department Name
     */
    public String getDepartment()
    {
        return department;
    }

    /**
     * @return  Course Number 
     */
    public int getNumber()
    {
        return number;
    }

    /**
     * @return  Course Price 
     */
    public double getPrice()
    {
        return price;
    }

    /**
     * @return  Is Course Full?
     */
    public boolean isFull()
    {
        return isFull;
    }

    /**
     * @return School Mottto
     */

    public static String getMotto()
    {
        return motto;
    }

    /**
     * @return School Name
     */

    public static final String getSCHOOL()
    {
        return SCHOOL_NAME;
    }

    /**
     * @param Change Department
     */

    public void setDepartment(String newDepartment)
    {
        if (newDepartment=="MATH" || newDepartment=="COMP" || newDepartment=="COMM")
        {    
            department = newDepartment; 
        }
        else 
        {
            System.out.println("ECOM is not a valid department.");
            department = DEFAULT_DEPARTMENT;
        }
    }

    /**
     * @param Change Course Number
     */

    public void setNumber (int newNumber)
    {         
        if (newNumber < LOWEST_COURSE_NUMBER)
        {
            System.out.println(newNumber+" as a course number is too low.");
            number = DEFAULT_NUMBER;
        }
        else if (newNumber > HIGHEST_COURSE_NUMBER)
        {
            System.out.println(newNumber+" as a course number is too high.");
            number = DEFAULT_NUMBER;
        }
        else
        {
            number = newNumber;
        }
    }

    /**
     * @param Change Course Name
     */

    public void setName(String setName)
    {  
        if (setName==DEFAULT_NAME)
        {        
            System.out.println("A course name was not provided.");
        }
        else if (setName.length() <= SHORTEST_COURSE_NAME)
        {
            name = DEFAULT_NAME;
            System.out.println("A course name was not provided.");
        }
        else
        {
            name = setName;
        }
    }

    /**
     * @param Change Price of Course
     */
    public void setPrice(double setPrice)
    {
        if (setPrice < LOWEST_PRICE)
        {
            price=DEFAULT_PRICE;
            System.out.println(setPrice + " for the price is too low."); 
        }
        else if (setPrice > HIGHEST_PRICE)
        {
            price = DEFAULT_PRICE;
            System.out.println(setPrice + " for the price is too high.");
        }
        else
        {
            price = setPrice;
        }
    }

    /**
     * @param Change If Course Is Full
     */
    public void setIsFull(boolean setIsFull)
    {   
        if (setIsFull==DEFAULT_IS_FULL)
        {
            isFull = false;
        }
        else
        {
            isFull = true;
        }
    }

    /**
     * @param Change School Motto
     */
    public static void setMotto (String setMotto)

    {
        motto = setMotto;
    }

    /**
     * return Print Course Details
     */

    public void getCourseDetails()
    {    
        if (department=="MATH")
        {
            department = department;
            // System.out.print(department + " ");
        }
        else if (department=="COMP")
        {
            department = department;

            //System.out.print(department + " ");
        }
        else if (department=="COMM")
        {
            department = department;

            //System.out.print(department + " ");
        } 
        if (department==DEFAULT_DEPARTMENT)
        {
            System.out.println("Sorry, there is an error with the course department.");      
            return;
        }    

        if (number ==DEFAULT_NUMBER)
        {
            System.out.println("Sorry, there is an error with the course number.");
            return;
        }
        else
        {
            number = number;
        }

        if (name==DEFAULT_NAME)
        {
            System.out.println("Sorry, there is an error with the course name.");
            return;
        }
        else
        {
            name=name;
        }

        if(price == DEFAULT_PRICE)
        {   
            System.out.println("Sorry, there is an error with the course price.");
            return;
        }
        else
        {
            price = price;
        }

        System.out.println(department + " " + number + " is " + name + ".");

        if (isFull ==DEFAULT_IS_FULL)
        {
            System.out.println("The course currently is not full.");
        }
        else
        {
            System.out.println("The course currently is full.");
        }

        System.out.println("The course is being run at " + SCHOOL_NAME +", " + "where their motto is \"" + motto+"\"");
    }

}
