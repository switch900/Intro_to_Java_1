/**
 * Assignment 2 - BCIT Student A01029917 - Course Comp-1409-0 Intro Software Development 1 - 55053
 * Date Class
 * 
 * @author Andrew Hewitson
 * @version May 16, 2017
 */
public class Date
{
    private int year;
    private int month;
    private int day;

    public static final int JANUARY     = 1;
    public static final int FEBRUARY    = 2;
    public static final int MARCH       = 3;
    public static final int APRIL       = 4;
    public static final int MAY         = 5;
    public static final int JUNE        = 6;
    public static final int JULY        = 7;
    public static final int AUGUST      = 8;
    public static final int SEPTEMBER   = 9;
    public static final int OCTOBER     = 10;
    public static final int NOVEMBER    = 11;
    public static final int DECEMBER    = 12;
    public static final int SATURDAY    = 0;
    public static final int SUNDAY      = 1;
    public static final int MONDAY      = 2;
    public static final int TUESDAY     = 3;
    public static final int WEDNESDAY   = 4;
    public static final int THURSDAY    = 5;
    public static final int FRIDAY      = 6;
    public static final int CURRENT_YEAR = 2015;
    public static final int OLDEST_YEAR = 0;
    public static final int LAST_DAY_FEBRUARY_ON_LEAP_YEAR = 29;
    public static final int DEFAULT_DAY = 01;

    /**
     * Create Default Constructor of January 1st, 2015
     */
    public Date()
    {
        setMonth(JANUARY);
        setDay(DEFAULT_DAY);
        setYear(CURRENT_YEAR);
    }

    /**
     * Create new Constructor from parameters set in year, month and day
     */
    public Date(int theYear, int theMonth, int theDay)
    {
        {
            setYear(theYear);
        }
        {
            setMonth(theMonth);
        }
        {
            setDay(theDay);  
        }
    }

    /**
     * @return new Year
     */
    public int getYear()
    {
        return year;
    }

    /**
     * @return get new Month
     */
    public int getMonth()
    {
        return month;
    }

    /**
     * @return get new Day
     */
    public int getDay()
    {
        return day;
    }

    /**
     * @param set new Year or return January 1st,2015
     */
    public void setYear(int newYear)
    {   
        if (newYear >=OLDEST_YEAR && newYear <=CURRENT_YEAR)
        {
            year = newYear;
            month = getMonth();
            day = getDay();
        }
        else 
        {       
            year = CURRENT_YEAR; 
            month = JANUARY;
            day = DEFAULT_DAY;      
        }
    }

    /**
     * @param set new Month or return January 1st, 2015
     */
    public void setMonth (int newMonth)
    {           
        if (newMonth >=JANUARY && newMonth <=DECEMBER)
        {
            month = newMonth; 
            year = getYear();
            day = getDay();             
        }

        else 
        {
            year = CURRENT_YEAR;
            month = JANUARY;
            day = DEFAULT_DAY;            
        }
    }

    /**
     * @param set new Day or return January 1st, 2015
     */
    public void setDay (int newDay)
    {   
        if (year==CURRENT_YEAR && month ==JANUARY && day==DEFAULT_DAY)
        {
            year = CURRENT_YEAR; 
            month = JANUARY;
            day = DEFAULT_DAY;             
        } 
        else if (newDay >= 1 && newDay <=30)
        {
            day = newDay;       
            month = getMonth();
            year = getYear();  
        } 
        else if(getMonth() == JANUARY && newDay >=1 && newDay<=31)
        {
            day = newDay;       
            month = getMonth();
            year = getYear();  

        } 
        else if (getMonth()== MARCH && newDay>=1 && newDay<=31)  
        { 
            day = newDay;         
            month = getMonth();
            year = getYear(); 

        }
        else if (getMonth()== MAY&& newDay>=1 && newDay<=31)  
        {
            day = newDay;          
            month = getMonth();
            year = getYear(); 

        }
        else if (getMonth()== JULY&& newDay>=1 && newDay<=31)   
        {
            day = newDay;          
            month = getMonth();
            year = getYear();

        }
        else if (getMonth()== AUGUST && newDay>=1 && newDay<=31)  
        {
            day = newDay;
            month = getMonth();
            year = getYear();
        }
        else if (getMonth()== OCTOBER && newDay>=1 && newDay<=31)     
        {
            day = newDay;
            month = getMonth();
            year = getYear();
        }
        else if (getMonth()== DECEMBER && newDay>=1 && newDay<=31)    
        {
            day = newDay;
            month = getMonth();
            year = getYear(); 
        }
        else if (getMonth() == FEBRUARY  &&isLeapYear().equals(false)&& newDay<=28 && newDay>=1)
        {
            day = newDay;
            month = getMonth();
            year = getYear(); 
            return;
        }
        else if  (getMonth() == FEBRUARY  &&isLeapYear().equals(true)&& newDay<=29&&newDay>=1)
        {
            day = newDay;
            month = getMonth();
            year = getYear(); 
        }
    }

