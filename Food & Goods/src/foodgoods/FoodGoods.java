package foodgoods;

import java.util.Scanner;

public class FoodGoods {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Otdel o = new Otdel();
        o.input(sc);
        
        Food f = new Food();
        f.input(sc);
        
        o.addTovar(f);
        o.removeTovar(f);  
                
    }
}
