package companytrain;

import java.util.Scanner;

abstract class Human {
    String name;
    int age;
    
    Human(){
        this.init(null, 0);
    }
    
    Human(String name, int age){
        this.init(name, age);
    }
    
    void init(String name, int age){
        this.age = age;
        this.name = name;
    }
    
    void input(){
        Scanner sc = new Scanner(System.in);
        input(sc);
    }
    
    void input(Scanner sc){
        sc.nextLine();
        System.out.println("Enter NAME:");
        this.name = sc.nextLine();
        System.out.println("Enter AGE:");
        this.age = sc.nextInt();
    }
    
    @Override
    public String toString(){
        return "NAME: " + name + "\nAGE: " + age;
    }
}
