package elementaryschool;

public class School {
    String name;
    private Class[] classes;
    private int amount;
    
    School(){
        this.name = null;
        this.classes = null;
    }
    
    School(String name, int amount){
        this.name = name;
        this.classes = new Class[amount];
    }
    
    public void addClass(Class sClass) throws Exc{
        if(amount == 15) throw new Exc(5, "school is full");
        if(classes == null) {
            classes = new Class[1];
            classes[0] = sClass;
        }
        else{
            Class[] temp = new Class[classes.length + 1];
            System.arraycopy(classes, 0, temp, 0, classes.length);
            temp[classes.length] = sClass;
            this.classes = temp;
            amount++;
        }
    }

    public void addClass() throws Exc{
        addClass(new Class());
    }
    
    public void removeClass(Class sClass) throws Exc{
        if(classes == null) throw new Exc(6, "school is empty");
        if(classes.length == 1 && classes[0].equals(sClass)) classes = null;
        else{
            int classIndex = getClassIndex(sClass);
            if (classIndex == -1 || classes[classIndex] == null) 
                throw new Exc(3, "non-existent item removing");            
            
            Class[] temp = new Class[classes.length - 1];
            
            System.arraycopy(classes, 0, temp, 0, classIndex);
            System.arraycopy(classes, classIndex + 1, temp, classIndex + 1, classes.length);
            
            this.classes = temp;
            amount--;
        }        
    }
    
    public int getClassIndex(Class sClass) throws Exc{
        for(int i = 0; i < classes.length; i++){
            if(
                classes[i] != null && 
                classes[i].index.equals(sClass.index) &&
                classes[i].term == sClass.term    
                ) 
            return i;
        }
        return -1;        
    }
    
    Class getClass(int index) throws Exc{
        if(index < 0 || index > classes.length) 
            throw new Exc(4, "getting non-existant class, index out of bounds"); 
        return classes[index];
    }
}
