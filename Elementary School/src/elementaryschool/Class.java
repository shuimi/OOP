package elementaryschool;

import static java.lang.System.out;

public class Class {
    int term;
    int amount;
    String index;
    Child[] childs;
    
    Class(){
        this(0, null);
    }
    
    Class(int term, String index){
        this.term = term;
        this.amount = 0;
        this.index = index;

    }
    
    public void addChild() throws Exc{
        Child child = new Child();
        child.input();
        addChild((new Child()).copy(child));
    }
    
    public void addChild(Child child) throws Exc{
        if(child.fullName == null)
            throw new Exc(0, "name is null");
        if(child.getAge() < 6 || child.getAge() > 18) 
            throw new Exc(0, "incorrect age");
        if(child.getHeight() < 80 || child.getHeight() > 180)
            throw new Exc(0, "incorrect height");
        if  (
                !child.getMom().gender.equals("female") || 
                !child.getDad().gender.equals("male")
            ) 
            throw new Exc(1, "incorrect parents info");
        if(term == 1 && child.getAge() > 7) 
            throw new Exc(9, "age is over 7 for term 1");
        else
        if(term == 2 && (child.getAge() < 7 ||  child.getAge() > 8)) 
            throw new Exc(9, "age is over 8 for term 2");
        else
        if(term == 3 && (child.getAge() < 8 ||  child.getAge() > 9)) 
            throw new Exc(9, "age is over 9 for term 3");
        else
        if(amount == 30) throw new Exc(1, "class is full");
        else
        if(childs == null) {
            childs = new Child[1];
            childs[0] = child;
        }
        else{
            Child[] temp = new Child[childs.length + 1];
            System.arraycopy(childs, 0, temp, 0, childs.length);
            temp[childs.length] = child;
            childs = temp;
            amount++;
        }
    }
    
    public int getChildIndex(Child child){
        for(int i = 0; i < 30; i++){
            if(childs[i] != null && childs[i].equals(child)) return i;
        }
        return -1;
    }
    
    public void removeChild(Child child) throws Exc{
        if(childs == null) throw new Exc(2, "class is empty");
        else{
            int childIndex = getChildIndex(child);
            if (childIndex == -1) throw new Exc(3, "non-existent item removing");            
            
            Child[] temp = new Child[childs.length - 1];
            
            System.arraycopy(childs, 0, temp, 0, childIndex);
            System.arraycopy(childs, childIndex + 1, temp, childIndex + 1, childs.length);
            
            this.childs = temp;
            amount--;
        }
    }
    
    String getIndex(){
        if(index == null) return "no index";
        return index;
    }
    
    public void reportChilds(){
        for(int i = 0; i < 30; i++){
            if(childs[i] != null) childs[i].report();
        }
    }
}
