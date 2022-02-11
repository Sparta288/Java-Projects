public class PlayingCat {

    public static boolean isCatPlaying(boolean summer,int temperature){
        if(!summer && temperature >=25 && temperature <= 35){
            return true;
        }
        else return (summer && temperature >=25 && temperature <=45);



    }

    public static void main(String[] args) {
        System.out.println(isCatPlaying(false,35));
    }


}
