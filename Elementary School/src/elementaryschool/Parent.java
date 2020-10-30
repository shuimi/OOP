package elementaryschool;

import java.util.Scanner;

public class Parent extends Person{
    String gender;
    
    Parent(){
        this(null, null);
    }
    
    Parent(String fullName, String gender){
        super(fullName);
        this.gender = gender;
    }
    
    @Override
    void input(Scanner sc) throws Exc{
        System.out.println("Name: "); this.fullName = sc.nextLine();
        if(this.fullName == null) 
            throw new Exc(0, "incorrect name input");
        System.out.println("Gender: "); this.gender = sc.nextLine();
                if(!this.gender.equals("male") && !this.gender.equals("female")) 
                    throw new Exc(0, "incorrect input");
    }
    
    public Parent copy(Parent parent){
        this.fullName = parent.fullName;
        this.gender = parent.gender;
        return this;
    }
    
    public boolean equals(Parent parent){
        return this.fullName.equals(parent.fullName) &&
               this.gender.equals(parent.gender);
    }
}
