package elementaryschool;

import java.util.Scanner;

abstract public class Person {
    protected String fullName;
    
    Person(){
        this(null);
    }
    
    Person(String fullName){
        this.fullName = fullName;
    }
    
    void input(){
        Scanner sc = new Scanner(System.in);
        try{
            input(sc);
        }
        catch (Exc e){
            System.out.println(e.getErrorCode() + " " + e.getMessage());
        }
    }
    
    public void setFullName(String fullName){
        this.fullName = fullName;
    }
    
    public String getFullName(){
        return fullName;
    };
    
    abstract void input(Scanner sc) throws Exc;
    
}
