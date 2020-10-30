package genericlab;

public class GenericLab {

    public static void main(String[] args) {
        
        Integer[] a = {3, 2, 2, 1, 1, 4, 5, 5};
        Double[] b = {1.5, 2.5, 3.3, 9.7, 9.7, 9.7};
        
        ArrayContainer<Integer> arr1 = new ArrayContainer<>(a);
        ArrayContainer<Double> arr2 = new ArrayContainer<>(b);
        
        try{
            System.out.println(arr1.minElementsAmount() + "\n" + arr2.maxElementsAmount());            
        }
        catch(Exc e){
            System.out.println(e.getErrorCode() + e.getMessage());
        }
        
    }
    
}
