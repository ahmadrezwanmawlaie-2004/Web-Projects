
package rnadomclass;

import java.util.Random;

public class RnadomClass {
    public static void main(String[] args) {
         int [] numbers= {1, 2, 3, 4};
         Random random= new Random();
         
         for(int i=0; i<numbers.length; i++){
             int j= random.nextInt(numbers.length);
             int temp= numbers[i];
             numbers[i]= numbers[j];
             numbers[j]= temp;
         }
         for(int i: numbers){
             System.out.println(i);
         }
    }
    
}
