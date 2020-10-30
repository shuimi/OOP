package foodgoods;

import java.util.Scanner;

public class Food extends Tovar{
    double expDate;
    String type;
    
    Food(){
        this(null, 0, null, 0, null);
    }

    Food(String name, int price, String prod, double expDate, String type){
        super(name, price, prod);
        this.expDate = expDate;
        this.type = type;
    }
    
    @Override
    void input(Scanner sc){
        super.input(sc);
        System.out.println("Food expDate: ");
        this.expDate = sc.nextDouble(); sc.nextLine();
        System.out.println("Food type: ");
        this.type = sc.nextLine();
    }
    
    @Override
    boolean equals(Tovar t) throws MyException {
        if(!(t instanceof Food)) throw new MyException(1, "not a food");
        return  this.name.equals(t.name) && 
                this.price == t.price && 
                this.prod.equals(t.prod) && 
                this.expDate == ((Food) t).expDate && 
                this.type.equals(((Food) t).type);
    }
    
}
