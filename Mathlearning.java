package mathlearning;
import java.util.Scanner;

public class Mathlearning {

    
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int num=1;
        int count=0;
        while (true){
            int ran1=(int)(Math.random()*100);
            System.out.println("Guess the right answer?");
            int answer=input.nextInt();
            if (answer==ran1){
                System.out.println("Your answer "+ answer+" is correct");
            }else if (count==5){
                break;
            } else if(answer > ran1){
                System.out.println("Your Guess is High");
            } else if(answer < ran1){
                System.out.println("Your Guess is too low");
            }
            
            num++;
            count++;
        }
        
        
        
    }
    
}
