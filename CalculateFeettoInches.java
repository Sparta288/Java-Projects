public class CalculateFeettoInches {

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if ((feet < 0) || (inches < 0 || inches > 12)){
            System.out.println("Invalid Feet or inches.");
            return -1; // returning -1 to test for validation of either correct or not
        }
        double centi = (feet * 12) * 2.54;
        centi += inches * 2.54;
        System.out.println(feet + " Feet, " + inches + " inches = " + centi + " cm");
        System.out.println(centi);
        return centi;

    }


    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches < 0){
        return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " Inches is equal to " + feet + " feet and " + remainingInches);
        return calcFeetAndInchesToCentimeters(feet,remainingInches);
    }


    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(6,0);
        calcFeetAndInchesToCentimeters(100);

    }
}
