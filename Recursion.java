import java.util.Scanner;

public class Recursion {

        public static void main(String[] args)
        {
            int[] N = new int[6];
            System.out.println("Enter five Numbers:");
            for(int i = 1; i <= 5; i++)
            {
                Scanner scan = new Scanner(System.in);
                N[i] = scan.nextInt();
            }
            int result = sum(N, 6);
            System.out.println("Result: " + result);
        }
        public static int sum(int [] N, int k)// the recursive method
        {
            if (k > 0)
            {
                return ( N[k - 1] + sum(N, k - 1));
            }
            else
            {
                return 0;
            }
        }
    }

