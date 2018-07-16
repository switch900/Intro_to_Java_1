import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import java.io.FileOutputStream;
import java.io.FileDescriptor;

class RunTestA2
{
    private final static String NEWLINE_CHAR = System.getProperties().getProperty("line.separator"); // Get the println separator
     
    private static String expected = "Sunday" + NEWLINE_CHAR + "Sunday" + NEWLINE_CHAR + "Monday" + NEWLINE_CHAR + "Tuesday" + NEWLINE_CHAR + "Tuesday" + NEWLINE_CHAR + "Tuesday" + NEWLINE_CHAR + "Wednesday" + NEWLINE_CHAR + "Wednesday" + NEWLINE_CHAR + "Thursday" + NEWLINE_CHAR + "Thursday" + NEWLINE_CHAR + "Friday" + NEWLINE_CHAR + "Friday" + NEWLINE_CHAR + "Saturday" + NEWLINE_CHAR + "Saturday" + NEWLINE_CHAR + "Saturday" + NEWLINE_CHAR + "2015-01-01" + NEWLINE_CHAR + "March" + NEWLINE_CHAR + "Thursday" + NEWLINE_CHAR + "31" + NEWLINE_CHAR + "12" + NEWLINE_CHAR + "2001-06-29" + NEWLINE_CHAR + "Friday" + NEWLINE_CHAR + "30" + NEWLINE_CHAR + "2015-01-01" + NEWLINE_CHAR + "Thursday" + NEWLINE_CHAR + "31" + NEWLINE_CHAR + "2015" + NEWLINE_CHAR + "1" + NEWLINE_CHAR + "January" + NEWLINE_CHAR + "2015" + NEWLINE_CHAR + "2015" + NEWLINE_CHAR + "2010" + NEWLINE_CHAR + "1" + NEWLINE_CHAR + "1" + NEWLINE_CHAR + "8" + NEWLINE_CHAR + "1" + NEWLINE_CHAR + "1" + NEWLINE_CHAR + "27" + NEWLINE_CHAR + "To Be Announced" + NEWLINE_CHAR + "T.B.A." + NEWLINE_CHAR + "Ron Burgundy" + NEWLINE_CHAR + "R.B." + NEWLINE_CHAR + "Ron Joseph Burgundy" + NEWLINE_CHAR + "R.J.B." + NEWLINE_CHAR + "To Be Announced" + NEWLINE_CHAR + "T.B.A." + NEWLINE_CHAR + "To Be Announced" + NEWLINE_CHAR + "T.B.A." + NEWLINE_CHAR + "To Be Announced" + NEWLINE_CHAR + "T.B.A." + NEWLINE_CHAR + "To Be Announced" + NEWLINE_CHAR + "T.B.A." + NEWLINE_CHAR + "To Be Announced" + NEWLINE_CHAR + "T.B.A." + NEWLINE_CHAR + "Ron" + NEWLINE_CHAR + "null" + NEWLINE_CHAR + "Burgundy" + NEWLINE_CHAR + "Joseph" + NEWLINE_CHAR + "2015-01-01" + NEWLINE_CHAR + "To Be Announced" + NEWLINE_CHAR + "0" + NEWLINE_CHAR + "To Be Announced" + NEWLINE_CHAR + "2015-01-01" + NEWLINE_CHAR + "1995-09-21" + NEWLINE_CHAR + "Ron Burgundy" + NEWLINE_CHAR + "Ron Joseph Burgundy" + NEWLINE_CHAR + "1995-09-21" + NEWLINE_CHAR + "1995-09-21" + NEWLINE_CHAR + "Ron Burgundy" + NEWLINE_CHAR + "15" + NEWLINE_CHAR + "COMP" + NEWLINE_CHAR + "1409" + NEWLINE_CHAR + "Introduction to Java" + NEWLINE_CHAR + "To Be Announced" + NEWLINE_CHAR + "2015-01-01" + NEWLINE_CHAR + "2015-01-01" + NEWLINE_CHAR + "To Be Announced" + NEWLINE_CHAR + "2015-01-29" + NEWLINE_CHAR + "2015-04-25" + NEWLINE_CHAR + "COMM" + NEWLINE_CHAR + "1116" + NEWLINE_CHAR + "Business Communications 1" + NEWLINE_CHAR + "Ron Burgundy" + NEWLINE_CHAR + "2015-01-01" + NEWLINE_CHAR + "2015-01-01" + NEWLINE_CHAR + "COMP" + NEWLINE_CHAR + "2526" + NEWLINE_CHAR + "Object-Oriented Programming with Java" + NEWLINE_CHAR + "15" + NEWLINE_CHAR + "Ron Burgundy" + NEWLINE_CHAR + "2015-05-29" + NEWLINE_CHAR + "2015-09-25" + NEWLINE_CHAR + "COMP" + NEWLINE_CHAR + "1409" + NEWLINE_CHAR + "Introduction to Java" + NEWLINE_CHAR + "Ron Joseph Burgundy" + NEWLINE_CHAR + "COMP 2510 is Procedural Programming in C."+ NEWLINE_CHAR + "The course runs from January 15, 2015 to April 20, 2015." + NEWLINE_CHAR + "The instructor is Ron Joseph Burgundy, who has been teaching since September 21, 2010." + NEWLINE_CHAR; 
    
    private RunTestA2() {} 
    
    public static void main(String[] args) {
        PrintStream originalOut = new PrintStream(new FileOutputStream(FileDescriptor.out));
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(outContent);
        System.setOut(ps);
        
        //Run test assignment
        TestAssignment t = new TestAssignment();
        // read in lines of each file
        
        String actual = outContent.toString();
        System.setOut(originalOut);
        String[] exp = expected.split("\n");
        String[] act = actual.split("\n");

        // number of lines of each file
        int expected_length = exp.length;
        int actual_length = act.length;
        
        int issues_found = 0;
        if(expected_length != actual_length)
        {
            System.out.println("Line mismatch. Found: " + actual_length + ". Expected: " + expected_length);
            return;
        }
        
        for(int i = 0; i < expected_length; i++)
        {
            if(!exp[i].equals(act[i]))
            {
                System.out.println("Expected: \t" + exp[i] + "\nFound: \t\t" + act[i]);
                System.out.println("========================================================================");
                issues_found++;
            }
        }
        
        System.out.println("Done! Total Issues Found: " + issues_found);
    }
}