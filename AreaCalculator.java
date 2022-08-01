public class AreaCalculator {
    public static void main(String[] args) {
        
        System.out.println(area(5));
        System.out.println(area(5,6));
    }
    
        public static double area(double radius) {
            if(radius<0){
                return -1;
            }
            System.out.println("circle area :");
            double areaOfCircle1 = radius*radius*Math.PI;
             return areaOfCircle1;

        }
        public static double area(double x, double y) {
            if(x<0 || y<0){
                return -1;
            }
            System.out.println("rectangle area :");
            double areaOfRectangle1 = x*y;
             return areaOfRectangle1;

        }
}
