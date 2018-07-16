/**
 * Assignment 2 - BCIT Student A01029917 - Course Comp-1409-0 Intro Software Development 1 - 55053
 * Test Date Class
 * 
 * @author Andrew Hewitson
 * @version May 16, 2017
 */

public class TestDate
{   
    private int year;
    private int month;
    private int day;
    private Date date1;
    private Date date2;
    private Date date3;
    private Date date4;
    private Date date5;
    private Date date6;
    private Date date7;
    private Date date8;
    private Date date9;
    private Date date10;
    private Date date11;
    private Date date12;
    private Date date13;
    private Date date14;
    private Date date15;

    /**
     *  Constructor For Test Date Class That Assigns Parameters To Year, Month and Day
     */
    public TestDate()    
    {   
        Date date1 = new Date (1970,11,15);
        this.date1 = date1;

        Date date2 = new Date (1887,7,31);
        this.date2 = date2;

        Date date3 = new Date (1966,5,2);
        this.date3 = date3;

        Date date4 = new Date (1980,8,19);
        this.date4 = date4;

        Date date5 = new Date (2001,9,11);
        this.date5 = date5;

        Date date6 = new Date (1900,6,26);
        this.date6 = date6;

        Date date7 = new Date (1940,2,28);
        this.date7 = date7;

        Date date8 = new Date (1974,10,30);
        this.date8 = date8;

        Date date9 = new Date (1914,1,15);
        this.date9 = date9;

        Date date10 = new Date (1840,10,1);
        this.date10 = date10;

        Date date11 = new Date (1999,12,31);
        this.date11 = date11;

        Date date12 = new Date (1988,5,20);
        this.date12 = date12;

        Date date13 = new Date (2012,3,10);
        this.date13 = date13;

        Date date14 = new Date (2006,4,1);
        this.date14 = date14;

        this.date15 = new Date (1992,2,29);
        printDetails();
    }
    /**
     * @param Print Days of the Week Based On Given Parameters
     */
    public void printDetails()
    {
        System.out.println(date1.getDayOfTheWeek());
        System.out.println(date2.getDayOfTheWeek());
        System.out.println(date3.getDayOfTheWeek());
        System.out.println(date4.getDayOfTheWeek());
        System.out.println(date5.getDayOfTheWeek());
        System.out.println(date6.getDayOfTheWeek());
        System.out.println(date7.getDayOfTheWeek());
        System.out.println(date8.getDayOfTheWeek());
        System.out.println(date9.getDayOfTheWeek());
        System.out.println(date10.getDayOfTheWeek());
        System.out.println(date11.getDayOfTheWeek());
        System.out.println(date12.getDayOfTheWeek());
        System.out.println(date13.getDayOfTheWeek());
        System.out.println(date14.getDayOfTheWeek());
        System.out.println(date15.getDayOfTheWeek());
    }

}
