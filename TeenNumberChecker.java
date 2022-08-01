public class TeenNumberChecker {
    
    public static void main(String[] args) {
        
        System.out.println(hasTeen( 12,  20 ,  20));
        System.out.println(isTeen( 13));
    }
    public static boolean hasTeen(int first, int second, int third) {

            if(first>=13 && first<=19) return true;
            if(second>=13 && second<=19) return true;
            if(third>=13 && third<=19) return true;
            
        else    
        return false;
    }
    public static boolean isTeen(int one) {

        if(one>=13 && one<=19) return true;
        
        
         else    
        return false;
    }    

}
