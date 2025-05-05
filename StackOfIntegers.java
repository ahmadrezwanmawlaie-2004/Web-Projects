package stackofintegers;
public class StackOfIntegers {
    public static void main(String[] args) {
        StackInteger newObj= new StackInteger();
        newObj.setElement(5);
        int [] valueElements={1, 2, 3, 4, 5};
        newObj.setElementItem(valueElements);
        newObj.NewValuepush(2, 10);
        for(int value: newObj.getElement()){
            System.out.println(value);
        }
    }
    
}
