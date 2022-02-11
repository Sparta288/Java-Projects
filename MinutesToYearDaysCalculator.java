public class MinutesToYearDaysCalculator {

    public static void printYearsAndDays(long minutes) {
        long XX = minutes, YY, ZZ;
        if (XX < 0) {
            System.out.println("Invalid value");
        } else {
            YY = XX / 60 / 24 / 365;          // CALCULATING YEARS
            ZZ = (XX % (60 * 24 * 365)) / (60 * 24);  // CALCULATING DAYS
            System.out.println(XX + " min = " + YY + " y and " + ZZ + " d");
        }
    }

    public static void main(String[] args) {
        printYearsAndDays(-1);
    }
}