    /**@return Day of the Week
     * 
     */
    public String getDayOfTheWeek()
    {
        String stringYear = Integer.toUnsignedString(year).substring(2); 
        int monthCode = getMonth();
        switch(monthCode)
        {
            case(JANUARY):
            monthCode = 1;
            break;
            case(FEBRUARY):
            monthCode = 4;
            break;
            case(MARCH):
            monthCode = 4;
            break;
            case(APRIL):
            monthCode = 0;
            break;
            case(MAY):
            monthCode = 2;
            break;
            case(JUNE):
            monthCode = 5;
            break;
            case(JULY):
            monthCode = 0;
            break;
            case(AUGUST):
            monthCode = 3;
            break;
            case(SEPTEMBER):
            monthCode = 6;
            break;
            case(OCTOBER):
            monthCode = 1;
            break;
            case(NOVEMBER):
            monthCode = 4;
            break;
            case(DECEMBER):
            monthCode = 6;
            break;
        }
        if (getMonth()==JANUARY && isLeapYear().equals(true))
        {
            monthCode = monthCode-1;
        }
        if (getMonth() == FEBRUARY && isLeapYear().equals(true))
        {
            monthCode = monthCode-1;
        }
        if (getYear()>=1600 && getYear()<1700)
        {
            monthCode =monthCode+6; 
        }
        else if (getYear()>=1700 && getYear()<1800)
        {
            monthCode =monthCode+4;
        }
        else if (getYear()>=1800 && getYear()<1900)
        {
            monthCode =monthCode+2;
        }
        else if (getYear()>=2000 && getYear()<2100)
        {
            monthCode = monthCode+6;
        }
        else if (getYear()>=2100 && getYear()<2200)
        {
            monthCode = monthCode+4;
        }

        int intYear = Integer.parseInt(stringYear);
        int dayOfWeek = ((intYear/12)+(intYear%12)+((intYear%12)/4)+getDay()+monthCode)%7;
        String stringYear2 = Integer.toUnsignedString(dayOfWeek);

        if (dayOfWeek == SATURDAY)
        {
            return "Saturday";
        }
        else if (dayOfWeek == SUNDAY)
        {
            return "Sunday";
        }
        else if (dayOfWeek == MONDAY)
        {
            return "Monday";
        }
        else if (dayOfWeek == TUESDAY)
        {
            return "Tuesday";
        }
        else if (dayOfWeek == WEDNESDAY)
        {
            return "Wednesday";
        }
        else if (dayOfWeek == THURSDAY)
        {
            return "Thursday";
        }
        else
        {
            return "Friday";   
        }
    }

