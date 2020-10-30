package zoo;

import static java.lang.System.out;

public class Zoo {

    public static void main(String[] args) {
        
        recDate f[] = {
            new ZooFish(18, "s", "d", true, 1), 
            new ZooFish(92, "f", "w", false, 1), 
            new ZooFish(11, "g", "d", false, 2), 
            new ZooFish(12, "j", "s", false, 3),
            new ZooAnimal(1, "e", "w", 129, 'm'),
            new ZooAnimal(2, "D", "k", 19, 'f'),
            new ZooAnimal(5, "t", "j", 10, 'f'),
            new ZooAnimal(8, "r", "h", 12, 'm'),
            new ZooSnake(12, "e", false, 12),
            new ZooSnake(18, "U", true, 22),
            new ZooSnake(9, "p", false, 52),
            new ZooSnake(4, "t", true, 35)
        };
        
        oceanariumRecDate g[] = {
            new ZooFish(18, "s", "d", true, 1), 
            new ZooFish(92, "f", "w", false, 1), 
            new ZooFish(11, "j", "d", false, 2), 
            new ZooFish(12, "j", "d", false, 3),
            new ZooSnake(12, "e", false, 12),
            new ZooSnake(18, "U", true, 22),
            new ZooSnake(9, "p", false, 52),
            new ZooSnake(4, "t", true, 35)
        };
        
        try{
            
//            TheZoo z = new TheZoo(f);
//            TheOceanarium o = new TheOceanarium(g);
//            for(recDate i : f) z.remove(i);
//            for(oceanariumRecDate i : g) o.remove(i);
                
            GenericZoo<recDate> a = new GenericZoo<>(f);
            System.out.println(a.getThisKindAmount(new ZooSnake(12, "e", false, 12)));
            GenericOceanarium<oceanariumRecDate> b = new GenericOceanarium<>(g);
            System.out.println(b.getThisKindAmount(new ZooFish(12, "j", "d", false, 3)));
        
        }
        catch(Exc e){
            out.println(e.getErrorCode() + ", " + e.getMessage());
        }
    }
    
}
