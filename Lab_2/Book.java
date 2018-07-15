/**
 * Project: Lab 2 - About a Book
 *  
 * @ Author Andrew Hewitson 
 * @ Version 1.0
 */

public class Book
{
    //this is the title of the book//
    private String title;          
    //this is the year the book was published//
    private int yearPublished;
    private String genre;//the genre of the book//
    //true if the book is paperback//
    private  boolean isPaperback;
    /*this
     * is
     * a
     * multiline
     * comment
     */
    /**
     * Main constructor
     * @ param theTitle the title for the book
     * @ param yearPub the year the book was published
     * @ param theGenre the genre of the book
     * @ param newIsPaperback true if the book is paperbook
     */
    public Book(String theTitle,int yearPub, String theGenre,boolean newIsPaperback)
    {
            if(theTitle != null && theTitle.length() > 3) //this will be on quiz//
                {
                    title = "You did not enter a title";
                } 
            if(yearPub >= 1895)
                {yearPublished = yearPub;
                }
            if (theGenre != null && theGenre.equalsIgnoreCase("Fantasy") || 
                                    theGenre.equalsIgnoreCase("Drama") ||
                                    theGenre.equalsIgnoreCase("Sci-Fi"))
              {
                  genre = theGenre;
                }
           isPaperback = newIsPaperback;
        }
        
        public boolean isThisBookPaperBack()
        {
            if (isPaperback == true){
                return true;
            }else
            {
                return false;
            }
        }
                    
                      
//             title =         theTitle;
//             yearPub = yearPublished;
//             genre =         theGenre;
//             isPaperback =   newIsPaperback;
//             
            
    }
    
    
    
    


    