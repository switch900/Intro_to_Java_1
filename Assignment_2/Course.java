/**
 * Assignment 2 - BCIT Student A01029917 - Course Comp-1409-0 Intro Software Development 1 - 55053
 * Course Class
 * 
 * @author Andrew Hewitson
 * @version May 16, 2017
 */
public class Course
{
    private Instructor instructor;  
    private Date start;             //start date of the course
    private Date end;               //end date of the course
    private int number;             //course number e.g. 1409
    private String title;           // e.g. Introduction to Java
    private String department;      // COMP
    
    public static final int LOWEST_COURSE_NUMBER = 1000;
    public static final int HIGHEST_COURSE_NUMBER = 6000;
    public static final int DEFAULT_COURSE_NUMBER = 1409;
    public static final String DEFAULT_COURSE_TITLE = "Introduction to Java";
    public static final String DEFAULT_COURSE_DEPARTMENT = "COMP";

    /**
     * Default Constructor That Returns Defaults From Instructor Class, Date Class, Title As "Introduction To Java", Department As "COMP", And Number As 1409
     */
    public Course()
    {
        instructor = new Instructor();
        start = new Date();
        end = new Date();
        title = DEFAULT_COURSE_TITLE;
        department = DEFAULT_COURSE_DEPARTMENT;
        number = DEFAULT_COURSE_NUMBER;
    }

    /**
     * Creates Constuctor That Returns Parameters From Instructor Class and Date Class And New Paramters for Number, Title and Departments
     */
    public Course(Instructor instructor, Date start, Date end, int number, String title, String department)
    {
        setInstructorName(instructor);    

        if (start != null)
        {
            this.start = start;
        }
        else
        {
            this.start = new Date();
        }
        if (end != null)
        {
            this.end = end;
        }
        else
        {
            this.end = new Date();
        }
        
        setNumber(number);
        setTitle(title);
        setDepartment(department);
    }

    /**
     * @return Parameter From Instructor Class
     */
    public Instructor getInstructor()
    {
        return instructor;
    }

    /**
     * @return Parameter From Date Class
     */
    public Date getDateStart()
    {
        return start;
    }

    /**
     * @return Parameter From Date Class
     */
    public Date getDateEnd()
    {
        return end;
    }

    /**
     * @return New Number For Course
     */
    public int getNumber()
    {
        return number;
    }

    /**
     * @return New Title For Course
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * @return New Department For Course
     */
    public String getDepartment()
    {
        return department;
    }

    /**
     * @return Instructor's Name
     */
    public String getInstructorName()
    {   
        return instructor.getName().getFullName().toString();
    }

    /**
     * @param Get New Instructor's Name
     */
    public void setInstructorName(Instructor instructor)
    {
        if (instructor != null)
        {
            this.instructor = instructor;                      
        }
        else
        {
            this.instructor = new Instructor();      
        }
    }

    /**
     * @param Get New Number For Course
     */
    public void setNumber(int number)
    {
        if (number >=LOWEST_COURSE_NUMBER && number <=HIGHEST_COURSE_NUMBER)
        {
            this.number = number;
        }
        else
        {
            this.number = DEFAULT_COURSE_NUMBER;
        }
    }

    /**
     * @param Get New Title For Course
     */
    public void setTitle(String title)
    {
        if (title == null)
        {
            this.title = DEFAULT_COURSE_TITLE;
        }
        else
        {
            this.title = title;
        }      
    }

    /**
     * @param Get New Department For Course
     */
    public void setDepartment(String department)
    {
        if(department == null)
        {
            this.department = DEFAULT_COURSE_DEPARTMENT; 
        }
        else if(department.equals("COMM") || department.equals("COMP"))
        {
            this.department = department;
        }
        else
        {
            this.department = DEFAULT_COURSE_DEPARTMENT;            
        }
    }

    /**
     * @param Print Details Of Course
     */
    public void printDetails()
    {
        System.out.println(department + " " + number + " is " + title + ".");
        System.out.println("The course runs from " + start.getStringDate() +  " to " + end.getStringDate() + ".");
        System.out.println("The instructor is " + getInstructor().getName().getFullName() + ", who has been teaching since " + instructor.getDateStarted().getStringDate() +".");
    }
}