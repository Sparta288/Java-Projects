public class AreaCalculator {

    public static double area(double radius){
        if(radius < 0){
            return -1;
        }
        double pi = Math.PI;
        double area = pi * radius * radius;
        return area;
    }

    public static double area(double x, double y){
        if(x < 0 || y < 0){
            return -1.0;
        }
        double area = x * y;
        return area;
    }

    public static void main(String[] args) {
        System.out.println(area(10));
        System.out.println(area(-1.0,5.0));
    }
}
