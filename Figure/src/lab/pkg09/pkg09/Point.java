package lab.pkg09.pkg09;

import java.util.Scanner;

public class Point {
    double x, y;
    
    void init(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    Point(){
        this(-1,-1);
    }
    
    void input(){
        System.out.println("Enter Point coordinates: ");       
        Scanner sc = new Scanner(System.in);
        System.out.println("x: "); this.x = sc.nextDouble();
        System.out.println("y: "); this.y = sc.nextDouble();
    }
    
    void input(Scanner sc){
        System.out.println("Enter Point coordinates: ");       
        System.out.println("x: "); this.x = sc.nextDouble();
        System.out.println("y: "); this.y = sc.nextDouble();
    }
    
    double get_x(){
        return this.x;
    }
    
    double get_y(){
        return this.y;
    }
    
    @Override
    public String toString(){
        return "x = " + this.x + " y = " + this.y;
    }
}
