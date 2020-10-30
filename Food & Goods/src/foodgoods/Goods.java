package foodgoods;

import java.util.Scanner;

public class Goods extends Tovar{
    String country;
    
    Goods(){
        this(null, 0, null, null);
    }

    Goods(String name, int price, String prod, String country){
        super(name, price, prod);
        this.country = country;
    }
    
    @Override
    void input(Scanner sc){
        super.input(sc);
        System.out.println("Good country: ");
        this.country = sc.nextLine();
    }
    
    @Override
    boolean equals(Tovar t) throws MyException {
        if(!(t instanceof Goods)) throw new MyException(2, "not a good");
        return  this.name.equals(t.name) && 
                this.price == t.price && 
                this.prod.equals(t.prod) &&
                this.country.equals(((Goods) t).country);
    }
        
}
