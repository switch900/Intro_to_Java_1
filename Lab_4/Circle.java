
public class Circle
{       
    //static variable
    private static double PI = 3.14159;

    private double radius;

    public Circle (double rad)
    {
        radius = rad;
    }
    
    //instance method and static variable
    public double getArea()
    {
        return PI * radius * radius;
    }

    //static method and static variable
    public void setPI(double newPI)
    {
        PI = newPI;
    }
    
    //instance method wtih instance variable    
    public void setRadius(double newRad)
    {
        radius = newRad;
    }
    
    //static method with instance variable NOT ALLOWED   
    //public static double getArea2()
    //{
    //   return PI * radius * radius;
    //}
    
    public void printDetails()
    {
        double tempArea = getArea();
        System.out.println("The Area of the circle is " + tempArea);
        System.out.println("Double the Area of the circle is " + 2 * tempArea);
        
    }
    
   
}