    /**
     * @param return If Year is Leap Year
     */
    public Boolean isLeapYear()
    {
        if ((getYear()%400)==0)
        {
            return true;
        }
        else if (getYear()%4==0 && (getYear()%100!=0 && getYear()%400!=0))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * @return Number Of Days In Month
     */
    public int getNumberOfDaysInThisMonth()
    {
        if (getMonth() == JANUARY)
        {
            return 31;
        }
        else if (getMonth() == FEBRUARY && isLeapYear().equals(true))
        {
            return 29;
        }
        else if (getMonth() == FEBRUARY && isLeapYear().equals(false))
        {
            return 28;
        }
        else if (getMonth()== MARCH)
        {
            return 31;
        }
        else if (getMonth() == APRIL)
        {
            return 30;
        }
        else if (getMonth() == MAY)
        {
            return 31;
        }
        else if (getMonth() == JUNE)
        {
            return 30;
        }
        else if (getMonth() == JULY)
        {
            return 31;
        }
        else if (getMonth() == AUGUST)
        {
            return 30;
        }
        else if (getMonth() == SEPTEMBER)
        {
            return 30;
        }
        else if (getMonth() == OCTOBER)
        {
            return 31;
        }
        else if (getMonth() == NOVEMBER)
        {
            return 30;
        }
        else if (getMonth() == DECEMBER)
        {
            return 31;
        }
        else
        {
            return 0;
        }
    }

    /**
     * @return Formatted Date
     */
    public String getFormattedDate()
    {      
        return getYear()+""+getPaddedMonth()+""+getPaddedDay();
    }

    /**
     * @return Date In Full (i.e. January 1st, 2015)
     */
    public String getStringDate()
    {
        if (getMonth()==JANUARY)
        {
            return getMonthName(JANUARY) + " " + getDay() + ", " + getYear();
        }  
        else if (getMonth()==FEBRUARY)
        {
            return getMonthName(FEBRUARY) + " " + getDay() + " , " + getYear();
        }  
        else if (getMonth()==MARCH)
        {
            return Date.getMonthName(MARCH) + " " + getDay() + ", " + getYear();
        }  
        else if (getMonth()==APRIL)
        {
            return Date.getMonthName(APRIL) + " " + getDay() + ", " + getYear();
        }  
        else if (getMonth()==MAY)
        {
            return Date.getMonthName(MAY) + " " + getDay() + ", " + getYear();
        }  
        else if (getMonth()==JUNE)
        {
            return Date.getMonthName(JUNE) + " " + getDay() + ", " + getYear();
        }  
        else if (getMonth()==JULY)
        {
            return Date.getMonthName(JULY) + " " + getDay() + ", " + getYear();
        }  
        else if (getMonth()==AUGUST)
        {        
            return Date.getMonthName(AUGUST) + " " + getDay() + " " + getYear();
        }  
        else if (getMonth()==SEPTEMBER)
        {
            return Date.getMonthName(SEPTEMBER) + " " + getDay() + ", " + getYear();
        }  
        else if (getMonth()==OCTOBER)
        {
            return Date.getMonthName(OCTOBER) + " " + getDay() + ", " + getYear();
        }  
        else if (getMonth()==NOVEMBER)
        {
            return Date.getMonthName(NOVEMBER) + " " + getDay() + ", " + getYear();
        }  
        else if (getMonth()==DECEMBER)
        {
            return Date.getMonthName(DECEMBER) + " " + getDay() + ", " + getYear();
        }  

        else
        {
            return CURRENT_YEAR + " " + JANUARY + ", "  + DEFAULT_DAY;
        }
    }

    /**
     * @return Padded Month
     */
    private String getPaddedMonth()
    {
        if (getMonth() == JANUARY)
        {
            return "-01";
        }
        else if (getMonth() == FEBRUARY)
        {
            return "-02";
        }
        else if (getMonth() == MARCH)
        {
            return "-03";
        }
        else if (getMonth() == APRIL)
        {
            return "-04";
        }
        else if (getMonth() == MAY)
        {
            return "-05";
        }
        else if (getMonth() == JUNE)
        {
            return "-06";
        }
        else if (getMonth() == JULY)
        {
            return "-07";
        }
        else if (getMonth() == AUGUST)
        {
            return "-08";
        }
        else if (getMonth() == SEPTEMBER)
        {
            return "-09";
        }
        else if (getMonth()== OCTOBER)
        {
            return "10";
        }
        else if (getMonth() == NOVEMBER)
        {
            return "-11";
        }
        else if (getMonth() == DECEMBER)
        {
            return "-12";
        }
        else
        {
            return null;
        }
    }

    /**
     * @return Padded Day
     */
    private String getPaddedDay()
    {
        if (getDay() != 0 && getDay() <=9)
        {
            return "-0" + getDay();
        }
        if (getDay() >9 && getDay() <= getNumberOfDaysInThisMonth())
        {
            return "-" + getDay();
        }
        if (getDay() == 29 && getMonth() == FEBRUARY && isLeapYear().equals(true))
        {
            return "-" + getDay();
        }
        else 
        {
            return null;
        }
    }

    /**
     * @return Name Of Month
     */
    public static String getMonthName(int monthNumber)
    {
        if (monthNumber == JANUARY)
        {
            return "January";
        }
        if (monthNumber ==FEBRUARY)
        {
            return "February";
        }
        if (monthNumber == MARCH)
        {
            return "March";
        }
        if (monthNumber == APRIL)
        {
            return "April";
        }
        if (monthNumber == MAY)
        {
            return "May";
        }
        if (monthNumber == JUNE)
        {
            return "June";
        }
        if (monthNumber == JULY)
        {
            return "July";
        }
        if (monthNumber == AUGUST)
        {
            return "August";
        }  
        if (monthNumber == SEPTEMBER)
        {
            return "September";
        }
        if (monthNumber == OCTOBER)
        {
            return "October";
        }
        if (monthNumber == NOVEMBER)
        {
            return "November";
        }
        if (monthNumber == DECEMBER)
        {
            return "December";
        }
        else
        {
            return "Dave!  You really aren't being very nice.";
        }
    }

    /**
     * @return Month Number
     */
    public static int getMonthNumber(String monthName)
    {
        if(monthName.equalsIgnoreCase("January"))
        {
            return JANUARY;
        }   
        else if(monthName.equalsIgnoreCase("February"))
        {
            return FEBRUARY;
        }    
        else if(monthName.equalsIgnoreCase("March"))
        {
            return MARCH;
        }    
        else if(monthName.equalsIgnoreCase("April"))
        {
            return APRIL;
        }    
        else if(monthName.equalsIgnoreCase("May"))
        {
            return MAY;
        }    
        else if(monthName.equalsIgnoreCase("June"))
        {
            return JUNE;
        }    
        else if(monthName.equalsIgnoreCase("July"))
        {
            return JULY;
        }    
        else if(monthName.equalsIgnoreCase("August"))
        {
            return AUGUST;
        }    

        else if(monthName.equalsIgnoreCase("September"))
        {
            return SEPTEMBER;
        }    
        else if(monthName.equalsIgnoreCase("October"))
        {
            return OCTOBER;
        }    

        else if(monthName.equalsIgnoreCase("November"))
        {
            return NOVEMBER;
        }
        else if    (monthName.equalsIgnoreCase("December"))
        {
            return DECEMBER;
        }
        else
        {
            return JANUARY;
        }
    }
}
