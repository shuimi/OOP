package lab.pkg23.pkg09;

import java.util.Scanner;

public class Parking {
    
    private Garage[] Garages;
    
    Parking(){
        Garages = null;
    }
    
    Parking(int size){
        init(size);
    }
    
    void init(int size){
        this.Garages = new Garage[size];    
    }
    
    int count(){
        if(Garages != null){
            return Garages.length;
        }
        else return 0;
    }
    
    Garage getElement(int number){
        if(number > 0 && number <= count() && Garages[number] != null){
            return Garages[number];
        }
        else return null;
    }
    
    void newGarage(){
        Garage[] temporaryGarages = new Garage[count() + 1];
        if (count() != 0)System.arraycopy(this.Garages, 0, temporaryGarages, 0, count());
        temporaryGarages[count()] = new Garage();
        temporaryGarages[count()].input();
        this.Garages = temporaryGarages;
    }
        
    void newGarage(String adress, int capacity){
        Garage[] temporaryGarages = new Garage[count() + 1];
        System.arraycopy(this.Garages, 0, temporaryGarages, 0, count());
        temporaryGarages[count()] = new Garage();
        temporaryGarages[count()].init(adress, capacity);
        this.Garages = temporaryGarages;
    }
    
    Garage getGarageByVehReg(String registration){
        for (Garage g : Garages){
            if (g.checkByReg(registration)){
                System.out.println(g.adress);
                return g;
            }
        }
        System.out.println("Not found!");
        return null;        
    }
    
    Garage[] getParking(){
        int n = 0;
        Garage[] result = new Garage[count()];
        for (int i = 0; i < count(); i++) {
            if (Garages[i] != null) result[n++] = (new Garage()).copy((Garage) Garages[i]);
        }
        return result;
    }   
}