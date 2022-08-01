

public class barkingDog {
    

    public static void main (String[] args) {

        if(shouldWakeUp(true, 7))
        System.out.println("we need to wake up");
        else
        System.out.println("we don't need to wake up");

    }

        public static boolean shouldWakeUp(boolean barking, int hourOfDay){

        if (barking) {
        if(hourOfDay >=0 && hourOfDay <=23) {

        
        if(hourOfDay < 8 ||  hourOfDay > 22) {
            return true;
        }
            return false;
        }
        return false;
        }
        else
        return false;
        }
    
}
