
package decimal.to.hexidecimal;
import java.util.Scanner;


public class DecimalToHexidecimal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write down the decimal number: ");
        int answer= input.nextInt();
        
        StringBuilder remainderInt= new StringBuilder();
//        String remainder=String.valueOf(remainderInt);
        int endResult=0;
//        String hexa= "";
//        char character[]={"", ""};
//        System.out.println(answer);
        String hexaLetter= "";
        while(true){
           
           remainderInt.insert(0, answer%16);
           answer = answer/16;
           if(answer<16 ){
               endResult=answer;
               break;
           }
        }
        if(endResult==10){
            hexaLetter= "A";
        } else if(endResult==11){
            hexaLetter="B";
        } else if(endResult==12){
            hexaLetter="C";
        } else if (endResult==13) {
            hexaLetter="D";
        } else if(endResult==14){
            hexaLetter="E";
        } else if(endResult==15){
            hexaLetter="F";
        } else if(endResult==16){
            hexaLetter="G";
        }
        
        if(endResult < 10){
            System.out.println(endResult+ "  " +remainderInt  );
        } else if(endResult > 10){
            System.out.println(hexaLetter+ "  " +remainderInt  );
        }
        

    }
    
}
