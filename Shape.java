public abstract class Shape{
    abstract double area();
    abstract double circumference();

    public void show()
    {
        System.out.println("Area = "+area());
        System.out.println("Circumference = "+circumference());
    }
}

public class Circle extends Shape{
    double r;

    public double area()
    {
        return 3.14*r*r;
    }

    double circumference()
    {
        return 2*3.14*r;
    }


    Circle(double radius)
    {
        r=radius;
    }
}


public class Rectangle extends Shape{
    double x,y;

    double area()
    {
        return x*y;
    }

    double circumference()
    {
        return 2*(x+y);
    }

    Rectangle(double length, double width)
    {
        x = length;
        y = width;
    }
}

public class Geometry
{
    Circle r = new Circle(2.22);
    Rectangle s = new Rectangle(2.33, 3.44);
    r.show();
}