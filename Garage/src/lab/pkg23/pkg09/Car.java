package lab.pkg23.pkg09;

import java.util.Scanner;

public class Car extends Vehicle{
    int seats;
    String body;
    
    Car(){
        super();  
        seats = 0;
        body = null;
    }
    
    Car(int engine, String registration, int seats, String body){
        this.init(engine, registration, seats, body);
    }
    
    void init(int engine, String registration, int seats, String body){
        super.init(engine, registration);
        this.seats = seats;
        this.body = body;        
    }
    
    @Override
    void input(){
        Scanner sc = new Scanner(System.in);    
        this.input(sc);
    }
    
    @Override
    void input(Scanner sc){
        super.input(sc);
        System.out.println("Enter seats number:");
        this.seats = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter body:");        
        this.body = sc.nextLine();
        sc.nextLine();
    }
    
    Car copy(Car car){
        this.engine = car.engine;
        this.registration = car.registration;
        this.seats = car.seats;
        this.body = car.body;
        return this;
    }
    
    @Override
    public String toString(){
        return "Car reg.: " + registration + ", engine: " + engine + ", seats: " + seats + ", body type: " + body;
    }
}
