
public class TestAssignment
{
    

    public TestAssignment()
    {


        TestDate td = new TestDate();

        Date d = new Date();
        System.out.println(d.getFormattedDate());
        // calls private method getPaddedMonth()
        // calls private method getPaddedDay()
        System.out.println(Date.getMonthName(3));
        System.out.println(d.getDayOfTheWeek());
      //   calls private method isLeapYear()
        System.out.println(d.getNumberOfDaysInThisMonth ());
        System.out.println(Date.getMonthNumber("December"));

        Date d2 = new Date(2001, 6, 29);
        System.out.println(d2.getFormattedDate());
        System.out.println(d2.getDayOfTheWeek());
        System.out.println(d2. getNumberOfDaysInThisMonth ());

        Date d3 = new Date(1995, 14, 8);  // invalid date; month is > 12 
        System.out.println(d3.getFormattedDate());
        System.out.println(d3.getDayOfTheWeek());
        System.out.println(d3. getNumberOfDaysInThisMonth ());

        System.out.println(d3.getYear());
        System.out.println(d3.getMonth());
        System.out.println(Date.getMonthName(d3.getMonth()));

        d3.setYear(3500);   // too high; don''t set it
        System.out.println(d3.getYear());
        d3.setYear(-3); // too low; don't set it
        System.out.println(d3.getYear());
        d3.setYear(2010);   
        System.out.println(d3.getYear());
        d3.setMonth(13);    // too high; don't set it
        System.out.println(d3.getMonth());
        d3.setMonth(0); // too low ; don't set it
        System.out.println(d3.getMonth());
        d3.setMonth(8); 
        System.out.println(d3.getMonth());

        d3.setDay(32);  // too high; don't set it
        System.out.println(d3.getDay());
        d3.setDay(0);   // too low ; don't set it
        System.out.println(d3.getDay());
        d3.setDay(27);  
        System.out.println(d3.getDay());

        Name n = new Name();
        System.out.println(n.getFullName());
        // calls makePrettyName()
        System.out.println(n.getInitials());
        Name n2 = new Name("RON", "burGUNDY", null);
        System.out.println(n2.getFullName()); 
        System.out.println(n2.getInitials());
        Name nn = new Name("rON","BURgundY", "JoSePh");
        System.out.println(nn.getFullName());
        System.out.println(nn.getInitials());

        Name n3 = new Name(null, "burgundy", "joseph");
        System.out.println(n3.getFullName());
        System.out.println(n3.getInitials()); // first cannot be null

        Name n4 = new Name("rON", null, "JoSePh"); 
        System.out.println(n4.getFullName()); // last cannot be null
        System.out.println(n4.getInitials());

        Name n5 = new Name("", "burgundy", "JoSePh"); // too short
        System.out.println(n5.getFullName());
        System.out.println(n5.getInitials());

        Name n6 = new Name(null, "Burgundy", "joSEPH"); // null first not allowed 
        System.out.println(n6.getFullName());
        System.out.println(n6.getInitials());

        Name n7 = new Name("Ron", "Burgundy", "01234567890123456789012345678901234567890123456789");
        System.out.println(n7.getFullName()); // too long
        System.out.println(n7.getInitials());

        Name n8 = new Name("rOn", "buRGUNdy", null);
        System.out.println(n8.getFirstName());
        System.out.println(n8.getMiddleName());
        System.out.println(n8.getLastName());

        Name n9 = new Name("rON","BURgundY", "JoSePh");
        System.out.println(n9.getMiddleName());

        Instructor a = new Instructor(); // default dates and names
        System.out.println(a.getDateStarted().getFormattedDate());//default
        System.out.println(a.getName().getFullName()); //default
        System.out.println(a.howLongHaveTheyTaught()); // note: it is 2015 now

        Date d1 = new Date(1995, 9, 21);
       Instructor a1 = new Instructor(null, d1); // null name not allowed
        System.out.println(a1.getName().getFullName());

        Name n1 = new Name("rOn", "BurgundY", null);
        Instructor a2 = new Instructor(n1, null); // null start date not allowed
        System.out.println(a2.getDateStarted().getFormattedDate());

        Instructor a3 = new Instructor(n1, d1); 
        System.out.println(a3.getDateStarted().getFormattedDate());
        System.out.println(a3.getName().getFullName()); 

        Name name = new Name("rOn", "BurgundY", "Joseph");
        Date start = new Date(1995, 9, 21);
        Instructor a4 = new Instructor(name, start);
        System.out.println(a4.getName().getFullName());
        System.out.println(a4.getDateStarted().getFormattedDate());
        
        Instructor a7 = new Instructor("ron", "burgundy", null, 1995, 9, 21);
        System.out.println(a7.getDateStarted().getFormattedDate());
        System.out.println(a7.getName().getFullName());
        
        Name name3 = new Name("rON","BURgundY", "JoSePh");
        Date start1 = new Date(2000, 6, 13);
        Instructor a8 = new Instructor(name3, start1);
        System.out.println(a8.howLongHaveTheyTaught()); // note: it's 2013 now

        Course c = new Course();    // default course
       System.out.println(c.getDepartment());
        System.out.println(c.getNumber());
        System.out.println(c.getTitle());
       System.out.println(c.getInstructor().getName().getFullName());
        System.out.println(c.getDateStart().getFormattedDate());
        System.out.println(c.getDateEnd().getFormattedDate());
       
        
        Date start2 = new Date(2015, 1, 29);
        Date end2   = new Date(2015, 4, 25);  
        String title = "Business Communications 1";
        int number = 1116;
        String department = "COMM";
        Course c1 = new Course(null, start2, end2, number, title, department); //instructor is null
        System.out.println(c1.getInstructor().getName().getFullName());
        System.out.println(c1.getDateStart().getFormattedDate());
        System.out.println(c1.getDateEnd().getFormattedDate());
        System.out.println(c1.getDepartment());
        System.out.println(c1.getNumber());
        System.out.println(c1.getTitle());
        
        Instructor inst1 = new Instructor("Ron", "Burgundy", null, 2000, 8, 20); 
        String title1 = "Object-Oriented Programming with Java";
        int number1 = 2526;
        String department1 = "COMP";
        Course c2 = new Course(inst1, null, null, number1, title1, department1); //dates are null
        System.out.println(c2.getInstructor().getName().getFullName());
        System.out.println(c2.getDateStart().getFormattedDate());
        System.out.println(c2.getDateEnd().getFormattedDate());
        System.out.println(c2.getDepartment());
        System.out.println(c2.getNumber());
        System.out.println(c2.getTitle());
        System.out.println(c2.getInstructor().howLongHaveTheyTaught());
        
        Instructor inst2 = new Instructor("Ron", "Burgundy", null, 2000, 8, 20); 
        Date start3 = new Date(2015, 5, 29);
        Date end3   = new Date(2015, 9, 25);  
        Course c3 = new Course(inst2, start3 , end3, 6001, null, null); //invalid title, number and department
        System.out.println(c3.getInstructor().getName().getFullName());
        System.out.println(c3.getDateStart().getFormattedDate());
        System.out.println(c3.getDateEnd().getFormattedDate());
        System.out.println(c3.getDepartment());
        System.out.println(c3.getNumber());
        System.out.println(c3.getTitle());

        Name name4 = new Name("rON","BURgundY", "JoSePh");
        Date start4 = new Date(2010, 9, 21);
        Instructor aa = new Instructor(name4, start4);
        Date start5 = new Date(2015, 1, 15);
        Date end4 = new Date(2015, 4, 20);
        Course c4 = new Course(aa, start5, end4, 2510, "Procedural Programming in C", "COMP" );
        System.out.println(c4.getInstructorName());
        c4.printDetails();
        
        
    }

   }
