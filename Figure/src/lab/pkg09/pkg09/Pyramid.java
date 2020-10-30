package lab.pkg09.pkg09;

public class Pyramid extends Figure3D {
    Point top;
    
    Pyramid(int size){
        super(size);
        System.out.println("Enter Pyramid top: ");
        top = new Point();
        top.input();
    }
    
    double base_square(){
        return super.square();
    }
    
    @Override
    double volume() {
        return super.height * base_square() / 3;
    }

    @Override
    double surface_square() {
        double bot = new Segment(this.points[0],this.points[1]).length();
        double dist = Math.abs((this.points[1].y - this.points[0].y)*this.top.x - (this.points[1].x - this.points[0].x)*this.top.y + this.points[1].x*this.points[0].y - this.points[1].y*this.points[0].x )/bot;
        double side = Math.sqrt(dist*dist + this.height*this.height) * 0.5 * super.perimeter();
        return base_square() + side;
    }

    @Override
    void key() {}
    
}
