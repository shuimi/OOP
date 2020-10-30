package lab.pkg09.pkg09;

import java.util.Scanner;

public abstract class Figure3D extends Figure{
    double height;
    
    Figure3D(int size){
        super(size);
        System.out.println("Enter base: ");
        Scanner sc = new Scanner(System.in);
        super.input(sc);
        System.out.println("Enter height: ");        
        height=sc.nextDouble();
    }
    
    Figure3D(double height, Point points[]){
        super(points);
        this.height = height;
    }
    
    abstract double volume();
    
    abstract double surface_square();
    
}
