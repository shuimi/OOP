package elementaryschool;

import java.util.Scanner;
import static java.lang.System.*;

//класс начальная_школа:          
    //1 класс 6-7 лет, 2 класс 7-8 лет, 3 класс 8-9 лет
    //в каждом классе не может быть больше 30 человек
    //все ошибочные данные генерируют исключения

//класс человек: ФИО
    //класс ребёнок: 
        //возраст > 6 & < 18, 
        //рост > 50 & < 180, 
        //мама, 
        //папа
    //класс родитель: 

public class ElementarySchool {

    public static void main(String[] args) {
        
        try{
            School school = new School();
            
            Parent m1 = new Parent("Ivan", "male");
            Parent f1 = new Parent("Anna", "female");
            Parent m2 = new Parent("Oleg", "male");
            Parent f2 = new Parent("Laura", "female");
            
            Child c1 = new Child("Vasya", 7, 140, f1, m1);
            Child c2 = new Child("Sasha", 8, 135, f2, m2);
            Child c3 = new Child("Tanya", 7, 135, f2, m2);

            Class a = new Class(1, "A"); 
            Class b = new Class(2, "A"); 
            Class c = new Class(2, "B"); 
            
            a.addChild(c1);
            b.addChild(c3);
            c.addChild(c2);
            
            school.addClass(c);
            school.removeClass(c);
        }
        catch(Exc e){
            out.println(e.getErrorCode() + ", " + e.getMessage());
        }
       
    }
    
}
