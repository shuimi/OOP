package zoo;

import java.util.Scanner;

public class TheZoo implements ZooAnimal.findIndex, ZooFish.findIndex, ZooSnake.findIndex {
    private recDate[] items;

    static public recDate inst(Object obj) throws Exc{
        if(obj instanceof recDate) return (recDate)obj;
        else throw new Exc(1, "obj isn't instance of recDate");
    }
    
    @Override
    public int getMyIndex(recDate t){
        try {return getIndex(t);}
        catch(Exc e){return -1;}
    }
    
    public TheZoo() {
        this.items = null;
    }
    
    public TheZoo(recDate[] items) {
        this.items = items;
    }

    public TheZoo(int amount) {
        this.items = new recDate[amount];
    }

    public recDate[] getItems() {
        return items;
    }

    public void setItem(recDate item, int index) throws Exc{
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
            temp.setCntx(this);
            add(obj);
        }else if(obj instanceof Fish){
            ZooFish temp;
            temp = (ZooFish) obj;
            temp.setRecDate(date);
            temp.setCntx(this);
            add(obj);
        }else if(obj instanceof Snake){
            ZooSnake temp;
            temp = (ZooSnake) obj;
            temp.setRecDate(date);
            temp.setCntx(this);
            add(obj);
        }
    }
    
    public void add(Object obj) throws Exc{
        recDate[] temp = new recDate[countItems() + 1];
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
            recDate[] temp = new recDate[countItems() - 1];
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
            this.items = new recDate[1];
            return 0;
        } 
        else return items.length;
    }
    
}
