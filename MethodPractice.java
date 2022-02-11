import java.util.InputMismatchException;
import java.util.Scanner;

public class MethodPractice {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

    try {

        System.out.println("You have to be 18 or older and taller than 120cm to ride the roller-coaster.");
        System.out.println("Enter your age : ");
        int age = input.nextInt();
        System.out.println("Enter your height in centimeters : ");
        int height = input.nextInt();
        ageAvailability(age, height);
        bonusRound(age,height);
    }catch(InputMismatchException e){
        System.out.println("Incorrect input!");
    }

    }




    public static void ageAvailability(int age, int height){

        if (age >= 18 && height >= 120) {
            System.out.println("Congrats you meet the requirements to ride the roller-coaster!");
        } else {
            System.out.println("Sorry you do not meet the requirements to ride the roller-coaster");
        }
    }

    public static void bonusRound(int age, int height){
        if(age == 18 && height == 120){
            System.out.println("WOW you meet the exact requirements! You get to ride the roller-coaster twice!");
        }
    }





}
