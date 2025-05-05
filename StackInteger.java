package stackofintegers;
public class StackInteger {
    private int [] element;
    private int size;
    private Changes newValue;
    public void setElement(int numberElement){
        this.element= new int[numberElement];
    }
    public void setElementItem(int [] valueElements){
        this.element=valueElements;
    }
    public int [] getElement(){
        return this.element;
    }
    public void NewValuepush( int index, int newVal){
        this.element[index]=newVal;
    }
    
}
