/**
 * Lab 6B - BCIT Student A01029917 - Course Comp-1409-0 Intro Software Development 1 - 55053
 * 
 * @author Andrew Hewitson
 * @version May 27, 2017
 */
public class HistoricalMoment
{
    private String eventName;
    private ClockDisplay timeOfEvent;

    public static final int FIRST_MORNING_HOUR  = 0;
    public static final int LAST_MORNING_HOUR   = 11;
    public static final int FIRST_EVENING_HOUR  = 12;
    public static final int LAST_EVENING_HOUR   = 23;
    public static final int MINUTES_HOUR        = 60;
    public static final String MORNING_SUFFIX   = "a.m.";
    public static final String EVENING_SUFFIX   = "p.m.";
    public static final int MIDNIGHT_HOUR       = 24;
    public static final int HOURS_PER_DAY       = 24;
    public static final int MINUTE_ZERO         = 00;
    
    /**
     *  constructor for Clock Class to create Historical Moment
     */

    public void HistoricalMoment()
    {
        eventName = "untitled event";
        timeOfEvent = new ClockDisplay (MIDNIGHT_HOUR, MINUTE_ZERO);
    }

    /**
     *  constructor to get name of historical event
     */

    public HistoricalMoment(String nameOfTheEvent)
    {
        if ((nameOfTheEvent == null)|| (nameOfTheEvent.equals("")))
        {
            eventName = "untitled event";
            timeOfEvent = new ClockDisplay (MIDNIGHT_HOUR, MINUTE_ZERO);
        }
        else
        {
            eventName = nameOfTheEvent;
            timeOfEvent = new ClockDisplay (MIDNIGHT_HOUR, MINUTE_ZERO);
        }

    }
    
    /**
     *  constructor to get name of event and time of event
     */
    public HistoricalMoment(String nameOfTheEvent, ClockDisplay theTime)
    {      
        if ((nameOfTheEvent == null)|| (nameOfTheEvent.equals("")))
        {
            eventName = "untitled event";
            timeOfEvent = new ClockDisplay (MIDNIGHT_HOUR, MINUTE_ZERO);
        }
        else
        {
            eventName = nameOfTheEvent;
            timeOfEvent = theTime;
        }
    }   

    /**
     * @param add minute to the time of event
     */

    public void addMinuteToTimeOfEvent()
    {
        timeOfEvent.timeTick();
    }

    /**
     * @param print details of historical event
     */
    public void PrintDetails()
    {
        System.out.println("At " + timeOfEvent.getTime() + ", " + eventName + "!");
    }

}
