/**
 * Assignment 2 - BCIT Student A01029917 - Course Comp-1409-0 Intro Software Development 1 - 55053
 * Instructor Class
 * 
 * @author Andrew Hewitson
 * @version May 16, 2017
 */
public class Instructor
{
    private Name name;
    private Date started;
    
    /**
     * Create Default Constructor from Default parameters in Name Class and Date Class
     */

    public Instructor()
    {
        name = new Name();
        started = new Date();        
    }

    /**
     *  Create Constructor from Name Class and Date Class
     */
    public Instructor (Name name, Date started)
    {                  
        if(name != null)
        {
            this.name=name;
        }
        else 
        {
            this.name = new Name();
        }
        if(started!=null)
        {
            this.started = started;
        }  
        else
        {
            this.started = new Date();
        }
    }

    /**
     * Create Constructor from new first, new last, new middle, new year, new month and new day from parameters set in Name Class and Date Class
     */
    public Instructor (String first, String last, String middle, int year, int month, int day)     
    {
        if(first != null || last != null || middle != null)
        {
            this.name = new Name(first,last,middle);
        }
        else
        {
            this.name = new Name();
        }

        {
            this.started = new Date(year,month,day); 
        }       
    }

    /**
     * @return New Name From Parameters From Name Class
     */
    public Name getName()
    {
        return name;  
    }

    /**
     * @return New Date Started from Parameters From Date Class
     */
    public Date getDateStarted()

    {
        return started;
    }

    /**
     * @param Get New Name 
     */
    public void setName(Name name)
    {
        if(name != null)
        {
            this.name = name;
        }
        else
        {
            this.name = new Name();
        }    
    }

    /**
     * @param Get New Date Started
     */
    public void setDateStarted(Date started)
    {        
        {
            this.started = started;
        }       
    }

    /**
     * @return How Long They Have Taught For
     */
    public int howLongHaveTheyTaught()
    {
        return Date.CURRENT_YEAR - started.getYear();
    }   
}

