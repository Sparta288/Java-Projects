abstract class Shape
{
    double r, h;
    Shape(double r, double h)
    {
        this.r = r;
        this.h = h;
    }
    abstract double calcArea();
    abstract double calcVolume();
}

class Sphere extends Shape
{
    Sphere(double r)
    {
        super(r, 0);
    }
    double calcArea()
    {
        return 4*3.14*r*r;
    }
    double calcVolume()
    {
        return 4*3.14*Math.pow(r,3)/3;
    }
    public String toString()
    {
        return ("Volume is : "+this.calcVolume()+ " and Area : "+this.calcArea());
    }
}

class Cone extends Shape
{
    Cone(double r, double h)
    {
        super(r, h);
    }
    double calcArea()
    {
        return 3.14*r*(r+Math.sqrt(r*r+h*h));
    }
    double calcVolume()
    {
        return 3.14*r*r*h/3;
    }
    public String toString()
    {
        return ("Volume is : "+this.calcVolume()+ " and Area : "+this.calcArea());
    }
}

class Cylinder extends Shape
{
    Cylinder(double r, double h)
    {
        super(r, h);
    }
    double calcArea()
    {
        return 2*3.14*r*(h+r);
    }
    double calcVolume()
    {
        return 3.14*r*r*h;
    }
    public String toString()
    {
        return ("Volume is : "+this.calcVolume()+ " and Area : "+this.calcArea());
    }

}

class shapeArray
{
    public static void main(String ff[])
    {
        Shape shapeArray[] = new Shape[3];
        shapeArray[0]=new Sphere(4);
        shapeArray[1]=new Cylinder(5,7);
        shapeArray[2]=new Cone(5,6);

        for(int i=0;i<3;i++)System.out.println(shapeArray[i].toString());
    }
}