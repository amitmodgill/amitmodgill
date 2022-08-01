public class MegaBytesConverter {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(5000);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if(kiloBytes<0) {
            System.out.println("Invalid Value");
        }

        else {
            int remainingbytes = kiloBytes%1024;
           int megabytes = (kiloBytes/1024) ;
            System.out.println(kiloBytes+" KB = "+megabytes+" MB and "+remainingbytes+" KB");
        }
        
    }
}
