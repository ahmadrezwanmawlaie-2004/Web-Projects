package sentinelvalue;
import java.util.Scanner;

public class SentinelValue {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int num=0;
//        int count=1;
        while(true){
            System.out.println("Write the number");
            int answer=input.nextInt();
            if(answer==0){
                System.out.println("The sum of the loop is: " + num);
                break;
            }
              num=num+answer;
        }
    }
    
}
