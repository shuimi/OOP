package elementaryschool;

import static java.lang.System.out;
import java.util.Scanner;

public class Child extends Person{
    private int age;
    private int height;
    private Parent mom;
    private Parent dad;
    
    Child(){
        this(null, 0, 0, null, null);
    }
    
    Child(String fullName, int age, int height, Parent mom, Parent dad){
        super(fullName);
        this.age = age;
        this.height = height;
        this.mom = mom;
        this.dad = dad;
    }
    
    @Override
    void input(Scanner sc) throws Exc {
        System.out.println("Name: "); this.fullName = sc.nextLine();
        System.out.println("Age: "); this.age = sc.nextInt(); sc.nextLine();       
        System.out.println("Height: "); this.height = sc.nextInt(); sc.nextLine();
        this.mom = new Parent(); this.mom.input(sc);
        this.dad = new Parent(); this.dad.input(sc);
    }
    
    public int getAge(){
        return this.age;
    }
    
    public int getHeight(){
        return this.height;
    }
    
    public Parent[] getParents(){
        Parent[] parents = new Parent[2];
        parents[0] = (new Parent()).copy(this.mom);
        parents[1] = (new Parent()).copy(this.dad);
        return parents;
    }
    
    public Parent getDad(){
        return this.dad;
    }
    
    public Parent getMom(){
        return this.mom;
    }
    
    public Child copy(Child child){
        this.fullName = child.fullName;
        this.height = child.height;
        this.age = child.age;
        this.dad = child.dad;
        this.mom = child.mom;
        return this;
    }
    
    public boolean equals(Child child){
        return this.fullName.equals(child.fullName) &&
                this.height == child.getHeight() &&
                this.age == child.getAge() &&
                this.mom.equals(child.getMom()) &&
                this.dad.equals(child.getDad());
    }
//    
    public void report(){
        out.println(this.fullName + "\n" + 
                this.height + "\n" + 
                this.age + "\n" + 
                this.dad.fullName  + "\n" + 
                this.mom.fullName);
    }
    
}
