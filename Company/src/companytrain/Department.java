package companytrain;

import java.util.Scanner;

public class Department {
    String name;
    private Worker workers[];
    private int capacity;
    private int currentAmount;
    
    Department(){
        this.name = null;
        this.workers = null;
        this.capacity = 0;
        this.currentAmount = 0;
    }
    
    Department(String name, int capacity){
        this.name = name;
        this.workers = new Worker[capacity];
        this.capacity = capacity;
        this.currentAmount = 0;
    }
    
    void init(){
        Scanner sc = new Scanner(System.in);
        init(sc);
    }
    
    void init(Scanner sc){
        System.out.println("Enter department name:");
        this.name = sc.nextLine();
        System.out.println("Enter capacity:");
        this.capacity = sc.nextInt();
        this.workers = new Worker[capacity];
    }
    
    void addWorker(Worker person){
        Worker workersPlus[] = new Worker[this.workers.length + 1];
        for (int i = 0; i < this.workers.length; i++){
            workersPlus[i] = this.workers[i];
        }
        workersPlus[this.workers.length] = (new Worker()).copy(person);
        this.workers = workersPlus;
        currentAmount++;
    }
    
    void input(){
        Scanner sc = new Scanner(System.in);
        input(sc);
    }
    
    void input(Scanner sc){
        if(this.name == null && this.capacity == 0){
            this.init(sc);
        }
        
        boolean getting = true;
        
        while(getting){
            
            System.out.println("Enter workers amount:");
            int workers = sc.nextInt();
            
            if(workers <= this.capacity){
                for(int i = 0; i < workers; i++){
                    Worker person = new Worker();
                    person.input(sc);
                    this.addWorker(person);
                }
                getting = false;
            }
            else{
                System.out.println("The number of employees is exceeded.");
            }            
        }
    }
    
    int getCapacity(){
        return this.capacity;
    }
    
    int getCurrentAmount(){
        return this.currentAmount;
    }
    
    Worker[] getWorkers(){
        Worker workersCopy[] = new Worker[this.workers.length];
        for(int i = 0; i < this.workers.length; i++){
            workersCopy[i] = (new Worker()).copy(this.workers[i]);
        }
        return workersCopy;
    }
    
    boolean checkByName(String name){
        for(int i = 0; i < count(); i++){
            if (workers[i] != null) if(workers[i].name.equals(name)) return true;
        }
        return false;
    }
    
    Worker getByName(String name){
        for(int i = 0; i < count(); i++){
            if(workers[i].name.equals(name)) return (new Worker()).copy(workers[i]);
        }
        return null;
    }
    
    Department copy(Department D){
        this.name = D.name;
        this.capacity = D.capacity;
        this.currentAmount = D.currentAmount;
        this.workers = D.getWorkers();
        return this;
    }    
    
    void report(){
        System.out.println(this);
    }
    
    int count(){
        if(this.workers == null) return 0; 
        else return this.workers.length;
    }
    
    @Override
    public String toString(){
        return this.name + " department:\ncapacity: " + this.capacity + "\nworkers current amount: " + this.currentAmount;
    }
}
