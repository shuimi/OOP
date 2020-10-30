package lab.pkg09.pkg09;

public class Prism extends Figure3D{
    
    Prism(int size){
        super(size);
    }
    
    double base_square(){
        return super.square();
    }
    
    @Override
    double volume(){
        return base_square() * super.height;
    }
    
    @Override
    double surface_square(){
        double side_surface = 0;
        for(int i = 0; i < super.size - 1; i++){
            side_surface += (new Segment(points[i], points[i + 1])).length() * super.height;
        }
        return 2 * base_square() + side_surface;    
    }

    @Override
    void key() {}
    
}
