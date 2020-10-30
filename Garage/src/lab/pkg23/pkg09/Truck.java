package lab.pkg23.pkg09;

import java.util.Scanner;

public class Truck extends Vehicle{
    int tonnage;
    
    Truck(){
        super();
        tonnage = 0;
    }
    
    Truck(int engine, String registration, int tonnage){
        this.init(engine, registration, tonnage);
    }
    
    void init(int engine, String registration, int tonnage){
        super.init(engine, registration);
        this.tonnage = tonnage;
    }
    
    Truck copy(Truck truck){
        this.engine = truck.engine;
        this.registration = truck.registration;
        this.tonnage = truck.tonnage;
        return this;
    }
    
    @Override
    void input(){
        Scanner sc = new Scanner(System.in);    
        this.input(sc);
    }
    
    @Override
    void input(Scanner sc){
        super.input(sc);
        System.out.println("Enter tonnage");
        this.tonnage = sc.nextInt();
        sc.nextLine();
    }
    
    @Override
    public String toString(){
        return "Truck reg.: " + registration + ", engine: " + engine + ", tonnage: " + tonnage;
    }
}
