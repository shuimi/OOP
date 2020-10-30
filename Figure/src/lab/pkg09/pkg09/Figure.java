package lab.pkg09.pkg09;

import java.util.Scanner;

public abstract class Figure {
    Point points[];
    final int size;
    
//    Figure(){
//        this.points = null;
//    }
        
    Figure(int points_amount){
        size = points_amount; //size меняется 1 раз, тк final
        this.points = new Point[points_amount];
    }
    //if можно не писать в силу того что конструктор работает 1 раз
    Figure(Point points[]){
        this(points.length);
            for (int current_point = 0; current_point < points.length; current_point++){
            this.points[current_point] = new Point(points[current_point].x, points[current_point].y);
        }
    }
    
    void input(Scanner sc){
        System.out.println("Enter " + points.length + "-angled figure");
        for (int current_point = 0; current_point < points.length; current_point++){
           (this.points[current_point] = new Point()).input(sc);
        }
    }
    
    void input(){
        System.out.println("Enter " + points.length + "-angled figure");
        Scanner sc = new Scanner(System.in);
        for (int current_point = 0; current_point < points.length; current_point++){
           (this.points[current_point] = new Point()).input(sc);
        }
    }
    
    void output(){
        for(Point current_point : points){
            System.out.println(current_point);
        }
    }
    
    double square(){
        double sqr = 0;
        for (int current_point = 0; current_point < points.length - 2; current_point++){
            double a = new Segment(points[current_point], points[current_point + 1]).length();
            double b = new Segment(points[current_point], points[current_point + 2]).length();
            double c = new Segment(points[current_point + 1], points[current_point + 2]).length();
            double p = 0.5 * (a + b + c);
            sqr += Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return sqr;
    }
    
    double perimeter(){
        double summ = 0.0;
        for (int i = 0; i <= this.points.length-1; i++){
            Segment AB;
            if (i >= this.points.length - 1){
                AB = new Segment(this.points[i],this.points[0]);
                summ += AB.length();
            }
            else{
                AB = new Segment(this.points[i],this.points[i+1]);                
            }
            summ += AB.length();            
        }
        return summ;
    }
    
    abstract void key();
}   
