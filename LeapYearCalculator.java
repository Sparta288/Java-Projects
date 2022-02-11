public class LeapYearCalculator {


    public static void main(String[] args) {

        isLeapYear(-1600);
    }


        public static boolean isLeapYear ( int year){
            if ((year < 1) || (year > 9999)) {
                return false;
            } else if (year % 400 == 0) {
                return true;
            } else {
                return ((year % 4 == 0) && (year % 100 != 0));
            }
        }
    }