
import java.util.Scanner;

public class FutureTution {
    public static void main(String[] args) {
        int currentTution= 10000;
        int year=0;
        while(true){
            
            if (currentTution > 20000){
                System.out.println("The tution fee after " + year + " year will become double");
                break;
            }
            currentTution= currentTution + 700;
            year = year+1;
        }
    }
    
}
