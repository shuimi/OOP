package lab.pkg23.pkg09;

import java.util.Scanner;

abstract public class Vehicle {
    int engine;
    String registration;
    
    Vehicle(){
        this.init(0, null);
    }
    
    Vehicle(int engine, String registration){
        this.init(engine, registration);
    }
    
    void init(int engine, String registration){
        this.engine = engine;
        this.registration = registration;
    }
    
    void input(){
        Scanner sc = new Scanner(System.in);    
        input(sc);
    }
    
    void input(Scanner sc){
        System.out.println("Enter vehicle reg.:");
        this.registration = sc.nextLine();
        System.out.println("Enter engine power:");        
        this.engine = sc.nextInt();        
    }
    
    @Override
    public String toString(){
        return "Vehicle reg.: " + registration + ", engine: " + engine;
    }
}
