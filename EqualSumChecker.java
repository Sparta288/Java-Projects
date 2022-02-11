import java.util.Scanner;

public class EqualSumChecker {

    public static boolean hasEqualSum(int x, int y, int z){
       int sum = x + y;
       if(sum == z){
           System.out.println(true);
           return true;

       }
        System.out.println(false);
       return false;

    }


    public static void main(String[] args) {

        int x , y  , z;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x value : ");
        x =sc.nextInt();
        System.out.println("Enter y value : ");
        y = sc.nextInt();
        System.out.println("Enter z value : ");
        z = sc.nextInt();
        hasEqualSum(x,y,z);
    }

}
