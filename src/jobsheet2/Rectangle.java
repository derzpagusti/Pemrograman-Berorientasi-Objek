package jobsheet2;

public class Rectangle 
{
    int length,
        width;
    
    int getArea()
    {
        return length * width;
    }

    int getCircumference()
    {
        return 2 * (length + width);
    }

    void displayInfo()
    {
        System.out.println("Length          : " + length);
        System.out.println("Width           : " + width);
        System.out.println("Area            : " + getArea());
        System.out.println("Circumference   : " + getCircumference());
    }
}
