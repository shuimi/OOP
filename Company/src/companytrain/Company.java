package companytrain;

import java.util.Scanner;

public class Company {
    String name;
    private int departmentsAmount;
    private Department departments[];
    
    Company(){
        this.name = null;
        this.departmentsAmount = 0;
        this.departments = null;
    }
    
    Company(String name, int departmentsAmount){
        this.name = name;
        this.departmentsAmount = departmentsAmount;      
        this.departments = new Department[departmentsAmount];
    }
    
    void init(){
        Scanner sc = new Scanner(System.in);
        init(sc);
    }
    
    void init(Scanner sc){
        System.out.println("Enter company name:");
        this.name = sc.nextLine();
    }
    
    void addDepartment(){
        Department depPlus[] = new Department[count() + 1];
        for (int i = 0; i < count(); i++){
            depPlus[i] = this.departments[i];
        }
        depPlus[count()] = new Department();
        depPlus[count()].input();        
        this.departments = depPlus;
    }
    
    void input(Scanner sc){
        if(this.name == null){
            this.init(sc);
        }
        System.out.println("Enter departments amount to add:");
        int deps = sc.nextInt();
        for(int i = 0; i < deps; i++){
            this.addDepartment();
        }
    }
    
    void searchByName(String name){
        for(int i = 0; i < departments.length; i++){
            if(departments[i].checkByName(name)){
                System.out.println(departments[i] + "\n" + name + " found.");
                return;
            }
        }
        System.out.println(name + " is not found.");        
    }
    
    int count(){
        if(this.departments == null) return 0; 
        else return this.departments.length;
    }
    
    @Override
    public String toString(){
        return this.name + " Inc.";
    }
    
}
