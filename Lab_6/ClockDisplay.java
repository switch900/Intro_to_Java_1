/**
 * The ClockDisplay class implements a digital clock display for a
 * European-style 24 hour clock. The clock shows hours and minutes. The 
 * range of the clock is 00:00 (midnight) to 23:59 (one minute before 
 * midnight).
 * 
 * The clock display receives "ticks" (via the timeTick method) every minute
 * and reacts by incrementing the display. This is done in the usual clock
 * fashion: the hour increments when the minutes roll over to zero.
 * 
 * @author Michael Kölling and David J. Barnes and Andrew Hewitson
 * @version 2017-05-17
 */
public class ClockDisplay
{
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String displayString;    // simulates the actual display

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
     * Constructor for ClockDisplay objects. This constructor 
     * creates a new clock set at 00:00.
     */
    public ClockDisplay()
    {
        hours = new NumberDisplay(HOURS_PER_DAY);
        minutes = new NumberDisplay(MINUTES_HOUR);
        {
            updateDisplay();
        }      
    }

    /**
     * Constructor for ClockDisplay objects. This constructor
     * creates a new clock set at the time specified by the 
     * parameters.
     */
    public ClockDisplay(int hour, int minute)
    {
        hours = new NumberDisplay(HOURS_PER_DAY);
        minutes = new NumberDisplay(MINUTES_HOUR);
        setTime(hour, minute);

        switch (hour){
            case (FIRST_EVENING_HOUR):
            displayString = (FIRST_EVENING_HOUR) +":" + minute + " " + EVENING_SUFFIX + "(noon)";
            break;
            case (HOURS_PER_DAY):
            displayString = (FIRST_EVENING_HOUR) +":" + minute + " " + MORNING_SUFFIX + "(midnight)";
            break;
        }
        switch (minute){
            case (FIRST_MORNING_HOUR):
            displayString = hour + ":" +"0"+ minute +" " + MORNING_SUFFIX; 
            break;
        }
        if (hour == HOURS_PER_DAY && minute <= 10)
        {
            displayString =  (FIRST_EVENING_HOUR) +":" +"0"+ minute + " " + MORNING_SUFFIX + "(midnight)";
        }
        if (hour ==FIRST_EVENING_HOUR && minute <=10)
        {
            displayString = (FIRST_EVENING_HOUR) +":" + "0" + minute + " " + EVENING_SUFFIX + "(noon)";
        }
        if (hour > FIRST_EVENING_HOUR && hour <= LAST_EVENING_HOUR && hour != HOURS_PER_DAY && minute <= 10)
        {
            displayString = (hour-FIRST_EVENING_HOUR) +":" + "0" + minute + " " + EVENING_SUFFIX;
            return;           
        }
        if (hour >= FIRST_MORNING_HOUR && hour <= LAST_MORNING_HOUR && hour != FIRST_EVENING_HOUR && minute <= 10)
        {
            displayString = hour + ":" +"0"+ minute +" " + MORNING_SUFFIX;  
            return;
        }
        if (hour > FIRST_EVENING_HOUR && hour <= LAST_EVENING_HOUR && hour != HOURS_PER_DAY)
        {
            displayString = (hour-FIRST_EVENING_HOUR) +":" + minute + " " + EVENING_SUFFIX;
            return;           
        }
        if (hour >= FIRST_MORNING_HOUR && hour <= LAST_MORNING_HOUR && hour != FIRST_EVENING_HOUR)
        {
            displayString = hour + ":" + minute +" " + MORNING_SUFFIX;       
        }
    }

    /**
     * This method should get called once every minute - it makes
     * the clock display go one minute forward.
     */
    public void timeTick()
    {
        minutes.increment();
        if(minutes.getValue() == MIDNIGHT_HOUR) {  // it just rolled over!
            hours.increment();
        }
        updateDisplay();
    }

    /**
     * Set the time of the display to the specified hour and
     * minute.
     */
    public void setTime(int hour, int minute)
    {
        hours.setValue(hour);
        minutes.setValue(minute);
        updateDisplay();
        switch (hour){
            case (FIRST_EVENING_HOUR):
            displayString = (FIRST_EVENING_HOUR) +":" + minute + " " + EVENING_SUFFIX + "(noon)";
            break;
            case (HOURS_PER_DAY):
            displayString = (FIRST_EVENING_HOUR) +":" + minute + " " + MORNING_SUFFIX + "(midnight)";
            break;
        }
        switch (minute){
            case (FIRST_MORNING_HOUR):
            displayString = hour + ":" +"0"+ minute +" " + MORNING_SUFFIX; 
            break;
        }
        if (hour == HOURS_PER_DAY && minute <= 10)
        {
            displayString =  (FIRST_EVENING_HOUR) +":" +"0"+ minute + " " + MORNING_SUFFIX + "(midnight)";
        }
        if (hour ==FIRST_EVENING_HOUR && minute <=10)
        {
            displayString = (FIRST_EVENING_HOUR) +":" + "0"+ minute + " " + EVENING_SUFFIX + "(noon)";
        }
        if (hour > FIRST_EVENING_HOUR && hour <= LAST_EVENING_HOUR && hour != HOURS_PER_DAY && minute <= 10)
        {
            displayString = (hour-FIRST_EVENING_HOUR) +":" + "0" + minute + " " + EVENING_SUFFIX;
            return;           
        }
        if (hour >= FIRST_MORNING_HOUR && hour <= LAST_MORNING_HOUR && hour != FIRST_EVENING_HOUR && minute <= 10)
        {
            displayString = hour + ":" +"0"+ minute +" " + MORNING_SUFFIX;  
            return;
        }
        if (hour > FIRST_EVENING_HOUR && hour <= LAST_EVENING_HOUR && hour != HOURS_PER_DAY)
        {
            displayString = (hour-FIRST_EVENING_HOUR) +":" + minute + " " + EVENING_SUFFIX;
            return;           
        }
        if (hour >= FIRST_MORNING_HOUR && hour <= LAST_MORNING_HOUR && hour != FIRST_EVENING_HOUR)
        {
            displayString = hour + ":" + minute +" " + MORNING_SUFFIX;       
        }
    }

    /**
     * Return the current time of this display in the format HH:MM.
     */
    public String getTime()
    {
        return displayString;
    }

    /**
     * Update the internal string that represents the display.
     */
    private void updateDisplay()
    {
        {       
            displayString = hours.getDisplayValue() + ":" + 
            minutes.getDisplayValue();
        }
    }
}
