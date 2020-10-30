package lab.pkg23.pkg09;

import java.util.Scanner;

public class Garage {

    Vehicle vehicles[];    
    String adress;
    int capacity;
    private int Trucks, Buses, Cars;
    
    Garage(){
        this.init("", 0);
    }
    
    Garage(String adress, int capacity){
        this.init(adress, capacity);        
    }
    
    void init(String adress, int capacity){
        this.adress = adress;
        this.capacity = capacity;
        this.vehicles = null;
        this.Trucks = 0;
        this.Buses = 0;
        this.Cars = 0;
    }
    
    void addVehicle(){
        Scanner sc = new Scanner(System.in);    
        this.addVehicle(sc);        
    }
    
    void addVehicle(Scanner sc){
        if(getVehiclesAmount() == vehicles.length){
            System.out.println("Garage is full."); return;
        }
        System.out.println("Enter vehicle type:");
        String vehicleType = sc.nextLine();
        switch(vehicleType){
            case "Truck" -> {
                this.vehicles[getVehiclesAmount()] = new Truck(); Trucks++;     
            }
            case "Bus" -> {
                this.vehicles[getVehiclesAmount()] = new Bus(); Buses++;
            }
            case "Car" -> {
                this.vehicles[getVehiclesAmount()] = new Car(); Cars++;
            }
        }
        if (getVehiclesAmount()!=0) this.vehicles[getVehiclesAmount() - 1].input(sc);
        else this.vehicles[0].input(sc);
    }
    
    void input(){
        Scanner sc = new Scanner(System.in);    
        this.input(sc);
    }  
    
    void input(Scanner sc){

        System.out.println("Enter Garage adress:");
        this.adress = sc.nextLine();        
        System.out.println("Enter Garage capacity:");
        this.capacity = sc.nextInt(); sc.nextLine();        
        System.out.println("Enter vehicles amount:");
        int amount = sc.nextInt(); sc.nextLine();
        
        vehicles = new Vehicle[capacity];
        
        if(amount <= this.capacity){
            for(int i = 0; i < amount; i++){
                this.addVehicle();
            }   
        }
        else {
            System.out.println("Incorrect input"); return;
        }
    }
    
    Garage copy(Garage Garage){
        this.adress = Garage.adress;
        this.capacity = Garage.capacity;
        System.arraycopy(this.vehicles, 0, Garage.vehicles, 0, Garage.vehicles.length);
        this.Buses = Garage.Buses;
        this.Cars = Garage.Cars;
        this.Trucks = Garage.Trucks;
        return this;
    }
    
    int getCapacity(){
        return this.vehicles.length;
    }
    
    int getVehiclesAmount(){
        return getTrucksAmount() + getCarsAmount() + getBusesAmount();         
    }
        
    int getTrucksAmount(){
        return this.Trucks;
    }
    
    int getCarsAmount(){
        return this.Cars;  
    }
    
    int getBusesAmount(){
        return this.Buses;  
    }
    
    Car[] getCars(){
        int n = 0;
        Car[] result = new Car[getCarsAmount()];
        for (int i = 0; i < getVehiclesAmount(); i++) {
            if(vehicles[i] instanceof Car){
               result[n++]=(new Car()).copy((Car) vehicles[i]);
            }
        }
        return result;
    }
    
    Truck[] getTrucks(){
        int n = 0;
        Truck[] result = new Truck[getTrucksAmount()];
        for (int i = 0; i < getVehiclesAmount(); i++) {
            if(vehicles[i] instanceof Truck){
               result[n++]=(new Truck()).copy((Truck) vehicles[i]);
            }
        }
        return result;
    }
    
    Bus[] getBuses(){
        int n = 0;
        Bus[] result = new Bus[getBusesAmount()];
        for (int i = 0; i < getVehiclesAmount(); i++) {
            if(vehicles[i] instanceof Bus){
               result[n++]=(new Bus()).copy((Bus) vehicles[i]);
            }
        }
        return result;
    }
    
    boolean checkByReg(String registration){
        for (Vehicle v : vehicles) {
            if(v.registration.equals(registration)) return true;
        }
        return false;
    } 
    
    void output(){
        System.out.println(adress + ";\nGarage Report:\nTrucks: " + getTrucksAmount() + "\nCars: " + getCarsAmount() + "\nBuses: " + getBusesAmount() + "\n");
    }
    
    void outputBuses(){
        Bus[] b = this.getBuses();
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
    
    void outputCars(){
        Car[] c = this.getCars();
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }    

    void outputTrucks(){
        Truck[] t = this.getTrucks();
        for (int i = 0; i < t.length; i++) {
            System.out.println(t[i]);
        }
    }    
    
    @Override
    public String toString(){
        return adress + ";\nGarage Report:\nTrucks: " + getTrucksAmount() + "\nCars: " + getCarsAmount() + "\nBuses: " + getBusesAmount() + "\n";
    }
}