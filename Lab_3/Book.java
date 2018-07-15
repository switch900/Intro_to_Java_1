
/**
 * Lab 3A - Book 
 * 
 * @author Andrew Hewitson
 * @version May 3, 2017
 */
public class Book
{
    private String title;
    private int ISBN;
    private String lastName;
    private String firstName;
    private int yearPublished;
    private int monthPublished;
    private String fullName;
    private String monthName;

    /**
     * Constructor for objects of class Book
     * @param  books title 
     * @param Books ISBN 
     * @param authors Last Name must not be null and more than 3 letters or it is invalid text
     * @param author's First Name must not be null and more than 3 letters or it is invalid text
     * @param year published 
     * @param month published 
     * 
     */
    public Book(String booksTitle, int booksISBN, String authorsLastName, String authorsFirstName, int yearBookPublished, int monthBookPublished)
    {
        {
            title = booksTitle;
        }       
        {
            ISBN = booksISBN;
        }
         if (authorsLastName != null && authorsLastName.length() >=3)
        {
            lastName = authorsLastName;
        }
        else
        {
            lastName = "invalid text";
        }
         if (authorsFirstName != null && authorsFirstName.length() >=3)
        {
            firstName = authorsFirstName;
        }
        else
        {
            firstName = "invalid text";
        }
        {
            yearPublished = yearBookPublished;
        }
        if  (monthBookPublished >=1 && monthBookPublished <=12)
        {
            monthPublished = monthBookPublished;
        }
    }

    /**
     * @return the booksTitle
     */

    public String gettitle()
    {
        return title;
    }

    /** 
     * @return the ISBN
     */
    public int getISBN()
    {
        return ISBN;
    }

    /**
     * * @return the authorsLastName
     */
    public String getlastName()
    {
        return lastName;
    } 

    /**
     * @return the authorsFirstName
     */
    public String getfirstName()
    {
        return firstName;
    } 

    /**
     * @return the yearPublished
     */
    public int getyearPublished()
    {
        return yearPublished;
    } 

    /**
     * @return the monthPublished
     */
    public int getmonthPublished()
    {
        return monthPublished;
    }

    /**
     * Mutators
     * @param replace book title with newTitle
     */
    public void setTitle(String newTitle)
    {
        {
            title = newTitle;
        }
    }

    /**
     * @param replace ISBN with newISBN
     */ 
    public void setISBN(int newISBN)
    {
        {
            ISBN = newISBN;
        }
    }

    /**
     * @param replace authors Last Name with newLastName that must not be null and must be more than 3 characters or invalid text
     */
    public void setLastName(String newLastName)
    {
        if (newLastName != null && newLastName.length() >=3)
        {
            lastName = newLastName ;
        }
        else
        {
            lastName = "invalid text";
        }
    }

    /**
     * @param replace authors First Name with newFirstName that must not be null and must be more than 3 characters or invalid text
     */
    public void setFirstName(String newFirstName)
    {     
        if (newFirstName != null && newFirstName.length() >=3)
        {
            firstName = newFirstName;
        }
        else
        {
            firstName = "invalid text";
        }
    }

    /**
     * @param replace yearPublished with newYearPublished
     */
    public void setYearPublished(int newYearPublished)
    {
        {
            yearPublished = newYearPublished;
        }
    }

    /**
     * @param replace monthPublished with newMonthPublished
     */
    public void setMonthPublished(int newMonthPublished)
    {
        {
            monthPublished = newMonthPublished;
        }
    }

    /**
     * param get Author's full name
     */

    public String getFullName()
    {
        return fullName = firstName+" "+lastName;
    }

    /**
     * @param replace monthPublished with full name of Month
     * 
     */
    public String getMonthName()
    {
        if (monthPublished == 1)
        {
            return monthName = "January";
        }
        else if

        (monthPublished == 2)
        {
            return monthName = "February";
        }
        else if
        (monthPublished == 3)
        {
            return monthName = "March";
        }
        else if        
        (monthPublished == 4)
        {
            return monthName = "April";
        }
        else if
        (monthPublished == 5)
        {
            return monthName = "May";
        }
        else if
        (monthPublished == 6)
        {
            return monthName = "June";
        }
        else if
        (monthPublished ==7)
        {
            return monthName = "July";
        }
        else if
        (monthPublished == 8)
        {
            return monthName = "August";
        }
        else if
        (monthPublished == 9)
        {
            return monthName = "September";
        }
        else if
        (monthPublished == 10)
        {
            return monthName = "October";
        }
        else if 
        (monthPublished == 11)
        {
            return monthName = "November";
        }
        else if
        (monthPublished == 12)
        {
            return monthName = "December";
        }
        else
        {
            return monthName = "invalid text";
        }
    }

    /**
     * @return print details
     * 
     */
    public void printDetails()
    {
        if (title != null && title.length() >=3)    
        {
            System.out.println("Title : " + title);
            
        }
        else
        {
            System.out.println("Title: invalid text");
        }
        if (ISBN >= 10000 && ISBN <= 20000)
        {
            System.out.println("ISBN " + ISBN);
        }
        else
        {
            System.out.println("ISBN: invalid number");
        }
        {
            System.out.println("Author: " + fullName);
        }
       
        if (monthName != null && monthName.length() >=0)
        {
            System.out.print("Published: " + monthName + " ");
        }

        if (yearPublished >=1870 && yearPublished <=2013)
        {
            System.out.print(yearPublished);
        }
        else
        {
            System.out.print("invalid number");
        }
    }
}