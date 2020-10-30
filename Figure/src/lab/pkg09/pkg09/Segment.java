package lab.pkg09.pkg09;

import java.util.Scanner;

public class Segment {
    Point p1, p2;
    
    Segment(double x1, double x2, double y1, double y2){
        p1 = new Point(x1, y1);
        p2 = new Point(x2, y2);
    }
    
    Segment(Point p1, Point p2){
        this.p1 = new Point(p1.x, p1.y);
        this.p2 = new Point(p2.x, p2.y);
    }
    
    Segment(){
        this.p1 = new Point();
        this.p2 = new Point();
    }
        
    void input(){   
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st point coordinates:");
        p1.input(sc);
        System.out.println("Enter 2nd point coordinates:");
        p2.input(sc);
    }
    
    double length(){
        double start = p1.x - p2.x;
        double end = p1.y - p2.y;
        return Math.sqrt(end*end + start*start);
    }
    
    Point get_point1(){
        return p1; 
    }
    
    Point get_point2(){
        return p2; 
    }
    
    @Override
    public String toString(){
        return ""+length();
    }
}
