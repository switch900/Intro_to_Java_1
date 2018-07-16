
/**
 * Lab 4A - BCIT Student 
 * 
 * @author Andrew Hewitson
 * @version May 9, 2017
 */
public class BCITStudent
{
    private String lastName;
    private String firstName;
    private int yearBorn;
    private String sex;
    public static final String homeProvince = "British Columbia";
    public static String schoolMotto = "It's your career. Get it right!";

    /**
     * Constructor for objects of class BCITStudent
     * @param students last name that is greater than 3 and not null
     * @param students first name that is greater than 3 and not null
     * @param year the student was born that is between 1900 and 2000
     * @param sex of student 
     */

    public BCITStudent(String theLastName,String theFirstName,int theYearBorn,String theSex,String theSchoolMotto, String theHomeProvince)
    {
        if (theLastName != null && theLastName.length() >=3)
        {
            lastName = theLastName;
        }

        if (theFirstName!= null && theFirstName.length() >=3)
        {
            firstName = theFirstName;
        }

        if (theYearBorn >=1900 && theYearBorn <=2000)
        {
            yearBorn = theYearBorn;
        }

        
        sex = theSex;
        
    }

    /**
     * @return the Student's lastName if longer than 3 letters and not null
     */
    public String getLastName()
    {
       
            return lastName;
       
        
    }

    /**
     * @return the student's first name if longer than 3 letters and not null
     */
    public String getFirstName()
    {
        
            return firstName;
       
        
    }

    /**
     * @return the year the student was born if between 1900 and 2000
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
        if (sex =="male") 
        { 
            return sex;
        }
        else if (sex == "female")
        {
            return sex;
        }
        else
        {
            return sex = "invalid text";
        }
    }

    /**
     * @param replace student's last name with new last name that is longer than 3 letters and not null
     */
    public void setNewLastName(String newLastName)
    {
        if ((newLastName != null) && (newLastName.length() >=3))
        {
            lastName = newLastName;
        }
       
    }

    /**
     * @param replace student's first name with new first name that is longer than 3 letters and not null
     */
    public void setNewFirstName(String newFirstName)
    {
        if ((newFirstName != null) && (newFirstName.length() >=3))
        {
            firstName = newFirstName;
        }
        
    }

    /**
     * @param replace year born with new year born that is between 1900 and 2000
     */
    public void setNewYearBorn(int newYearBorn)
    {
        if ((newYearBorn >= 1900) && (newYearBorn <= 2000))
        {
            yearBorn = newYearBorn;
        }
       

    }

    /**
     * @param replace students sex with new sex that is either male or female
     */
    public void setNewSex (String newSex)
    {
        if (newSex == "male") 
        { 
            sex = newSex;
        }
        else if (newSex == "female")
        {
            sex = newSex;
        }
        else
        {
            sex = "invalid text";
        }
    }

    /**
     * @param replace motto with new motto
     */
    public static void setNewMotto (String newMotto)
    {
        schoolMotto = newMotto;
    }

    public void printDetails()
    {
        {
            System.out.println(firstName + " " + lastName);
        }

        if (yearBorn == 0)
        {
            System.out.println ("invalid number");
        }
        else
        {
            System.out.println(yearBorn);
        }

        System.out.println(sex);
        System.out.println(homeProvince);
        System.out.println(schoolMotto);
    }

}

