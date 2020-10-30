package lab.pkg23.pkg09;

import java.util.Scanner;

public class Bus extends Vehicle {
    int seats;
    char comfort;
    
    Bus(){
        super();
        seats = 0;
        comfort = '-';
    }
    
    Bus(int engine, String registration, int seats, char comfort){
        this.init(engine, registration, seats, comfort);
    }
    
    void init(int engine, String registration, int seats, char comfort){
        super.init(engine, registration);
        this.seats = seats;
        this.comfort = comfort;        
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
        System.out.println("Enter comfort:");        
        this.comfort = sc.next().charAt(0);
        sc.nextLine();
    }
    
    Bus copy(Bus bus){
        this.engine = bus.engine;
        this.registration = bus.registration;
        this.seats = bus.seats;
        this.comfort = bus.comfort;
        return this;
    }
    
    @Override
    public String toString(){
        return "Bus reg.: " + registration + ", engine: " + engine + ", seats: " + seats + ", comfort class: " + comfort;
    }
}
