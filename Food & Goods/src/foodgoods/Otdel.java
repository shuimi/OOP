package foodgoods;

import java.util.Scanner;

public class Otdel {
    String name;
    private Tovar[] tovars;
    
    Otdel(){
        this(null, 0);
    }
    
    Otdel(String name, int amount){
        this.name = name;
        this.tovars = new Tovar[amount];
    }
    
    int count(){
        return (tovars == null) ? 0 : tovars.length;
    }
    
    void addTovar(){
        Scanner sc = new Scanner(System.in);
        addTovar(sc);
    }
    
    void addTovar(Scanner sc){
        System.out.println("Enter tovar type: ");
        String type = sc.nextLine();
        if ("goods".equals(type)) addTovar(new Goods());
        else if ("food".equals(type)) addTovar(new Food());
    }
    
    void addTovar(Tovar t){
        Scanner sc = new Scanner(System.in);
        if (t.name == null) t.input(sc);
        Tovar[] tovarsNew = new Tovar[count() + 1];
        System.arraycopy(this.tovars, 0, tovarsNew, 0, count());
        tovarsNew[count()] = t;
        this.tovars = tovarsNew;
    }
    
    void input(){
        Scanner sc = new Scanner(System.in);
        input(sc);
    }
    
    void input(Scanner sc){
        System.out.println("Otdel name: ");
        this.name = sc.nextLine();
        System.out.println("Tovars amount: ");
        int amount = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < amount; i++){
            addTovar(sc);
        }
    }
    
    int getIndex(Tovar t){
        for(int i = 0; i < count(); i++){
            try {
                if(this.tovars[i].equals(t)) return i;
            }
            catch (MyException e){
                System.out.println("err code: " + e.getErrorCode());
            }
        }
        return -1;
    }
    
    void removeTovar(int index) throws MyException{
        if (index < 0 || index > count()) throw new MyException(3, "index out of bounds");
        if(count() == 1) {
            this.tovars = null;
        }
        else{
            Tovar[] tovarsNew = new Tovar[count() - 1];
            for(int i = 0; i < index; i++) tovarsNew[i] = this.tovars[i];
            for(int i = index + 1; i < count(); i++) tovarsNew[i - 1] = this.tovars[i];
            this.tovars = tovarsNew;
        }
    }
    
    boolean removeTovar(Tovar t){
        try{
            removeTovar(getIndex(t));
            return true;
        }
        catch(MyException e){
            System.out.println("err in removeTovar, code: " + e.getErrorCode());
            return false;
        }
    }
}
