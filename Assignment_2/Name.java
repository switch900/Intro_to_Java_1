/**
 * Assignment 2 - BCIT Student A01029917 - Course Comp-1409-0 Intro Software Development 1 - 55053
 * Name Class
 * 
 * @author Andrew Hewitson
 * @version May 16, 2017
 */
public class Name
{
    private String first;
    private String middle;
    private String last;

    public static final int MINIMUM_NAME_LENGTH = 1;
    public static final int MAXIMUM_NAME_LENGTH = 40;

    /**
     * Create Default Constructor or set Name To "To Be Announced"
     */
    public Name()
    {
        {
            setFirstName("To");
        }
        {
            setMiddleName("Be");
        }
        {
            setLastName("Announced");
        }
    }

    /**
     * Create Constructor for Name that returns first, last and middle name
     */
    public Name(String first, String last,String middle)
    {
        {
            setFirstName(first);
        }
        {
            setMiddleName(middle);
        }
        {
            setLastName(last);
        }
    }

    /**
     * @return First Name
     */
    public String getFirstName()
    {
        return first;
    }

    /**
     * @return Middle Name
     */
    public String getMiddleName()
    {
        return middle;
    }

    /**
     * @return Last Name
     */
    public String getLastName()
    {
        return last;
    }

    /**
     * @param Get New First Name
     */
    public void setFirstName(String newFirst)
    {
        if (newFirst != null && newFirst.length() <= MAXIMUM_NAME_LENGTH && newFirst.length() >= MINIMUM_NAME_LENGTH)
        {
            first = newFirst.substring(0,1).toUpperCase()+ newFirst.substring(1).toLowerCase();
            middle = getMiddleName();
            last = getLastName();
        }
        else
        {
            first = "To";
            middle ="Be";
            last = "Announced";
        }
    }

    /**
     * @param Get New Last Name
     */
    public void setLastName(String newLast)
    {
        if (getFirstName() == "To" && getMiddleName() == "Be")
        {
            first = "To";
            middle ="Be";
            last = "Announced";
            return;
        }
        if (newLast != null && newLast.length() <= MAXIMUM_NAME_LENGTH && newLast.length() >= MINIMUM_NAME_LENGTH)
        {
            first = getFirstName();
            middle = getMiddleName();
            last = newLast.substring(0,1).toUpperCase()+ newLast.substring(1).toLowerCase();
        }
        else
        {
            first = "To";
            middle ="Be";
            last = "Announced";
        }
    }

    /**
     * @param Get New Middle Name
     */
    public void setMiddleName(String newMiddle)
    {
        if (getFirstName() == "To" || getLastName() == "Announced")
        {
            first = "To";
            middle ="Be";
            last = "Announced";
            return;
        }
        else if (newMiddle != null && newMiddle.length() <= MAXIMUM_NAME_LENGTH && newMiddle.length() >= MINIMUM_NAME_LENGTH)
        {
            first = getFirstName();
            middle = newMiddle.substring(0,1).toUpperCase()+ newMiddle.substring(1).toLowerCase();
            last = getLastName();
            return;
        }
        else if (newMiddle == "" || newMiddle == null)
        {
            first = getFirstName();
            middle = null;
            last = getLastName();
            return;
        }
        else
        {
            first = "To";
            middle ="Be";
            last = "Announced";
        }
    }

    /**
     * @return Name In Proper Case As Full Name From Parameters From First, Middle and Last Name
     */
    private String makePrettyName()
    {
        if (getMiddleName() != null)
        {
            return getFirstName().substring(0,1).toUpperCase()+ getFirstName().substring(1).toLowerCase() + " " + getMiddleName().substring(0,1).toUpperCase()+ getMiddleName().substring(1).toLowerCase() + " " + getLastName().substring(0,1).toUpperCase()+ getLastName().substring(1).toLowerCase();
        }
        else
        {
            return getFirstName().substring(0,1).toUpperCase()+ getFirstName().substring(1).toLowerCase() + " " + getLastName().substring(0,1).toUpperCase()+ getLastName().substring(1).toLowerCase();
        }
    }

    /**
     * @return Name As First Initials From First, Middle and Last Name 
     */ 
    public String getInitials()
    {
        String firstInitial = getFirstName();
        String middleInitial = getMiddleName();
        String lastInitial = getLastName();
        if (getFirstName() != null)
        {
            firstInitial = getFirstName().substring(0,1).toUpperCase()+".";            
        }
        if (getLastName()!= null)
        {
            lastInitial = getLastName().substring(0,1).toUpperCase()+".";             
        }
        if (getMiddleName()!= null)
        {
            middleInitial = getMiddleName().substring(0,1).toUpperCase()+".";        
        }
        if(middleInitial == null)
        {            
            return firstInitial + lastInitial;
        }
        else
        {       
            return firstInitial + middleInitial + lastInitial;    
        }
    }

    /**
     * @return Full Name From Results Of Method makePrettyName
     */
    public String getFullName()
    {
        return makePrettyName();
    }
}
