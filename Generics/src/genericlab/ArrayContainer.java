package genericlab;

import java.util.Arrays;

public class ArrayContainer <T extends Number> {
    private T array[] = null;
    private int maxElementsAmount = 0;
    private int minElementsAmount = 0;

    public ArrayContainer(T[] array) {
        this.array = array.clone();
    }

    private void check() throws Exc{
        if (getLength() == 0) throw new Exc(0, "null array");
    }
        
    public int getLength(){
        if(array == null) return 0;
        int counter = 0;
        for (T value : this.array) counter++; 
        return counter;
    }
    
    public double getMaxElement() throws Exc{
        check();
        int counter = 0;
        double max = this.array[0].doubleValue();
        for(T value : array){
            if (value.doubleValue() > max){
                max = value.doubleValue();
                counter++;
            }
        }
        this.maxElementsAmount = counter;
        return max;
    }
    
    public double maxElementsAmount() throws Exc{
        if(maxElementsAmount == 0) getMaxElement();
        return this.maxElementsAmount;
    }
    
    public double getMinElement() throws Exc{
        check();
        int counter = 0;
        double min = this.array[0].doubleValue();
        for(T value : array){
            if (value.doubleValue() < min){
                min = value.doubleValue();
                counter++;
            }
        }
        this.minElementsAmount = counter;
        return min;
    }
    
    public double minElementsAmount() throws Exc{
        if(minElementsAmount == 0) getMinElement();
        return this.minElementsAmount;
    }
    
    public double getSumm() throws Exc{
        check();
        double counter = 0;
        for (T value : this.array) counter += value.doubleValue();
        return counter;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false;
        final ArrayContainer<?> other = (ArrayContainer<?>) obj;
        if (!Arrays.deepEquals(this.array, other.array)) return false;
        return true;
    }
    
    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public void cloneArray(T[] array) {
        this.array = array.clone();
    }
    
}
