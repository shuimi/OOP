package zoo;

import java.util.Scanner;

public class TheOceanarium {
    private oceanariumRecDate[] items;

    static public oceanariumRecDate inst(Object obj) throws Exc{
        if(obj instanceof oceanariumRecDate) return (oceanariumRecDate)obj;
        else throw new Exc(1, "obj isn't instance of oceanariumRecDate");
    }
    
    public TheOceanarium() {
        this.items = null;
    }
    
    public TheOceanarium(oceanariumRecDate[] items) {
        this.items = items;
    }

    public TheOceanarium(int amount) {
        this.items = new oceanariumRecDate[amount];
    }

    public oceanariumRecDate[] getItems() {
        return items;
    }

    public void setItem(oceanariumRecDate item, int index) throws Exc{
        if (index > 0 && index < items.length && items != null)
        this.items[index] = item;
        else throw new Exc(0, "no such item");
    }
    
    public void add() throws Exc{
        Scanner sc = new Scanner(System.in);
        add(sc);
    }
    
    public void add(Scanner sc) throws Exc{
        System.out.println("Enter type (animal, fish, snake):");
        String type = sc.nextLine();
        switch (type){
            case "animal" :{
                ZooAnimal temp = new ZooAnimal(); temp.input(); add(temp);
            }
            case "fish" :{
                ZooFish temp = new ZooFish(); temp.input(); add(temp);
            }
            case "snake" :{
                ZooSnake temp = new ZooSnake(); temp.input(); add(temp);
            }
        }
    }
    
    public void add(Object obj, int date) throws Exc{
        if (obj instanceof Animal) {
            ZooAnimal temp;
            temp = (ZooAnimal) obj;
            temp.setRecDate(date);
            add(obj);
        }else if(obj instanceof Fish){
            ZooFish temp;
            temp = (ZooFish) obj;
            temp.setRecDate(date);
            add(obj);
        }else if(obj instanceof Snake){
            ZooSnake temp;
            temp = (ZooSnake) obj;
            temp.setRecDate(date);
            add(obj);
        }
    }
    
    public void add(Object obj) throws Exc{
        oceanariumRecDate[] temp = new oceanariumRecDate[countItems() + 1];
        System.arraycopy(this.items, 0, temp, 0, countItems());
        temp[countItems() - 1] = inst(obj);
        this.items = temp;
    }
    
    public boolean remove(Object obj) throws Exc{
        return remove(getIndex(obj));
    }
    
    public boolean remove(int index) throws Exc{
        if(countItems() == 0) return false;
        else{
            oceanariumRecDate[] temp = new oceanariumRecDate[countItems() - 1];
            System.arraycopy(this.items, 0, temp, 0, index);
            System.arraycopy(this.items, index + 1, temp, index, countItems() - 1 - index);
            this.items = temp;
            return true;
        }
    }
    
    public int getIndex(Object obj) throws Exc{
        for (int i = 0; i < countItems(); i++) 
            if(inst(obj).equals(items[i])) return i;
        return -1;
    }
    
    public int countItems(){
        if (this.items == null){
            this.items = new oceanariumRecDate[1];
            return 0;
        } 
        else return items.length;
    }
    
}
