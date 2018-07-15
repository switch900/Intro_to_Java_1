/**
 * Project: Lab 2A - course Comp-1409-0 Intro Software Development 1 - 55053
 * 
 * @author Andrew Hewitson 
 * 
 * @version 1.0
 */
public  class   Student
{
    private String  firstName;               // the first name of the student
    private String  lastName;                // the last name of the student
    private int     studentIdNumber;          /*student's school identification number*/
    private String  emailAddress;            /* student's email address*/
    private int     numberOfCoursesCompleted;/*total number of courses student has completed*/
    private double  gradePercentage;         /*student's overall grade in percentage*/
    private boolean studentIsInGoodStanding; /*is student in good or bad standing?*/
    
    /**
     * Another constructor.
     * @param firstName                 -   student's first name
     * @param lastName                  -   student's last name
     * @param studentIdNumber           -   student's ID number   
     * @param emailAddress              -   student's email address
     * @param numberOfCoursesCompleted  -   total number of courses the student has completed
     * @param gradePercentage           -   student's overall grade in percentage
     * @param studentIsInGoodStanding   -   is the student in good or bad standing
     */
    
    public Student(String theFirstName, String theLastName, int theStudentIdNumber, String theEmailAddress, int theNumberOfCoursesCompleted, double theGradePercentage, boolean theStudentIsInGoodStanding)
    
        {   
            firstName                   = theFirstName;
            lastName                    = theLastName;
            studentIdNumber             = theStudentIdNumber;
            emailAddress                = theEmailAddress;
            numberOfCoursesCompleted    = theNumberOfCoursesCompleted;
            gradePercentage             = theGradePercentage;
            studentIsInGoodStanding     = theStudentIsInGoodStanding;
        }
     
    public String getLetterGrade(double gradePercentage)
        {
            if (gradePercentage >=90)
                  {
                    return "A";
                  }
            if (gradePercentage >=80)
                  {
                    return "B";
                  }
            if (gradePercentage >=70)
                  {
                    return "C";
                  }
            if (gradePercentage >=60)
                  {
                    return "D";
                  } 
       }
        }
                        
                
                   






   