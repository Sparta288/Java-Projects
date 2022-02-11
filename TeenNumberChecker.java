public class TeenNumberChecker {

    public static boolean hasTeen(int x, int y, int z){
        if(x>=13 && x <= 19){
            System.out.println(true);
            return true;
        }
        if(y>=13 && y <= 19){
            System.out.println(true);
            return true;
        }
        if(z>=13 && z <= 19){
            System.out.println(true);
            return true;
        }
        System.out.println(false);
        return false;
    }

    public static boolean isTeen(int d){
        if(d >= 13 && d <= 19){
            System.out.println(true);
            return true;
        }
        System.out.println(false);
        return false;

    }


    public static void main(String[] args) {
        hasTeen(22,23,34);
        isTeen(13);
    }
}
