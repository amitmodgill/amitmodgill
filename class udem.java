class udem
{
public static void main(String[] args)
{
//     byte by1 = 10;
//     short sh1 = 20;
//     int in1 = 50;
//     long    lg1 = (50000L + 10L*(by1+sh1+in1));
//    System.out.println("long value is "+lg1);
//    short shrt =(short)(1000+ 10*(by1+sh1+in1));
//    System.out.println("long value is "+shrt);
 

        
        // double pnd = 200d;
        // double kg = pnd*0.45359237;
        // System.out.println(pnd+" pound is "+kg+" kilogram");

            // int topScore = 100;
            // if (topScore == 100){
            //     System.out.println("You got a high score of " +topScore);
            // }
            double v1 = 20d;
            double v2 = 80d;
            double sum = (v1 +v2)*100;
            double remainder = sum%40;
            boolean otput = remainder==0 ? true : false;
  
            if (otput) {
                System.out.println("No remainder "+otput);
            }
           if (!otput) {
                System.out.println("Got some remainder "+otput);
            }

        
        }}