/**
 * Lab 4A - BCIT Student 
 * 
 * @author Andrew Hewitson
 * @version May 16, 2017
 */
public class BCITStudent
{
    private String lastName;
    private String firstName;
    private int yearBorn;
    private String sex;
    public static final String homeProvince = "British Columbia";
    public static String schoolMotto = "It's your career. Get it right!";
    public static final int MINIMUM_NAME_LENGTH_LETTERS = 3;
    public static final int CURRENT_YEAR = 2017;
    public static final int OLDEST_YEAR = 1900;
    public static final int YOUNGEST_YEAR = 2000;

    /**
     * Constructor for objects of class BCITStudent
     * @param students last name that is greater than minimum name length and not null
     * @param students first name that is greater than minimum name length and not null
     * @param year the student was born in that is between oldest year and youngest year
     * @param sex of student 
     */

    public BCITStudent(String theLastName,String theFirstName,int theYearBorn,String theSex)
    {
        if (theLastName != null && theLastName.length() >= MINIMUM_NAME_LENGTH_LETTERS)
        {
            lastName = theLastName;
        }

        if (theFirstName!= null)
        {
            firstName = theFirstName;
        }
        if (theYearBorn >=OLDEST_YEAR && theYearBorn <=YOUNGEST_YEAR)
        {
            yearBorn = theYearBorn;
        }
        if (theSex.equals("male")) 
        {
            sex = theSex;
        }
        else if (theSex.equals("female"))
        {
            sex = theSex;
        }
    }

    /**
     * @return the Student's lastName
     */
    public String getLastName()
    {    
        return lastName;   
    }

    /**
     * @return the student's first name 
     */
    public String getFirstName()
    {
        return firstName;  
    }

    /**
     * @return the year the student was born 
     */
    public int getYearBorn()
    {
        return yearBorn;   
    }

    /**
     * @return sex of student if male or female
     */
    public String getSex()
    {        
        return sex;
    }

    /**
     * @param replace student's last name with new last name that is longer than minimum name length and not null
     */
    public void setNewLastName(String newLastName)
    {
        if ((newLastName != null) && (newLastName.length() > MINIMUM_NAME_LENGTH_LETTERS))
        {
            lastName = newLastName;       
        }
    }

    /**
     * @param replace student's first name with new first name that is longer than minimum name length and not null
     */
    public void setNewFirstName(String newFirstName)
    {
        if (newFirstName != null)
        {
            firstName = newFirstName;       
        }
    }

    /**
     * @param replace year born with new year born that is between oldest and youngest year
     */
    public void setNewYearBorn(int newYearBorn)
    {   if ((newYearBorn >= OLDEST_YEAR) && (newYearBorn <= YOUNGEST_YEAR))
        {
            yearBorn = newYearBorn;       
        }
    }

    /**
     * @param replace students sex with new sex that is either male or female
     */
    public void setNewSex (String newSex)
    {
        if (newSex.equals ("male"))
        { 
            sex = newSex;
        }
        else if (newSex.equals ("female"))
        {
            sex = newSex;
        }
    }

    /**
     * @param replace motto with new motto
     */
    public static void setNewMotto (String newMotto)
    {
        schoolMotto = newMotto;
    }

    /**
     * @param make school Motto upper case
     */
    private static String upperCaseMotto()
    {
        return schoolMotto.toUpperCase();
    }

    /**
     * @return print details
     */
    public void printDetails()
    { 
        System.out.print(firstName + " " + lastName + " (" + sex + ") is " + (CURRENT_YEAR - yearBorn)+ " years old. ");
        if (sex.equals ("male"))
        {
            System.out.print("His");
        }
        if (sex.equals ("female"))
        {
            System.out.print("Her");
        }
        System.out.print(" home province is " + homeProvince + " and ");
        if (sex.equals("male"))
        {
            System.out.print ("his");
        }
        if (sex.equals("female"))
        {
            System.out.print("her"); 
        }
        System.out.print(" school's motto is: " + upperCaseMotto());
    }

}

