
/**
 * Write a description of class Movie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Movie
{
    private int     yearReleased;
    private String  title;
    
    public Movie(int   theYearReleased, String theTitle){
            if (theYearReleased>= 1895){
                
               yearReleased = theYearReleased;
        }
        if (theTitle != null){
             title = theTitle;
            
    }
}
}