public class GetMinutesSeconds {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";
    // example of a constant that CANNOT be changed once initialized

    private static String getDurationString(long minutes, long seconds){
        if(minutes < 0 || seconds < 0 || seconds >59){
            return INVALID_VALUE_MESSAGE;
        }

        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;

        String hoursString = hours + "h";
        if(hours < 10){
            hoursString = "0" + hoursString;
        }
        String minutesString = remainingMinutes + "m";
        if(remainingMinutes < 10){
            minutesString = "0" + minutesString;
        }
        String secondString = seconds + "s";
        if(hours < 10){
            secondString = "0" + secondString;
        }
        return hoursString + " " + minutesString + " " + secondString + " ";

    }

    private static String getDurationString(long seconds){
        if (seconds < 0){
            return INVALID_VALUE_MESSAGE;
        }
        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;
        return getDurationString(minutes,remainingSeconds);

    }




    public static void main(String[] args) {
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(450));
        System.out.println(getDurationString(-14));
        System.out.println(getDurationString(65,9));

    }

}
