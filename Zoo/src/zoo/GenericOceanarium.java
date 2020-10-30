package zoo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class GenericOceanarium <T extends oceanariumRecDate>{
    private ArrayList<T> items = null;

    public GenericOceanarium(T[] items) {
        this.items = new ArrayList<T>();
        for(int i = 0; i < items.length; i++) this.items.add(items[i]);
    }

    public void add(T item){
        items.add(item);
    }

    public int getSize(){
        return items.size();
    }
    
    public int getThisKindAmount(Object obj) throws Exc{
        int counter = 0;
        if(obj instanceof ZooAnimal){
            for(oceanariumRecDate item : items){
                if(item instanceof ZooAnimal){
                    if(((ZooAnimal)item).getKind().equals(((ZooAnimal)obj).getKind())){
                        counter++;
                    }
                };
            }
        }
        else if(obj instanceof ZooFish){
            for(oceanariumRecDate item : items){
                if(item instanceof ZooFish){
                    if(((ZooFish)item).getType().equals(((ZooFish)obj).getType())){
                        counter++;
                    }                
                };
            }
        }
        else if(obj instanceof ZooSnake){
            for(oceanariumRecDate item : items){
                if(item instanceof ZooSnake){
                    if(((ZooSnake)item).isEatable() == ((ZooSnake)obj).isEatable()){
                        counter++;
                    }                
                };
            }            
        }
        else throw new Exc(0, "");
        return counter;
    }
    
}
