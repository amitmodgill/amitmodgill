

public class PlayingCat {
        public static void main(String[] args) {
            System.out.println(isCatPlaying(false, 24));
        }
    
    public static  boolean isCatPlaying(boolean summer, int temperarture) {

        
        if(temperarture>=25 && temperarture<=45){

            if(!summer) {
            if(temperarture>35){
            return false;
            }
            return true;
            }

            return true;
        }
        return false;
        

        }
    }

