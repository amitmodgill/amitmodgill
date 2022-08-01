public class DecimalComparator {


    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.1753, 3.1759));  
    }
    public static boolean areEqualByThreeDecimalPlaces(double first, double second) {

        if((int)(first*1000) == (int)(second*1000)) {
            return true;
        }
         else
         return false;
    }
    
}
