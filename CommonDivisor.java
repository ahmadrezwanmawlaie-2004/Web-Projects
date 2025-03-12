
package sentinelvalue;
import java.util.Scanner;

public class CommonDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write the first positive number: ");
        int answer = input.nextInt();
        
        System.out.println("Write the second positive number: ");
        int answer1 = input.nextInt();
        
        int common=0;
        for(int i=1; i<=1000; i++){
            if(answer% i ==0 && answer1%i==0){
                common=i;
            }
        }
        System.out.println("The biggest common divisor between "+ answer + "and "+ answer1 + "is: " + common);
        
        
    }
}
