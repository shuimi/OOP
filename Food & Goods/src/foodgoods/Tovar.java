package foodgoods;

import java.util.Scanner;

abstract public class Tovar {
    String name;
    int price;
    String prod;
    
    Tovar(){
        this(null, 0, null);
    }
    
    Tovar(String name, int price, String prod){
        this.name = name;
        this.price = price;
        this.prod = prod;
    }
    
    void input(Scanner sc){
        System.out.println("Tovar name: ");
        this.name = sc.nextLine();
        System.out.println("Tovar price: ");
        this.price = sc.nextInt(); sc.nextLine();
        System.out.println("Tovar prod: ");
        this.prod = sc.nextLine();
    }
    
    abstract boolean equals(Tovar t) throws MyException;
    
}
