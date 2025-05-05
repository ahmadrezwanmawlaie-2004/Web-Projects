package matchingstring;

import java.util.Scanner;

public class MatchingString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a valid phone number");
        String phoneNumber= input.next();
        
        if(phoneNumber.matches("079.*")){
            System.out.println("You Entered a valid Roshan Phone Number: " + phoneNumber);
        } else if(phoneNumber.matches("078.*")){
            System.out.println("You Entered a valid Etisalat Phone Number: " + phoneNumber);
        } else if(phoneNumber.matches("074.*")){
            System.out.println("You Entered a valid Salam Phone Number: " + phoneNumber);
        }
    }
    
}
