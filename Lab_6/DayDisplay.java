/**
 * Lab 6 - BCIT Student A01029917 - Course Comp-1409-0 Intro Software Development 1 - 55053
 * 
 * @author Andrew Hewitson
 * @version May 23, 2017
 */
public class DayDisplay
{
    private NumberDisplay dayNumber;

    public static final int NUMBER_OF_DAYS_IN_WEEK=7;
    public static final int SUNDAY = 0;
    public static final int MONDAY = 1;
    public static final int TUESDAY = 2;
    public static final int WEDNESDAY = 3;
    public static final int THURSDAY = 4;
    public static final int FRIDAY = 5;
    public static final int SATURDAY = 6;

    public static final String SUNDAY_STRING = "Sunday";
    public static final String MONDAY_STRING = "Monday";
    public static final String TUESDAY_STRING = "Tuesday";
    public static final String WEDNESDAY_STRING = "Wednesday";
    public static final String THURSDAY_STRING = "Thursday";
    public static final String FRIDAY_STRING = "Friday";
    public static final String SATURDAY_STRING = "Saturday";

    /**
     * constructor for Class NumberDisplay to get the Day Number
     */

    public DayDisplay(int theDayNumber)
    {
        dayNumber = new NumberDisplay (NUMBER_OF_DAYS_IN_WEEK);
        dayNumber.setValue(theDayNumber); 
    }

    /**
     * constructor for Class NumberDisplay to get the name of the day
     */

    public DayDisplay(String nameOfTheDay)
    {      
        if(nameOfTheDay != null)

        {
            if(nameOfTheDay.equalsIgnoreCase(SUNDAY_STRING))
            {
                dayNumber = new NumberDisplay(NUMBER_OF_DAYS_IN_WEEK);
                dayNumber.setValue(SUNDAY);
            }
            else if (nameOfTheDay.equalsIgnoreCase(MONDAY_STRING))
            {
                dayNumber = new NumberDisplay (NUMBER_OF_DAYS_IN_WEEK);
                dayNumber.setValue(MONDAY);
            }
            else if(nameOfTheDay.equalsIgnoreCase(TUESDAY_STRING))
            {
                dayNumber = new NumberDisplay(NUMBER_OF_DAYS_IN_WEEK);
                dayNumber.setValue(TUESDAY);
            }
            else if(nameOfTheDay.equalsIgnoreCase(WEDNESDAY_STRING))
            {
                dayNumber = new NumberDisplay(NUMBER_OF_DAYS_IN_WEEK);
                dayNumber.setValue(WEDNESDAY);
            }
            else if(nameOfTheDay.equalsIgnoreCase(THURSDAY_STRING))
            {
                dayNumber = new NumberDisplay(NUMBER_OF_DAYS_IN_WEEK);
                dayNumber.setValue(THURSDAY);
            }
            else if(nameOfTheDay.equalsIgnoreCase(FRIDAY_STRING))
            {
                dayNumber = new NumberDisplay(NUMBER_OF_DAYS_IN_WEEK);
                dayNumber.setValue(FRIDAY);
            }
            else if(nameOfTheDay.equalsIgnoreCase(SATURDAY_STRING))
            {
                dayNumber = new NumberDisplay(NUMBER_OF_DAYS_IN_WEEK);
                dayNumber.setValue(SATURDAY);
            }   
            else
            {
                dayNumber.setValue(SUNDAY);
            }
        }
    }

    /**
     * constructor to assign parameter to the dayNumber variable
     */

    public DayDisplay(NumberDisplay day)
    {    
        if (day != null)
        {
            dayNumber.getValue();
        }
    }

    /**
     * @return day of the week
     */

    public String getDayOfTheWeek()
    {
        if (dayNumber.getValue() == SUNDAY)
        {
            return SUNDAY_STRING;
        }
        if (dayNumber.getValue() == MONDAY)
        {
            return MONDAY_STRING;
        }
        if (dayNumber.getValue() == TUESDAY)
        {
            return TUESDAY_STRING;
        }
        if (dayNumber.getValue() == WEDNESDAY)
        {
            return WEDNESDAY_STRING;
        }
        if (dayNumber.getValue() == THURSDAY)
        {
            return THURSDAY_STRING;
        }
        if (dayNumber.getValue() == FRIDAY)
        {
            return FRIDAY_STRING;
        }
        if (dayNumber.getValue() == SATURDAY)
        {
            return SATURDAY_STRING;
        }
        else
        {
            return SUNDAY_STRING;
        }
    }

    public void incrementDay()
    {  
        {
            dayNumber.increment();
        }   
    }

    public String getWhatDayIsTomorrow()
    {
        if (dayNumber.getValue() == SUNDAY)
        {
            return MONDAY_STRING;
        }
        if (dayNumber.getValue() == MONDAY)
        {
            return TUESDAY_STRING;
        }
        if (dayNumber.getValue() == TUESDAY)
        {
            return WEDNESDAY_STRING;
        }
        if (dayNumber.getValue() == WEDNESDAY)
        {
            return THURSDAY_STRING;
        }
        if (dayNumber.getValue() == THURSDAY)
        {
            return FRIDAY_STRING;
        }
        if (dayNumber.getValue() == FRIDAY)
        {
            return SATURDAY_STRING;
        }
        if (dayNumber.getValue() == SATURDAY)
        {
            return SUNDAY_STRING;
        }
        else
        {
            return SUNDAY_STRING;
        }
    }

    public void printDetails()
    {
        System.out.println("Today is day " + dayNumber.getValue() + " which is " + getDayOfTheWeek() + "!");

    }
}
